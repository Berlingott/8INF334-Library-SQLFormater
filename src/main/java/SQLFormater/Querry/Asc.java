package SQLFormater.Querry;

/**
 * Class utilisé afin de créer l'argument ASC
 *  ASC est un argument pour les commandes ORDER BY
 */

public class Asc extends Ordering {
    /**
     * Constructeur de la classe Asc
     * @param columns nom de colonne d'une table, sera l'argument utilisé pour classer les résultats en ordre croissant.
     */
    public Asc(String[] columns){
        order = " ASC";
        this.columnName = columns;
    }
}
