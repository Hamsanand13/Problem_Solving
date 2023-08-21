package forms;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import connection.DatabaseConnection;

class Login extends Frame
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	public Login()
	{
		l1=new Label("Mail");
		l2=new Label("pass");
		t1=new TextField();
		t2=new TextField();
		t2.setEchoChar('*');
		b1 = new Button("Login");
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String mail=t1.getText();
				String pass=t2.getText();
				t1.setText("");
				t2.setText("");
				Connection con=DatabaseConnection.getConnection();
				try
				{
					String query="select mail from registration where (mail=? and pass=?)";
					PreparedStatement st=con.prepareStatement(query);
					st.setString(1, mail);
					st.setString(2, pass);
					ResultSet set=st.executeQuery();
//					System.out.println(set);
					if(set.next())
					{
						int r=1;
						JOptionPane.showMessageDialog(null,"You have Successfully logged in");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect data");
					}
				}
				catch (Exception x) 
				{
					System.out.print("Exception -------->"+x);
				}
			}
		});
		l1.setBounds(100,100,100,25);
		t1.setBounds(220,100,180,25);
		l2.setBounds(100,140,100,25);
		t2.setBounds(220,140,180,25);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		setSize(500,500);
		b1.setBounds(180,300,100, 35);
		add(b1);
		setBackground(Color.LIGHT_GRAY);
		
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		//int b=0;
		new Login();
		
	}
}
