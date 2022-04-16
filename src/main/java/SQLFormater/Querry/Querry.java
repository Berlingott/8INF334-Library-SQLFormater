package SQLFormater.Querry;

/**
 * Classe parent de tous les types de requêtes( SELECT par exemple).
 */
public class Querry {
  protected Table fromTable;
  protected String[] querryargs;
  protected String finalQuerry = "";

    public String querryToString() {
      return "no specified request";
    };

  /**
   * @return Retourne un String la requête SQL complète
   */

  public String requestQuerry(){
      return finalQuerry;
    }

  /**
   * Methode appeler par toutes les requêtes afin d'ajouter un argument à celle-ci.
   * @param elementToAdd élément à ajouter dans la requête.
   */
  public void addToQuerry(String elementToAdd){
      finalQuerry = finalQuerry + elementToAdd;
    }

}
