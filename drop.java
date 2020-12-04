package dbconn;
import java.sql.*;

import javax.swing.JOptionPane;
public class drop {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false";
	    String username = "shyama";
	    String passwd = "root";
	    Connection connect = null;
	    Statement st = null;
	    try 
	{
	connect = DriverManager.getConnection(url, username, passwd);
	st = connect.createStatement();
	st.executeUpdate("drop table r2;");
    System.out.println("Table r2 has been dropped");
    st.executeUpdate("drop table r3;");
    System.out.println("Table r3 has been dropped");
    st.executeUpdate("drop table r4;");
    System.out.println("Table r4 has been dropped");
    st.executeUpdate("drop table r5;");
    System.out.println("Table r5 has been dropped");
    st.executeUpdate("drop table r6;");
    System.out.println("Table r6 has been dropped");
    st.executeUpdate("drop table r7;");
    System.out.println("Table r7 has been dropped");
    st.executeUpdate("drop table farmer_profile");
    JOptionPane.showMessageDialog(null,"All the tables have been dropped successfully ");
	}
	    catch(SQLException e) 
	{
	e.printStackTrace();
	}

	}

}
