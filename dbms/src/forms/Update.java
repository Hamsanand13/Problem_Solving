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
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import connection.DatabaseConnection;
import java.util.regex.*;

class Demo3 extends Frame
{
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	TextField t1,t2,t3,t4,t5,t6;
	Button b1,b2;
	public Demo3() 
	{
		setLayout(null);
		l1=new Label("First Name");
		l2=new Label("Last Name");
		l3=new Label("phone");
		l4=new Label("Mail");
		l5=new Label("password");
		l6=new Label("Confirm Password");
		l7=new Label("DOB");
		l8=new Label("Gender");
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		t5=new TextField();
		t6=new TextField();
		t5.setEchoChar('*');
		t6.setEchoChar('*');
		b1= new Button("Login");
		b2= new Button("Update");
		String days[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String months[]= {"January","Febraury","March","April","May","June","July","August","September","October","November","December"};
		String years[]= {"1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
		//String gender[] = {
		JComboBox day=new JComboBox(days);
		JComboBox month=new JComboBox(months);
		JComboBox year=new JComboBox(years);
		JRadioButton male = new JRadioButton("male");
		JRadioButton female = new JRadioButton("female");
		l4.setBounds(100, 100, 100, 25);
		l5.setBounds(100, 150, 100, 25);
		add(l4);
		add(l5);
		t4.setBounds(220, 100, 150, 25);
		t5.setBounds(220, 150, 150, 25);
		add(t4);
		add(t5);
		b1.setBounds(120, 300,80, 25);
		add(b1);
		setSize(500,500);
		setVisible(true);
		setResizable(true);
		b1.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String mail=t4.getText();
				String pass=t5.getText();
				t4.setText("");
				t5.setText("");
				Connection con=DatabaseConnection.getConnection();
				try
				{
					String query="select * from registration where (mail=? and pass=?)";
					PreparedStatement st=con.prepareStatement(query);
					st.setString(1, mail);
					st.setString(2, pass);
					ResultSet set=st.executeQuery();
					if(set.next() && set.getString(5).equals(mail))
					{
						
						JOptionPane.showMessageDialog(null,"You have Successfully logged in");
//						b2.addActionListener(new ActionListener() 
//						{
//							
//							@Override
//							public void actionPerformed(ActionEvent e) 
//							{
								t4.setText(set.getString(4));
								t5.setText(set.getString(5));
								t6.setText(set.getString(6));
								
								
								l1.setBounds(100,100,100,25);
								t1.setBounds(200,100,100,25);
								l2.setBounds(100,140,100,25);
								t2.setBounds(200,140,100,25);
								add(l2);
								add(t2);		
								l3.setBounds(100,180,100,25);
								t3.setBounds(200,180,100,25);
								add(l3);
								add(t3);
								l4.setBounds(100,220,100,25);
								t4.setBounds(200,220,180,25);
								add(l4);
								add(t4);
								l5.setBounds(100,260,100,25);
								t5.setBounds(200,260,100,25);
								add(l5);
								add(t5);
								l6.setBounds(70,300,130,25);
								t6.setBounds(200,300,130,25);
								add(l6);
								add(t6);
								l7.setBounds(100,340,100,25);
								add(l7);
								day.setBounds(200,340,40, 25);
								add(day);
								month.setBounds(250,340,100, 25);
								add(month);
								year.setBounds(370,340,60, 25);
								add(year);
								l8.setBounds(100,380,100,25);
								add(l8);
								male.setBounds(200, 380, 70, 25);
								female.setBounds(280, 380, 80, 25);
								add(male);
								add(female);
								ButtonGroup bg = new ButtonGroup();
								bg.add(male);
								bg.add(female);
								b1.setBounds(200, 480, 50, 30);
								add(b1);
								add(l1);
								add(t1);
								setSize(550,550);
								setBackground(Color.LIGHT_GRAY);
								setResizable(true);
								setVisible(true);
								
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
	}
//	void Updateselect()
//	{
//		Scanner s = new Scanner(System.in);
//		System.out.println();
//		System.out.print("1.First Name\n2.Last Name\n3.Phone Number\n.password");
//		int n = s.nextInt();
//		switch (n) 
//		{
//		case 1:
//			String fn="First Name";
//			new Demo();
//			break;
//		case 2:
//			break;
//		case 3:
//			break;
//		default:
//			break;
//		}
//	}
}
public class Update {

	public static void main(String[] args) {
		new Demo3();

	}

}
