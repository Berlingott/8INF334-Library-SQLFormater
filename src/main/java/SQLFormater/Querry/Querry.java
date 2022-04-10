package SQLFormater.Querry;

public class Querry {
  protected querryType_enum querrytype;
  protected Table fromTable;
  protected Condition[] condition_array;
  protected String[] querryargs;
  protected String finalQuerry = "";

    public String querryToString() {
      String formatedSQLRequest = "no specified request";
      return formatedSQLRequest;
    };

    public String requestQuerry(){
      return finalQuerry;
    }

    public void addToQuerry(String elementToAdd){
      finalQuerry = finalQuerry + elementToAdd;
    }

    public Querry(){
      querrytype = querryType_enum.UNDEFINED_ERROR;
    }
}
