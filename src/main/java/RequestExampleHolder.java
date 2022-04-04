public class RequestExampleHolder { // example de requête utilisant notre projet
    private SQLFormater sqlformater = new SQLFormater();
    public void RequeteUn(){
        //SELECT(Prenom, Nom)
        //FROM eleves;
        System.out.println("Exemple 1");
        sqlformater.Select(sqlformater.arg("Prenom", "Nom" ),sqlformater.table("eleves"));
        sqlformater.RequestDatabase();
    }

    public void RequeteDeux(){//TODO
        System.out.println("\nExemple 2");
        //SELECT(Prenom, Nom)
        //FROM eleves;
        //WHERE age > 5

        sqlformater.RequestDatabase();
    }

    public void RequeteTrois(){//TODO
        System.out.println("\nExemple 3");

    }

    public void RequeteQuatre(){//TODO
        System.out.println("Exemple 4");

    }
    public void RequeteCinq(){//TODO
        System.out.println("Exemple 5");

    }

}
