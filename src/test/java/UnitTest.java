import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Requête:
 * Résultat attendu:
 */
public class UnitTest {
    /**
     * Requête: simple Select
     * Résultat attendu:
     *SELECT(Prenom, Nom)
     *From eleves
     */
    @Test
    void BasicSelect_Test() {
        String expectedResult_simpleSelect =    "SELECT(Prenom, Nom) \n" +
                                                "From eleves";
        // Assertions.assertEquals(1,1);
        //Assertions.assertEquals(1,2); // montre une erreur, assure que le test est fonctionnel
        SQLFormater sqlformater = new SQLFormater();
        sqlformater.Select(sqlformater.arg("Prenom", "Nom" ),sqlformater.table("eleves"));
        Assertions.assertEquals(expectedResult_simpleSelect, sqlformater.RequestDatabase());
    }

    /**
     * Requête: Select With condition where
     * Résultat attendu:
     * SELECT(Prenom, Nom)
     * From eleves
     * WHERE Nom = 'Simon'
     */
    @Test
    void SelectWithConditionWhere(){
        String expectedResult_SelectWithConditionWhere ;

    }

    /**
     * Requête: Select With Double condition where
     * Résultat attendu:
     * SELECT(Prenom, Nom)
     * From eleves
     * WHERE Nom = 'Simon'
     */
    @Test
    void SelectWithDoubleConditionWhere(){

    }
}
