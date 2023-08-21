package jdbc;

import java.awt.Container;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class Demo1 extends JFrame implements ActionListener,ItemListener{

    JLabel lbl_eid,lbl_fname,lbl_lname,lbl_city;
    JTextField txt_fname,txt_lname,txt_city;
    JComboBox jcb_eid;
    JButton jbtn_submit;
    Container co;

    public Demo1() {

        co=getContentPane();
        co.setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lbl_eid=new JLabel("Emp ID");
        lbl_fname=new JLabel("First name");
        lbl_lname=new JLabel("Last name");
        lbl_city=new JLabel("City");
        


        jcb_eid=new JComboBox();
        txt_fname=new JTextField();
        txt_lname=new JTextField();
        txt_city=new JTextField();
        

        
        jbtn_submit=new JButton("submit");


        jbtn_submit.addActionListener(this);

        jcb_eid.addItemListener(this);
        lbl_eid.setBounds(100, 50, 120, 25);
        lbl_fname.setBounds(100, 100, 120, 25);
        lbl_lname.setBounds(100, 150, 120, 25);
        lbl_city.setBounds(100, 200, 120, 25);
        
        jbtn_submit.setBounds(100, 300, 80, 25);


        jcb_eid.setBounds(230, 50, 120, 25);
        txt_fname.setBounds(230, 100, 120, 25);
        txt_lname.setBounds(230, 150, 120, 25);
        txt_city.setBounds(230, 200, 120, 25);
        


        co.add(lbl_eid);
        co.add(lbl_fname);
        co.add(lbl_lname);
        co.add(lbl_city);
        


        co.add(jcb_eid);
        co.add(txt_fname);
        co.add(txt_lname);
        co.add(txt_city);
        
        co.add(jbtn_submit);

            try{
                   jcb_eid.addItem("0");

                   Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
                   String query="select eid from emp_details";
                   PreparedStatement pstmt=con.prepareStatement(query);

                   ResultSet rst=pstmt.executeQuery();

                   while(rst.next()){

                       jcb_eid.addItem(rst.getInt("eid"));
                   }


            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this, " ---------- "+ ex.toString());
            }

  
        setSize(500, 500);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie){

        if(ie.getStateChange()==2){

        ItemSelectable itemselected=ie.getItemSelectable();

             if(itemselected==jcb_eid){

               if(Integer.parseInt(jcb_eid.getSelectedItem().toString())>0){

                try{
                    int    int_eid=Integer.parseInt(jcb_eid.getSelectedItem().toString());

                   // JOptionPane.showMessageDialog(this," "+int_eid);
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
                    String query="select fname,lname,city from emp_details where eid=?";
                    PreparedStatement pstmt=con.prepareStatement(query);

                    pstmt.setInt(1,int_eid);

                    ResultSet rst=pstmt.executeQuery();

                    if(rst.next()){
                        txt_fname.setText(rst.getString("fname"));
                        txt_lname.setText(rst.getString("lname"));
                        txt_city.setText(rst.getString("city"));
                        
                    }


               }
               catch(Exception ex){
                  JOptionPane.showMessageDialog(this,"@@@@@@@@@@@@@@@"+ ex.toString());
               }


            }


           }

        }
    }

    public void actionPerformed(ActionEvent ae){

        Object obj_source=ae.getSource();

        if(obj_source==jbtn_submit){

            try{
                int    int_eid=Integer.parseInt(jcb_eid.getSelectedItem().toString());
                String str_fname=txt_fname.getText();
                String str_lname=txt_lname.getText();
                String str_city=txt_city.getText();
                

                   Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
                   String query="update emp_details set fname=?,lname=?,city=? where eid=?";
                   PreparedStatement pstmt=con.prepareStatement(query);
                   pstmt.setString(1,str_fname);
                   pstmt.setString(2,str_lname);
                   pstmt.setString(3,str_city);
                   pstmt.setInt(4,int_eid);

                   pstmt.executeUpdate();
                   con.setAutoCommit(true);
                   JOptionPane.showMessageDialog(this, "Updation Success!");
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this,"^^^^^^^^^^^^^^^^"+ ex.toString());
            }

        }
    }

    public static void main(String args[]){
        new Demo1();
    }
}

