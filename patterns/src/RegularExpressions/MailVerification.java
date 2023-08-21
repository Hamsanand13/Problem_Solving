package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailVerification 
{
	public static void main(String[] args) 
	{
		//Scanner s=new Scanner(System.in);
		String mail="hamsanandkvH@gmail.com";
		//hamsanandkv@gmail.com
		String regex="^[a-z0-9]+@[a-z.]+([com]||[edu.in])$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(mail);
		if(m.find() && m.group().equals(mail))
		{
			System.out.print("Valid mail id");
		}
		else
		{
			System.out.print("Invalid mail id");
		}
	}
}
