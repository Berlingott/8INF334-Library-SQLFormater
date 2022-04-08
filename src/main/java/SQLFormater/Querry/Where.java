package SQLFormater.Querry;

public class Where extends Condition{
    private String firstAttributs;
    private String secondAttributs;
    private String operante;


    public String get_condition(){
        return "\n" + "WHERE " + firstAttributs + " " + operante + " " + secondAttributs;
    }


    public Where(String first, String second, String ope){
        firstAttributs = first;
        secondAttributs = second;
        operante = ope;
    }


}
