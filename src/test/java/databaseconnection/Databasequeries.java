package databaseconnection;


import java.sql.Statement;

public class Databasequeries {
	static String query=null;
    static Statement smt=null;
    static int Columnvalue;
    static String Columnnum=null;
    static String Value=null;

    
    static String[] Result;
    

    
    public static void sepa_po_correspondent() throws ClassNotFoundException{
        try {
       // System.out.println("1: Traversed through sepa_po method");
        query="SELECT * FROM moneynet_mr2_main.config where `key`='SEPA_PO_CORRESPONDENTS';";
        Columnvalue=3;
        //Columnnum= Integer.toString(Columnvalue);
//        System.out.println("Before saving in array Sepa_query is "+query+"." +"columnnumber is "+Columnvalue+".");
//        System.out.println("Traversed through sepa_po method");   
//        System.out.println("Sepa_query is "+query+"." +"columnnumber is "+Columnvalue+".");
        //Databaseconnection.DB_connection(query,Columnnum);
        System.out.println("Value of sepa_po "+Connect.DB_connection(query,Columnvalue));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
}
}
