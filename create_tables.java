package dbconn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
public class create_tables {
	public static void main(String[] args) 
	{
	    String url = "jdbc:mysql://localhost:3306/mysql?allowPublicKeyRetrieval=true&useSSL=false";
	    String username = "shyama";
	    String passwd = "root";
	    Connection connect = null;
	    Statement st = null;
	    try 
	{
	connect = DriverManager.getConnection(url, username, passwd);
	st = connect.createStatement();
	st.executeUpdate("create table r2(id int,phone_number int);");
	System.out.println("Table r2 is created");
	st.executeUpdate("create table r3(unique_no int,crops_harvested varchar(30));");
	System.out.println("Table r3 is created");
	st.executeUpdate("create table r4(unique_no int,fertilizer varchar(30));");
	System.out.println("Table r4 is created");
	st.executeUpdate("create table r5(unique_no int,irrigation_method varchar(30));");
	System.out.println("Table r5 is created");
	st.executeUpdate("create table r6(unique_no int,soil_type varchar(30));");
	System.out.println("Table r6 is created");
	st.executeUpdate("create table r7(id int,product_purchased varchar(30));");
	System.out.println("Table r7 is created");
	st.executeUpdate("create table farmer_profile(crops_harvested varchar(30),fertilizer varchar(30),irrigation_method varchar(30),soil_type varchar(30));");
	JOptionPane.showMessageDialog(null,"All the tables are created");
	}catch(SQLException e) 
	{
	e.printStackTrace();
	}finally
	{
	      try {
	        if (st != null) {
	          st.close();
	        }
	        if (connect!= null) {
	          connect.close();
	        }
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
}}
}
