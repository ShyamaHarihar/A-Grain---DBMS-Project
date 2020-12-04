package dbconn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class read3 {
	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false";
	    String username = "shyama";
	    String passwd = "root";
	    Connection connect = null;
	    Statement st = null;
	    String rq2="select * from r5;";
	    try 
		{
		connect = DriverManager.getConnection(url, username, passwd);
		st=connect.createStatement();
	    //ResultSet rs=st.executeQuery(rq1);
	    ResultSet rs1=st.executeQuery(rq2);
	    while(rs1.next())
	    {
	    	String data=rs1.getString(1);
	    	String data1=rs1.getString(2);
	    	//String data2=rs.getString(3);
	    	//String data3=rs.getString(4);
	    	//String data4=rs.getString(5);
	    	//String data5=rs.getString(6);
	    	System.out.print(data+","+data1);
	    }
	    st.close();
	    
	    
	    /*while(rs1.next())
	    {
	    	String data=rs.getString(1);
	    	String data1=rs.getString(2);
	    	//String data2=rs.getString(3);
	    	//String data3=rs.getString(4);
	    	//String data4=rs.getString(5);
	    	//String data5=rs.getString(6);
	    	System.out.print(data+","+data1);
	    }
	    	st.close();*/
	    
	    
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	    }
	}
}
