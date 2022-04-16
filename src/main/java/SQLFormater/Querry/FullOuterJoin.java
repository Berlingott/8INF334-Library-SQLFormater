package SQLFormater.Querry;

/**
 * classe utilisé afin de créer et enregistrer une requête SQL contenant un argument FULL OUTER JOIN .
 */

public class FullOuterJoin extends Join{
    /**
     *Constructeur de la classe FullOuterJoin
     * @param tablearg nom de la table sur laquelle le JOIN sera fait
     * @param columnfirst nom de la colonne  sur laquelle le JOIN sera fait
     * @param columnsecond nom de la colonne  sur laquelle le JOIN sera fait
     */
    public FullOuterJoin(String tablearg, String columnfirst, String columnsecond){
        jointype = "FULL OUTER JOIN";
        table = tablearg;
        columnfirsttable = columnfirst;
        columnsecondtable = columnsecond;
    }
}
