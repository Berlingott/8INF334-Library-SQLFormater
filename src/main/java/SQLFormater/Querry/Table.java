package SQLFormater.Querry;

import java.util.Objects;

/**
 * Classe afin de contruire et enregistrer une structure pour la représentation d'une table dans une base de donnée SQL.
 */
public class Table {

    //ATTRIBUTS
    private final String tableName;
    private String[] columnName;

    /**
     * @return Le nom de la tabnle
     */
    public String get_tableName(){
        return this.tableName;
    }


    public String getArg(String argName){
        return (tableName + "." +argName);
    }
    /**
     * @return Retroune l'ensemble des colonnes de la table
     */
    public String[] get_columns(){
        String[] tmpcolumnname = columnName;
        for (int i=0; i < columnName.length; i++){
            tmpcolumnname[i] = tableName + "." + tmpcolumnname[i];
        }
        return tmpcolumnname;
    }

    /**
     *trouver une colonne de la table par son nom
     */
    public String get_columnbyname(String columnname){
        for (String s : columnName) {
            if (Objects.equals(s, columnname)) {
                return tableName + "." + s;
            }
        }
        return "";
    }
    /**
     *trouver une colonne de la table par sa position
     */
    public String get_columnbyposition(int position){
        return tableName +"."+ columnName[position] ;
    }

    //CONSTRUCTOR
    public Table(String name, String[] columnname){
     this.tableName = name;
     columnName = columnname;
    }
    public Table(String name){
        this.tableName = name;
    }

}
