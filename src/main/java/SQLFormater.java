import java.util.ArrayList;
import java.util.List;

/**
 * classe gérant les requêtes externe à notre librairie
 *
 *
 */

public class SQLFormater { //singleton, une instance seule servira à gérer la connection et ne pas faire de connection doublon
    private static SQLFormater single_instance = null;

    Select[] selectQuerries;
    String[] arguments;

    /**
     *
     *
     */
    public void Select(String[] selectargs, Table fromtable){
        Select select = new Select(selectargs,fromtable);
        System.out.printf(select.querryToString());

    }
    /**
     *
     *
     */
    public Table table(String tableName){
        return new Table(tableName);
    }
    /**
     *
     *
     */
    public void Concat(){
        //Todo
    }
    /**
     *
     *
     */
    public void Where(){
        //TODO
    }
    /**
     *
     *
     */
    public void Having(){
        //TODO
    }
    /**
     *
     *
     */

    public String[] arg(String ... arg){
        return arg;
    }
    /**
     *
     *
     */
    public void RequestDatabase(){
       // for (int i = 0; i < querriesOrder.size() ; i++){
            //TODO
        }

    //}
}
