import SQLFormater.Querry.Select;
import SQLFormater.Querry.Table;
import SQLFormater.SQLFormater;
import org.junit.jupiter.api.Assertions;
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
                                                "From eleves";
        // Assertions.assertEquals(1,1);
        //Assertions.assertEquals(1,2); // montre une erreur, assure que le test est fonctionnel
        SQLFormater sqlformater = new SQLFormater();
        sqlformater.Select(sqlformater.arg("Prenom", "Nom" ),sqlformater.table("eleves"));
        Assertions.assertEquals(expectedResult_simpleSelect, sqlformater.RequestDatabase());
    }
    /**
     * Requête: simple SQLFormater.Querry.Select
     * Résultat attendu:
     *SELECT(Prenom, Nom, Age, Classe)
     *From eleves
     */
    @Test
    void BasicSelectWithMoreThanTwoArg_Test() {
        String expectedResult_simpleSelect =    "SELECT(Prenom, Nom, Age, Classe)\n" +
                "From eleves";
        // Assertions.assertEquals(1,1);
        //Assertions.assertEquals(1,2); // montre une erreur, assure que le test est fonctionnel
        SQLFormater sqlformater = new SQLFormater();
        sqlformater.Select(sqlformater.arg("Prenom", "Nom", "Age", "Classe" ),sqlformater.table("eleves"));
        Assertions.assertEquals(expectedResult_simpleSelect, sqlformater.RequestDatabase());
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
        String expectedResult_SelectWithConditionWhere =    "SELECT(Prenom, Nom)\n" +
                                                            "From eleves\n" +
                                                            "WHERE Nom = 'Simon'" ;
        SQLFormater sqlformater = new SQLFormater();
        var querry = sqlformater.Select(sqlformater.arg("Prenom", "Nom"),sqlformater.table("eleves"));
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
     */
    @Test
    void SelectWithDoubleConditionWhere(){

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
}
