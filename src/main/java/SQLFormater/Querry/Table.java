package SQLFormater.Querry;

public class Table {

    //ATTRIBUTS
    private String tableName;

    //METHODS
    //GET SET
    public String get_tableName(){
        return this.tableName;
    }
    public String getArg(String argName){
        return (tableName + "." +argName);
    }

    //CONSTRUCTOR
    public Table(String name){
     this.tableName = name;
    }


}
