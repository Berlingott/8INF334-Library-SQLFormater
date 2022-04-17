package SQLFormater.Querry;


/**
 * Class utilisé afin de créer l'argument DESC
 *  DESC est un argument pour les commandes ORDER BY
 */

public class Desc extends Ordering {
    /**
     * Constructeur de la classe Asc
     * @param columns nom de colonne d'une table, sera l'argument utilisé pour classer les résultats en ordre décroissant.
     */
    public Desc(String[] columns){
        this.order = " DESC";
        this.columnName = columns;
    }
}
