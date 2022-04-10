package SQLFormater.Querry;
import SQLFormater.Querry.Assembler;
public class GroupBy extends Assembler {
    //METHODS


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
    public GroupBy(String[] column){
        this.columnsName = column;
    }
}
