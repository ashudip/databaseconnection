package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {

	
	public static String Value = null;  
	
//	        Class.forName("com.mysql.jdbc.Driver");
//	        Connection con = DriverManager.getConnection("jdbc:mysql://204.204.204.1:3306/moneynet_mr2_main", "moneynet_mr2", "b65SvnQWgaA1@1qt");
//	        System.out.println("connection is "+con);
//	        Statement smt= con.createStatement();
//	        String query="SELECT * FROM moneynet_mr2_main.config where `key`='SEPA_PO_CORRESPONDENTS';";
//	        ResultSet rs=smt.executeQuery(query);
//	        while (rs.next()){
//	            String Value = rs.getString(3);
//	            System.out.println("sepa po correspondent is "+Value);
//	        }
//	       con.close();
//	}
		 public static String DB_connection(String query, int Columnvalue)throws ClassNotFoundException {
		        try {
		        System.out.println("Value of query received="+query +" and "+"column number ="+Columnvalue+".");
		        
		        Class.forName("com.mysql.jdbc.Driver");
		        System.out.println("2:Traversed through database connection method");
		        Connection con = DriverManager.getConnection("jdbc:mysql://204.204.204.1:3306/moneynet_mr2_main", "moneynet_mr2", "b65SvnQWgaA1@1qt");
		        System.out.println("connection is "+con);
		        Statement smt =con.createStatement();
		        ResultSet rs=smt.executeQuery(query);
		        //int Columnnum= Columnvalue;
		        while (rs.next()){
		           Value = rs.getString(Columnvalue);
		           System.out.println("Sepa_PO_Correspondent is "+Value);
		        }
		        }
		        catch(Exception e)
		        {
		            e.printStackTrace();    
		        }
		        
		        return Value;   
		    }	
		
		
}
