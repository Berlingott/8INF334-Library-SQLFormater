package SQLFormater.Querry;

public class Ordering {
    protected String[] columnName;
    protected String order;

    public String get_condition(){
        StringBuilder tmpcondition;
        tmpcondition = new StringBuilder("\nORDER BY ");

        for(int i = 0 ; i < columnName.length;i++ ){
            if(i<columnName.length-1){
                tmpcondition.append(columnName[i]).append(", ");
            }
            else {
                tmpcondition.append(columnName[i]).append(order);
            }
        }
        return tmpcondition.toString();

    }

    Ordering(){
        order = "NO ORDER DEFINED";
    }
}
