package SQLFormater.Querry;

public class InnerJoin extends Join{
    public InnerJoin(String tablearg, String columnfirst, String columnsecond){
        jointype = "INNER JOIN";
        table = tablearg;
        columnfirsttable = columnfirst;
        columnsecondtable = columnsecond;
    }
}
