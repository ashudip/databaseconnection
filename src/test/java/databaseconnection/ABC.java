package databaseconnection;

import java.sql.Connection;

import org.testng.annotations.Test;

public class ABC {

	 Connection con;
	    @Test
	     public void init(){
	        try {
	                    
	            Databasequeries.sepa_po_correspondent();
	        }
	        catch(Exception e) {
	            e.printStackTrace();
	            }
	        }
}
