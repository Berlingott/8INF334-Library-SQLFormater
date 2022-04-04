import java.util.ArrayList;
import java.security.*;

public class Main {

    public static void main(String[] args) {
        //invocation du gestionnaire SQL
        RequestExampleHolder exemple = new RequestExampleHolder();
        SQLFormater requestManager = new SQLFormater();


        exemple.RequeteUn();
        exemple.RequeteDeux();
        exemple.RequeteTrois();
        exemple.RequeteQuatre();
        exemple.RequeteCinq();
    }
}



