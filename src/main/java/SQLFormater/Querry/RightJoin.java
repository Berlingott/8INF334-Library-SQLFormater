package SQLFormater.Querry;

public class RightJoin extends Join{
    public RightJoin(String tablearg, String columnfirst, String columnsecond){
        jointype = "RIGHT JOIN";
        table = tablearg;
        columnfirsttable = columnfirst;
        columnsecondtable = columnsecond;
    }
}
