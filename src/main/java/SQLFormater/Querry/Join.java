package SQLFormater.Querry;

/**
 * Classe parents de tous les types d'argument JOIN pour les requêtes SQL.
 */
public class Join {
    protected String jointype;
    protected String table;
    protected String columnfirsttable;
    protected String columnsecondtable;

    /**
     * Methods utilisé par tous les enfants de JOIN afin de formulé l'agument d'une requête SQL.
     * @return retourne un String d'argument JOIN afin de l'ajouter à une requête.
     */
    public String getcondition(){
        String tmpcondition;
        tmpcondition = "\n"+jointype+" " + table + "\nON " + columnfirsttable + " = " + columnsecondtable;
        return tmpcondition;
    }
}
