public class Table {

    private String tableName;
    public String get_tableName(){
        return this.tableName;
    }


    Table(String name){
     this.tableName = name;
    }

    public String getArg(String argName){
        return (tableName + "." +argName);
    }
}
