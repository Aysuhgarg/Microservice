package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import comman.DB_Connection;
//import java.sql.Connection;

public class Insert_values {
	
	
	public void insert_val(String sl_no,String user_name,String email,String mobile)
	{
		DB_Connection obj=new DB_Connection();
		Connection connection= obj.get_connection();
		
		PreparedStatement ps=null;
		try {
		String query="insert into user(sl_no,user_name,email,mobile) value(?,?,?,?)";
		 
		ps=connection.prepareStatement(query);
		ps.setString(1,sl_no);
		ps.setString(2,user_name);
		ps.setString(3,email);
		ps.setString(4,mobile);
		
		ps.executeUpdate();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
