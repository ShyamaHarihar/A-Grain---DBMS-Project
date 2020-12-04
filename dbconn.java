package dbconn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
/*import java.sql.Statement;*/
public class dbconn {
	public static void main(String[] args) {
	      String JdbcURL = "jdbc:mysql://localhost:3306/mysql?allowPublicKeyRetrieval=true&useSSL=false";
	      String Username = "shyama";
	      String password = "root";
	      try {
	    	  
	    	    Connection conn = DriverManager.getConnection(JdbcURL,Username,password);
	    	 
	    	    if (conn != null) {
	    	        System.out.println("Connected");
	    	        JOptionPane.showMessageDialog(null,"Connection established");
	    	    }
	    	} catch (SQLException ex) {
	    	    ex.printStackTrace();
	    	}
	      
}}
