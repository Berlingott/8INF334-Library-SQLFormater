package SQLFormater.Querry;

public class Join {
    protected String jointype;
    protected String table;
    protected String columnfirsttable;
    protected String columnsecondtable;

    public String getcondition(){
        String tmpcondition;
        tmpcondition = "\n"+jointype+" " + table + "\nON " + columnfirsttable + " = " + columnsecondtable;
        return tmpcondition;
    }
}
