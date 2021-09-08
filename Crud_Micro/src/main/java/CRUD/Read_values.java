package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import comman.DB_Connection;
import comman.User_Bean;

public class Read_values {

	public static void main(String args[])
	{
		Read_values obj_read=new Read_values();
		obj_read.get_values();
	}	
	public List<User_Bean> get_values()
	{
		DB_Connection obj=new DB_Connection();
		Connection connection= obj.get_connection();
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<User_Bean> list=new ArrayList<>();	
		try
		{
			String query="Select * from user";
			ps=connection.prepareStatement(query);
			rs=ps.executeQuery();
		
			while(rs.next())
			{
				User_Bean obj_User_Bean= new User_Bean();   
				obj_User_Bean.setSl_no(rs.getString("sl_no"));
				obj_User_Bean.setEmail(rs.getString("email"));
				obj_User_Bean.setUser_name(rs.getString("user_name"));
				obj_User_Bean.setMobile(rs.getString("mobile"));
		   
				list.add(obj_User_Bean);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error is "+e);
		}
		return list;
	}
}
