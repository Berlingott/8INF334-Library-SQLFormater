package SQLFormater.Querry;

 /**
 * classe utilisé afin de créer et enregistrer une requête SQL contenant un argument INNER JOIN.
 */

public class InnerJoin extends Join{
     /**
      * Constructeur de la classe InnerJoin.
      * @param tablearg nom de la table sur laquelle le JOIN sera fait.
      * @param columnfirst nom de la colonne  sur laquelle le JOIN sera fait.
      * @param columnsecond nom de la colonne  sur laquelle le JOIN sera fait.
      */
    public InnerJoin(String tablearg, String columnfirst, String columnsecond){
        jointype = "INNER JOIN";
        table = tablearg;
        columnfirsttable = columnfirst;
        columnsecondtable = columnsecond;
    }
}
