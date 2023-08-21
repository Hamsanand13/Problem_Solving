package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sample5 
{
void Display()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
			Statement st=con.createStatement();
			String query="select * from emp1";
			ResultSet set =st.executeQuery(query);
			while(set.next())
			{
				System.out.print(set.getString(1)+"\t"+set.getString(2));
				System.out.println();
			}
			con.close();
		}
		catch (Exception e) 
		{
			System.out.print("----------->"+e);
		}
	}
	public static void main(String[] args) {
		new sample5().Display();
	}
}
