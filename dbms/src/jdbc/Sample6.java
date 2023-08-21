package jdbc;

import java.io.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Sample6 
{
	void callingStoredProcedure()
	{
		try
		{
//			DataInputStream dis=new DataInputStream(System.in);
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the name:");
			String a=s.nextLine();
			System.out.print("Enter the city:");
			String b=s.nextLine();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
			String query="{call p1(?,?)}";
			CallableStatement cst=con.prepareCall(query);
			cst.setString(1, a);
			cst.setString(2, b);
			cst.executeUpdate();
			con.setAutoCommit(true);
			System.out.println("Success! ");
			con.close();
		}
		catch (Exception e) {
			System.out.println("---------->" +e);
		}
	}
	public static void main(String[] args) 
	{
		new Sample6().callingStoredProcedure();
	}

}
