package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection 
{
	private static Connection connection;
	public static Connection getConnection() 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
		}
		catch (Exception e) 
		{
			System.out.print("Exception ------->"+e);
		}
		return connection;
	}
}
