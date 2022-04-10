package SQLFormater.Querry;

public class LeftJoin extends Join{
    public LeftJoin(String tablearg, String columnfirst, String columnsecond){
        jointype = "LEFT JOIN";
        table = tablearg;
        columnfirsttable = columnfirst;
        columnsecondtable = columnsecond;
    }
}
