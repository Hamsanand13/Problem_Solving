package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//preparedStatement is used to execute  multiple times while the query will compiled only once

public class sample4 
{
	void InsertValues()
	{
		try
		{
			Scanner s=new Scanner(System.in);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
			String query="insert into emp1 values(?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			System.out.print("Enter number of rows:");
			int n = s.nextInt();
			for(int i=0;i<n;i++)
			{
				System.out.print("Enter the Username:");
				String a=s.next();
				System.out.print("Enter the city:");
				String b=s.next();
				// 1 denotes the first column				
				pst.setString(1, a);
				pst.setString(2, b);
				pst.executeUpdate();
			}
			con.close();
			System.out.print("Success!");
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args)
	{
		new sample4().InsertValues();
	}
}
