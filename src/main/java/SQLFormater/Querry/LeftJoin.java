package SQLFormater.Querry;

/**
 * classe utilisé afin de créer et enregistrer une requête SQL contenant un argument LEFT JOIN.
 */

public class LeftJoin extends Join{
    /**
     * Constructeur de la classe LeftJoin.
     * @param tablearg nom de la table sur laquelle le JOIN sera fait.
     * @param columnfirst nom de la colonne sur laquelle le JOIN sera fait.
     * @param columnsecond nom de la colonne sur laquelle le JOIN sera fait.
     */
    public LeftJoin(String tablearg, String columnfirst, String columnsecond){
        jointype = "LEFT JOIN";
        table = tablearg;
        columnfirsttable = columnfirst;
        columnsecondtable = columnsecond;
    }
}
