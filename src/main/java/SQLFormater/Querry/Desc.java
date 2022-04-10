package SQLFormater.Querry;

public class Desc extends Ordering {
    public Desc(String[] columns){
        this.order = " DESC";
        this.columnName = columns;
    }
}
