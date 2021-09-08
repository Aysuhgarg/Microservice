package comman;

import java.sql.Connection;
import java.sql.DriverManager;


public class DB_Connection {

	
	public static void main(String[] arg)
	{
		DB_Connection obj =new DB_Connection();
		System.out.println(obj.get_connection());
	}
	
	public Connection get_connection()
	{
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully");
			connection = 
		    DriverManager.getConnection("jdbc:mysql://localhost:3306/apiserodb","root", "");
		     
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
}
