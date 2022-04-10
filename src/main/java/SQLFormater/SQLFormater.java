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
        //todo
    }
    /**
     *
     *
     */
    public Where Wherecon(String firstatt, String secondatt, String operante){
        return new Where(firstatt, secondatt, operante);
    }

    public void Having(){
        //todo
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
    public FullOuterJoin fullOuterJoin(String tablearg, String columnfirst, String columnsecond){
        return new FullOuterJoin(tablearg,columnfirst,columnsecond);
    }
    public InnerJoin innerJoin(String tablearg, String columnfirst, String columnsecond){
        return new InnerJoin(tablearg,columnfirst,columnsecond);
    }
    public LeftJoin leftJoin(String tablearg, String columnfirst, String columnsecond){
        return new LeftJoin(tablearg,columnfirst,columnsecond);
    }
    public RightJoin rightJoin(String tablearg, String columnfirst, String columnsecond){
        return new RightJoin(tablearg,columnfirst,columnsecond);
    }
}
