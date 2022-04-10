package SQLFormater;
import SQLFormater.Querry.*;

/**
 * classe gérant les requêtes externe à notre librairie
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
     * nom: Select(String[] selectargs, Table fromtable)
     * Description: Créations d'une string pour la requête SELECT, crera selon al table envoté et les arguments spécifié
     *
     */
    public Select Select(String[] selectargs, Table fromtable){
        Select select = new Select(selectargs,fromtable);
        return select;

        //todo changer pour que les string soit contenu dans les string en elle meme et que l'utilisateur puisse sauvegarder les element de SON côté
        //Todo toutes les fonctions peuvent retourner de leurs côté leur objet que l'utilisateur pourra gerer
    }
    /**
     * nom: table(String tableName, String[] columnname)
     * Description: Permet la création d'une table par l'appel de la librairie
     */
    public Table table(String tableName, String[] columnname){
        return new Table(tableName, columnname);
    }
    public Table table(String tableName){
        return new Table(tableName);
    }

    /**
     *
     */
    public void Concat(){
        //Todo
    }
    /**
     *
     *
     */
    public Where Wherecon(String firstatt, String secondatt, String operante){
        return new Where(firstatt, secondatt, operante);
    }

    public void Having(){
        //TODO
    }
    /**
     * Nom: arg()
     * Description: Permet de transformer un nombre indéfini d'argument pour les constructeur demandant un tableau de Chaine de characters
     */
    public String[] arg(String ... arg){
        return arg;
    }

    public String AND(String otherelement){
        return "\nAND" + otherelement;
    }


    public GroupBy groupby(String[] classes) {
        GroupBy groupby = new GroupBy(classes);
        return groupby;
    }
    public Asc asc(String[] columnsname){
        return new Asc(columnsname);
    }
    public Desc desc(String[] columnsname){
        return new Desc(columnsname);
    }
}
