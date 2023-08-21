package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//

public class sample2 
{
	void InsertValues()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
			Statement st= connection.createStatement();
			String query="insert into emp1 values('xxx','cbe')";
			st.executeUpdate(query);
			connection.setAutoCommit(true);
			connection.close();
			System.out.print("Success!");
		}
		catch (Exception e)
		{
			System.out.print("--------->"+e);
		}
	}
	public static void main(String[] args)
	{
		new sample2().InsertValues();
	}
}
