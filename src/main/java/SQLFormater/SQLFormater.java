package SQLFormater;
import SQLFormater.Querry.*;

/**
 * classe gérant les requêtes externe à notre librairie
 */

public class SQLFormater { //singleton, une instance seule servira à gérer la connection et ne pas faire de connection doublon

    Select[] selectQuerries;
    String[] arguments;
    String FinalQuerry = "";


    /**
     * Créations d'une string pour la requête SELECT, crera selon al table envoté et les arguments spécifié
     * @param selectargs tableau de STRING pour les colonnes de la requête
     * @param fromtable nom de la table de provenance de la requête SQL
     * @return Une requête de base SELECT
     */
    public Select Select(String[] selectargs, Table fromtable){
        return new Select(selectargs,fromtable);
 }

    /**
     * Permet la création de table
     * @param tableName nom de la table a créer
     * @param columnname noms des colonnes de la table
     * @return un objet table
     */
    public Table table(String tableName, String[] columnname){
        return new Table(tableName, columnname);
    }
    public Table table(String tableName){
        return new Table(tableName);
    }

    /**
     * Permet la construction d'une condition WHERE
     * @param firstatt premiere variable de la condition where
     * @param secondatt seconde variable de la condition where
     * @param operante operand de la condition where
     * @return un objet Where
     */
    public Where Wherecon(String firstatt, String secondatt, String operante){
        return new Where(firstatt, secondatt, operante);
    }

    /**
     * fonction pouvant être speller afin de mettre un nombre non défini d'arguments dans d'autres requêtes.
     * @param arg string, en nombre non défini ex: "string1","string2","String3"
     * @return les strings données dans un tableau
     */
    public String[] arg(String ... arg){
        return arg;
    }

    /**
     *fonction pour ajouter un AND
     * @param otherelement element a concaténé avec AND
     * @return string formulé
     */

    public String AND(String otherelement){
        return "\nAND" + otherelement;
    }

    /**
     * Fonction pour ajouter un argument GroupBy dans la requête SQL.
     * @param classes classe à grouper
     * @return retourne un string formuler de l'argument
     */
    public GroupBy groupby(String[] classes) {
        return new GroupBy(classes);
    }

    /**
     * Fonction appeller pour cree et ajouter un argument ASC à la requête SQL.
     * @param columnsname nom de la colonne pour le tri
     * @return Retourne la fonction
     */
    public Asc asc(String[] columnsname){
        return new Asc(columnsname);
    }

    /**
     * Fonction appeller pour cree et ajouter un argument DESC à la requête SQL.
     * @param columnsname nom de la colonne pour le tri
     * @return Retourne la fonction
     */
    public Desc desc(String[] columnsname){
        return new Desc(columnsname);
    }

    /**
     * Fonction appeller pour cree et ajouter un argument DESC à la requête SQL.
     * @param tablearg arguments  de la table a join
     * @param columnfirst premier nom de la table
     * @param columnsecond deuxieme argument de la table
     * @return String de la requete formuler pouvant être ajouté
     */
    public FullOuterJoin fullOuterJoin(String tablearg, String columnfirst, String columnsecond){
        return new FullOuterJoin(tablearg,columnfirst,columnsecond);
    }

    /**
     * Fonction appeller pour cree et ajouter un argument DESC à la requête SQL.
     * @param tablearg arguments  de la table a join
     * @param columnfirst premier nom de la table
     * @param columnsecond deuxieme argument de la table
     * @return String de la requete formuler pouvant être ajouté
     */
    public InnerJoin innerJoin(String tablearg, String columnfirst, String columnsecond){
        return new InnerJoin(tablearg,columnfirst,columnsecond);
    }

    /**
     * Permet la création d'un objet LEFT JOIN de l'exterieur de la librairie
     * Il pourra donc par la suite être ajouté à la requête
     * @param columnfirst premier nom de la table
     * @param columnsecond deuxieme argument de la table
     * @return
     */
    public LeftJoin leftJoin(String tablearg, String columnfirst, String columnsecond){
        return new LeftJoin(tablearg,columnfirst,columnsecond);
    }

    /**
     * Permet la création d'un objet RIGHT JOIN de l'exterieur de la librairie
     * Il pourra donc par la suite être ajouté à la requête
     * @param tablearg Tous les noms de colonnes de la table
     * @param columnfirst premier nom de colonne (Argument à gauche JOIN)
     * @param columnsecond second nom de colonne (Argument à droite du JOIN
     * @return Retourne une string formant la partie RIGHT JOIN de la requête
     */
    public RightJoin rightJoin(String tablearg, String columnfirst, String columnsecond){
        return new RightJoin(tablearg,columnfirst,columnsecond);
    }
}
