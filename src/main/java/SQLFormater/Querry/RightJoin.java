package SQLFormater.Querry;


/**
 * classe utilisé afin de créer et enregistrer une requête SQL contenant un argument RIGHT JOIN.
 */

public class RightJoin extends Join{
    /**
     * Constructeur de la classe RightJoin.
     * @param tablearg nom de la table sur laquelle le JOIN sera fait.
     * @param columnfirst nom de la colonne sur laquelle le JOIN sera fait.
     * @param columnsecond nom de la colonne sur laquelle le JOIN sera fait.
     */
    public RightJoin(String tablearg, String columnfirst, String columnsecond){
        jointype = "RIGHT JOIN";
        table = tablearg;
        columnfirsttable = columnfirst;
        columnsecondtable = columnsecond;
    }
}
