public class Select extends Querry{




    //constructor
    public Select(String[] selectargs, Table fromtable){
        querrytype = querryType_enum.SELECT;
        querryargs = selectargs;
        fromTable = fromtable;
    }

    @Override
    public String querryToString(){
        StringBuilder querrystring = new StringBuilder("SELECT(");
        for (int i=0; i<querryargs.length; i++){
            querrystring.append(querryargs[i]);
            if(i<querryargs.length-1) {
                querrystring = new StringBuilder(querrystring + ", ");
            }
        }
        querrystring = new StringBuilder(querrystring + ") \nFrom " + fromTable.get_tableName());


        return querrystring.toString();
    }
}
