package SQLFormater.Querry;

public class Asc extends Ordering {
    public Asc(String[] columns){
        order = " ASC";
        this.columnName = columns;
    }
}
