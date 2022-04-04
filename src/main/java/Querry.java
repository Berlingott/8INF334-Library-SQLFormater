public class Querry {
  protected querryType_enum querrytype;
  protected Table fromTable;
  protected Condition[] condition_array;
  protected String[] querryargs;

    public String querryToString() {
      String formatedSQLRequest = "no specified request";
      return formatedSQLRequest;
    };

    public Querry(){
      querrytype = querryType_enum.UNDEFINED_ERROR;
    }
}
