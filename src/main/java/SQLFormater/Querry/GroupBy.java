package SQLFormater.Querry;
import SQLFormater.Querry.Assembler;

/**
 * Classe utilisée afin de créer et enregistrer un argument GroupBy dans la requête SQL.
 */
public class GroupBy extends Assembler {
    //METHODS

    /**
     * Prends tous les éléments de la classe et formule un argument pour la requête SQL
     * @return retourne une String de l'argument construit afin d'être ajouté à une requête.
     */
    public String get_condition(){
        StringBuilder tmpcondition = new StringBuilder("\nGROUP BY ");
        for (int i = 0; i<columnsName.length; i++){
            if (i<columnsName.length-1) {
                tmpcondition.append(columnsName[i]).append(", ");
            }
            else {
                tmpcondition.append(columnsName[i]);
            }
        }
        return tmpcondition.toString();
    }
    //CONSTRUCTOR

    /**
     * Constructeur de la classe groupby
     * @param column nom de colonne pour gréé la classe goupby, soit le nom de la classe par lequel la requête SQL groupera les résultats.
     */
    public GroupBy(String[] column){
        this.columnsName = column;
    }
}
