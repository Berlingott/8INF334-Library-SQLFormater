package SQLFormater.Querry;

public class FullOuterJoin extends Join{
    public FullOuterJoin(String tablearg, String columnfirst, String columnsecond){
        jointype = "FULL OUTER JOIN";
        table = tablearg;
        columnfirsttable = columnfirst;
        columnsecondtable = columnsecond;
    }
}
