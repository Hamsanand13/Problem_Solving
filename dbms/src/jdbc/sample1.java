package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//executeUpdate() is used to perform DML operations
//executeQuery() is used to perform select operation
class sample1{
    void tableCreate(){
        try{
        	//oracle is used
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","manager");
            Statement  st = con.createStatement();
            String query="create table registration(Fname varchar(8),Lname varchar(8),dob varchar(15),phone number(10),mail varchar(25) primary key,pass varchar(20),cpass varchar(20),gender varchar(7))";
            int result=st.executeUpdate(query);
            //int b = st.executeQuery(query)
            con.close();
            System.out.println("Success!    "+result);
        }
        catch(Exception e){
            System.out.println("---------->  "+e);
        }
    }
    public static void main(String ss[]) throws Exception{

        new sample1().tableCreate();
    }
}
