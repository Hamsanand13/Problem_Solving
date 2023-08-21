package programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
			String query="select pass from registration where mail='hamsanandkv@gmail.com'";
			Statement st=con.createStatement();
			System.out.print(st.executeUpdate(query));
			con.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
