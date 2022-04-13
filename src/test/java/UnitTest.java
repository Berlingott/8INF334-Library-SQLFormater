import SQLFormater.Querry.Querry;
import SQLFormater.Querry.Select;
import SQLFormater.Querry.Table;
import SQLFormater.SQLFormater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
/**
 * Requête:
 * Résultat attendu:
 */
public class UnitTest {
    /**
     * Requête: simple SQLFormater.Querry.Select
     * Résultat attendu:
     *SELECT(Prenom, Nom)
     *From eleves
     */
    @Test
    void BasicSelect_Test() {
        String expectedResult_simpleSelect =    "SELECT(Prenom, Nom)\n" +
                                                "From eleves;";
        // Assertions.assertEquals(1,1);
        //Assertions.assertEquals(1,2); // montre une erreur, assure que le test est fonctionnel
        SQLFormater sqlformater = new SQLFormater();
        Select querry = sqlformater.Select(sqlformater.arg("Prenom", "Nom" ),sqlformater.table("eleves", sqlformater.arg("Prenom", "Nom")));
        Assertions.assertEquals(expectedResult_simpleSelect, querry.requestQuerry());
    }
    /**
     * Requête: simple SQLFormater.Querry.Select
     * Résultat attendu:
     *SELECT(Prenom, Nom, Age, Classe)
     *From eleves
     */
    @Test
    void BasicSelectWithMoreThanTwoArg() {
        String expectedResult_simpleSelect =    "SELECT(Prenom, Nom, Age, Classe)\n" +
                "From eleves;";
        // Assertions.assertEquals(1,1);
        //Assertions.assertEquals(1,2); // montre une erreur, assure que le test est fonctionnel
        SQLFormater sqlformater = new SQLFormater();
        Select querry = sqlformater.Select(sqlformater.arg("Prenom", "Nom", "Age", "Classe"),sqlformater.table("eleves", sqlformater.arg("Prenom", "Nom", "Age", "Classe")));
        Assertions.assertEquals(expectedResult_simpleSelect, querry.requestQuerry());
    }

    /**
     * Requête: SQLFormater.Querry.Select With condition where
     * Résultat attendu:
     * SELECT(Prenom, Nom)
     * From eleves
     * WHERE Nom = 'Simon'
     */
    @Test
    void SelectWithConditionWhere(){
        String expectedResult_SelectWithConditionWhere = """
                SELECT(Prenom, Nom)
                From eleves
                WHERE Nom = 'Simon';""";
        SQLFormater sqlformater = new SQLFormater();
        var querry = sqlformater.Select(sqlformater.arg("Prenom", "Nom"),sqlformater.table("eleves", sqlformater.arg("Prenom", "Nom")));
        var wherecondition = sqlformater.Wherecon("Nom","'Simon'","=");
        querry.addToQuerry(wherecondition.get_condition());
        String request = querry.requestQuerry();
        Assertions.assertEquals(expectedResult_SelectWithConditionWhere, request);

    }
    /**
     * Requête: SQLFormater.Querry.Select With Double condition where
     * Résultat attendu:
     * SELECT(Prenom, Nom)
     * From eleves
     * WHERE Nom = 'Simon'
     * AND
     * WHERE Age = 26
     */
    @Test
    void SelectWithDoubleConditionWhere(){
        String expectedResult_SelectWithDoubleConditionWhere = """
                SELECT(eleves.Prenom, eleves.Nom, eleves.Age, eleves.Classe)
                From eleves
                WHERE eleves.Nom = 'Simon'
                AND
                WHERE eleves.Age = 26;""";
        var sqlformater = new SQLFormater();

        var tableetudiant = new Table("eleves",sqlformater.arg("Prenom", "Nom", "Age", "Classe"));

        var wherecondition = sqlformater.Wherecon(tableetudiant.get_columnbyname("Nom"),"'Simon'","=");
        var secondwherecondition = sqlformater.Wherecon(tableetudiant.get_columnbyposition(2),"26","=");

        var querry = sqlformater.Select(tableetudiant.get_columns(), tableetudiant);
        tableetudiant.get_tableName();
        querry.addToQuerry((wherecondition.get_condition() + sqlformater.AND(secondwherecondition.get_condition())));

        String request = querry.requestQuerry();
        Assertions.assertEquals(expectedResult_SelectWithDoubleConditionWhere, request);


    }
    /**
     * Requête: Création d'un table, nous pourrons réutiliser cette table par la suite
     * Résultat attendu: une table classe
     */
    @Test
    void CompareTable(){
        SQLFormater sqlformater = new SQLFormater();
        Table expectedTable = new Table("eleves");
        Assertions.assertEquals(expectedTable.get_tableName(), sqlformater.table("eleves").get_tableName());
    }
    /**
     * Requête: Test de la fonction HAVING
     * Résultat attendu:
     * SELECT
     */
    @Test
    void GroupBy() {
        String expectedResult_SelectWithhaving = """
                SELECT(Nom, Prenom, Classe)
                From Eleves
                GROUP BY Classes;""";
        var sqlformater = new SQLFormater();
        var tableeleves = sqlformater.table("Eleves",sqlformater.arg("Prenom", "Nom", "Age", "Classe"));
        var querry = sqlformater.Select(sqlformater.arg("Nom", "Prenom", "Classe"), tableeleves);
        var groupbyclasse = sqlformater.groupby(sqlformater.arg("Classes"));
            querry.addToQuerry(groupbyclasse.get_condition());

        Assertions.assertEquals(expectedResult_SelectWithhaving, querry.requestQuerry());
    }
    /**
     *
     */
    @Test
    void OrderByASC() {
        String expectedResult_SelectWithhaving = """
                SELECT(Nom, Prenom, Classe, Age)
                From Eleves
                ORDER BY Age ASC;""";
        var sqlformater = new SQLFormater();
        var tableeleves = sqlformater.table("Eleves",sqlformater.arg("Prenom", "Nom", "Classe", "Age"));
        var querry = sqlformater.Select(sqlformater.arg("Nom", "Prenom", "Classe", "Age"), tableeleves);
        querry.addToQuerry(sqlformater.asc(sqlformater.arg("Age")).get_condition());

        Assertions.assertEquals(expectedResult_SelectWithhaving, querry.requestQuerry());
    }
    /**
     *
     */
    @Test
    void OrderByDESC() {
        String expectedResult_SelectWithhaving = """
                SELECT(Nom, Prenom, Classe, Age)
                From Eleves
                ORDER BY Age DESC;""";
        var sqlformater = new SQLFormater();
        var tableeleves = sqlformater.table("Eleves",sqlformater.arg("Prenom", "Nom", "Classe", "Age"));
        var querry = sqlformater.Select(sqlformater.arg("Nom", "Prenom", "Classe", "Age"), tableeleves);
        querry.addToQuerry(sqlformater.desc(sqlformater.arg("Age")).get_condition());

        Assertions.assertEquals(expectedResult_SelectWithhaving, querry.requestQuerry());
    }

    /**
     *
     */
    @Test
    void FullOuterJoin() {
        String expectedResult_SelectWithhaving = """
                SELECT(Nom)
                From Eleves
                FULL OUTER JOIN Classe
                ON Eleves.id = Classe.eleveid;""";
        var sqlformater = new SQLFormater();
        var tableeleves = sqlformater.table("Eleves",sqlformater.arg("Nom","id"));
        var tableClass = sqlformater.table("Classe",sqlformater.arg("classe","eleveid"));
        var querry = sqlformater.Select(sqlformater.arg("Nom"),tableeleves);
        querry.addToQuerry(sqlformater.fullOuterJoin(tableClass.get_tableName(),tableeleves.get_columnbyposition(1),tableClass.get_columnbyposition(1)).getcondition());

        Assertions.assertEquals(expectedResult_SelectWithhaving, querry.requestQuerry());
    }

    /**
     *
     */
    @Test
    void InnerJoin() {
        String expectedResult_SelectWithhaving = """
                SELECT(Nom)
                From Eleves
                INNER JOIN Classe
                ON Eleves.id = Classe.eleveid;""";
        var sqlformater = new SQLFormater();
        var tableeleves = sqlformater.table("Eleves",sqlformater.arg("Nom","id"));
        var tableClass = sqlformater.table("Classe",sqlformater.arg("classe","eleveid"));
        var querry = sqlformater.Select(sqlformater.arg("Nom"),tableeleves);
        querry.addToQuerry(sqlformater.innerJoin(tableClass.get_tableName(),tableeleves.get_columnbyposition(1),tableClass.get_columnbyposition(1)).getcondition());

        Assertions.assertEquals(expectedResult_SelectWithhaving, querry.requestQuerry());
    }
    /**
     *
     */
    @Test
    void LEFTJOIN() {
        String expectedResult_SelectWithhaving = """
                SELECT(Nom)
                From Eleves
                LEFT JOIN Classe
                ON Eleves.id = Classe.eleveid;""";
        var sqlformater = new SQLFormater();
        var tableeleves = sqlformater.table("Eleves",sqlformater.arg("Nom","id"));
        var tableClass = sqlformater.table("Classe",sqlformater.arg("classe","eleveid"));
        var querry = sqlformater.Select(sqlformater.arg("Nom"),tableeleves);
        querry.addToQuerry(sqlformater.leftJoin(tableClass.get_tableName(),tableeleves.get_columnbyposition(1),tableClass.get_columnbyposition(1)).getcondition());

        Assertions.assertEquals(expectedResult_SelectWithhaving, querry.requestQuerry());
    }
    /**
     *
     */
    @Test
    void RightJoin() {
        String expectedResult_SelectWithhaving = """
                SELECT(Nom)
                From Eleves
                RIGHT JOIN Classe
                ON Eleves.id = Classe.eleveid;""";
        var sqlformater = new SQLFormater();
        var tableeleves = sqlformater.table("Eleves",sqlformater.arg("Nom","id"));
        var tableClass = sqlformater.table("Classe",sqlformater.arg("classe","eleveid"));
        var querry = sqlformater.Select(sqlformater.arg("Nom"),tableeleves);
        querry.addToQuerry(sqlformater.rightJoin(tableClass.get_tableName(),tableeleves.get_columnbyposition(1),tableClass.get_columnbyposition(1)).getcondition());

        Assertions.assertEquals(expectedResult_SelectWithhaving, querry.requestQuerry());
    }
}
