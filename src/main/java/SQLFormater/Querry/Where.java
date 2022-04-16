package SQLFormater.Querry;

/**
 * CLasse utilisé afin de créer en enregistrer un argument WHERE pouvant etre ajouter à une requête SQL.
 */
public class Where {
    private final String firstAttributs;
    private final String secondAttributs;
    private final String operante;

    /**
     * @return String de l'argument WHERE formulé et pouvant être ajouté à notre requête SQL.
     */
    public String get_condition(){
        return "\n" + "WHERE " + firstAttributs + " " + operante + " " + secondAttributs;
    }

    /**
     * Constructeur de la classe WHERE
     * @param first première variable de la condition
     * @param second second variable de la condition
     * @param ope operande a ajouter dans notre condition WHERE
     */
    public Where(String first, String second, String ope){
        firstAttributs = first;
        secondAttributs = second;
        operante = ope;
    }


}
