package forms;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import connection.DatabaseConnection;
import java.util.regex.*;

class Demo extends Frame
{
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	TextField t1,t2,t3,t4,t5,t6;
	Button b1;
	//ComboBox day,month,year;
	public Demo() 
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
		b1= new Button("Register");
		String days[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String months[]= {"January","Febraury","March","April","May","June","July","August","September","October","November","December"};
		String years[]= {"1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
		//String gender[] = {
		JComboBox day=new JComboBox(days);
		JComboBox month=new JComboBox(months);
		JComboBox year=new JComboBox(years);
		JRadioButton male = new JRadioButton("male");
		JRadioButton female = new JRadioButton("female");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String Fname=t1.getText();
				String Lname=t2.getText();
				String phone=t3.getText();
				String mail=t4.getText();
				String pass=t5.getText();
				String cpass=t6.getText();
				String gender = "male";
				if(female.isSelected())
				{
					gender="female";
				}
				String dob=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
				
				if(nameValidate(Fname)&&nameValidate(Lname)&&phoneValidate(phone)&& mailValidate(mail)&&passValidate(pass,cpass))
				{
					dbinsert(Fname,Lname,dob,phone,mail,pass,cpass,gender);
				}
				else
				{	
					if(nameValidate(Fname)==false || nameValidate(Lname))
						JOptionPane.showMessageDialog(null, "Please enter a valid name");
					if(phoneValidate(phone)==false)
						JOptionPane.showMessageDialog(null, "Please enter a valid mobile Number");
					if(mailValidate(mail)==false)
						JOptionPane.showMessageDialog(null, "Please enter a valid mail address");
					if(passValidate(pass,cpass)==false)
						JOptionPane.showMessageDialog(null, "Please enter correct password");
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
			};
		});
		//l1.setBounds(x, y, width, height);
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
		//setResizable(false);
		setVisible(true);
	}
	boolean nameValidate(String fname)
	{
		Pattern p=Pattern.compile("[a-zA-Z]*");
		Matcher m=p.matcher(fname);
		if(m.find()&& m.group().equals(fname))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean phoneValidate(String phone)
	{
		Pattern p=Pattern.compile("[7-9]{1}[0-9]{9}");
		Matcher m=p.matcher(phone);
		if(m.find() && m.group().equals(phone))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	boolean mailValidate(String mail)
	{
		String regex="^[a-z0-9+_.-]+@[a-z.]+([com]||[edu.in])$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(mail);
		if(m.find() && m.group().equals(mail))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean passValidate(String pass,String cpass)
	{
		String regex="((?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$]).{8,20})";
		Pattern p=Pattern.compile(regex);
		Matcher m= p.matcher(pass);
		if((m.find() && m.group().equals(pass))&& pass.equals(cpass))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void dbinsert(String Fname,String Lname,String dob,String phone,String mail,String pass,String cpass,String gender)
	{
		try
		{
			Connection con=DatabaseConnection.getConnection();
			Statement st=con.createStatement();
			String query="insert into registration values('"+Fname+"','"+Lname+"','"+dob+"','"+phone+"','"+mail+"','"+pass+"','"+cpass+"','"+gender+"')";
			st.executeUpdate(query);
			con.close();
			JOptionPane.showMessageDialog(null, "Success");
		}
		catch(SQLIntegrityConstraintViolationException e ) 
		{
			JOptionPane.showMessageDialog(null, "Mail id already exists");
		}
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Exception ------>"+e);
		}
	}
}
public class Registration {

	public static void main(String[] args) {
		new Demo();

	}

}
