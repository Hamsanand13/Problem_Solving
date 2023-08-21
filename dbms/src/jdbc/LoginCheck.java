package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginCheck 
{
	static void login(String mail , String pass)
	{
		try 
		{
//			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
            
            Statement st=con.createStatement();
			String query="select id from login where (id='"+mail+"' and password='"+pass+"')";
			st.executeUpdate(query);
			
            
            
//            String query="select id from login where (id=? and password=?)";
//			PreparedStatement statement=con.prepareStatement(query);
//			statement.setString(1, mail);
//			statement.setString(2, pass);
			ResultSet set=st.executeQuery(query);
			if(set.next())
			{
				System.out.println("You have successfully logged in");
			}
			else {
				System.out.println("failed");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception ----------->"+e);
		}
	}
	public static void main(String[] args) 
	{
		String mail = "a@gmail.com";
		String pass = "a123";
		new LoginCheck().login(mail, pass);
	}
}
