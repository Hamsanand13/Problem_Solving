package jdbc;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;
import oracle.jdbc.driver.DBConversion;

class Demo3 extends Frame
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	public Demo3() 
	{
		setLayout(null);
		l1=new Label("Username");
		l2=new Label("password");
		t1 = new TextField();
		t2= new TextField();
		t2.setEchoChar('*');
		b1=new Button("Submit");
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=t1.getText();
				String pass=t2.getText();
				dbinsert(name,pass);
				t1.setText("");
				t2.setText("");	
			}
		});
		l1.setBounds(100,100,100,25);
		l2.setBounds(100, 150, 100, 25);
		t1.setBounds(230,100,100,25);
		t2.setBounds(230,150,100,25);
		b1.setBounds(180, 450, 50, 30);
		add(t1);
		add(t2);
		add(l1);
		add(l2);
		add(b1);
		setSize(600,600);
		setBackground(Color.gray);
		setResizable(false);
		setVisible(true);
	}
	void dbinsert(String name,String pass)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
			Statement st=con.createStatement();
			String query="insert into data values('"+name+"','"+pass+"')";
			st.executeUpdate(query);
			con.close();
			JOptionPane.showMessageDialog(null, "success!");
		}
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null,"Exception --->"+e);
		}
	}
}
public class Sample7 {
	public static void main(String[] args) 
	{
		new Demo3();
	}

}
