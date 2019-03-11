package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Simpleconnection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	     /*System.setProperty("webdriver.gecko.driver","/home/scoders/Desktop/geckodriver");
	     //Options.addArguments("--remote-debugging-port=9222");
	     WebDriver
	     driver = new FirefoxDriver();
	     driver.navigate().to("https://google.com");
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        */
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://204.204.204.1:3306/moneynet_mr2_main", "moneynet_mr2", "b65SvnQWgaA1@1qt");
	        System.out.println("connection is "+con);
	        Statement smt= con.createStatement();
	        String query="SELECT * FROM moneynet_mr2_main.config where `key`='SEPA_PO_CORRESPONDENTS';";
	        ResultSet rs=smt.executeQuery(query);
	        while (rs.next()){
	            String Value = rs.getString(3);
	            System.out.println("sepa po correspondent is "+Value);
	        }
	       con.close();
	        
	    
	 }

}
