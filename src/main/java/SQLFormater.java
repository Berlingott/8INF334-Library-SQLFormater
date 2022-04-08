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
     * Tant que nous ne faisons pas de requêtes à la base de données, nous concaténons les requêtes dans cette variable
     */
    String FinalQuerry = "";
    /**
     *Créations d'une string pour la requête SELECT, crera selon al table envoté et les arguments spécifié
     *
     */
    public Select Select(String[] selectargs, Table fromtable){
        Select select = new Select(selectargs,fromtable);
        FinalQuerry = FinalQuerry + select.querryToString();
        return select;

        //todo changer pour que les string soit contenu dans les string en elle meme et que l'utilisateur puisse sauvegarder les element de SON côté
        //Todo toutes les fonctions peuvent retourner de leurs côté leur objet que l'utilisateur pourra gerer
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
    public String RequestDatabase(){
       // for (int i = 0; i < querriesOrder.size() ; i++){
            String finalquerrytemp = FinalQuerry;
            FinalQuerry = "";
            return finalquerrytemp;
        }

    public  void AND(){

    }

}
