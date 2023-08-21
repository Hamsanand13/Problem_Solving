package jdbc;

import java.sql.*;
import java.util.*;

import connection.DatabaseConnection;
public class sample3 {
	void InsertValues()
	{
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the UserName:");
			String a=s.next();
			System.out.print("Enter the city:");
			String b=s.next();
			Connection con=DatabaseConnection.getConnection();
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
			Statement st=con.createStatement();
			String query="insert into emp1 values('"+a+"','"+b+"')";
			st.executeUpdate(query);
			con.close();
			System.out.print("Success!");
		}
		catch (Exception e) 
		{
			System.out.println("--------------->"+e);
		}
	} 
	public static void main(String[] args) 
	{
		new sample3().InsertValues();
	}
}
