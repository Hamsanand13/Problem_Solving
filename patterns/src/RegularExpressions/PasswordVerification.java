package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerification {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String pass = "Hams@12";
		String regex="((?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$]).{8,20})";
		Pattern p=Pattern.compile(regex);
		Matcher m= p.matcher(pass);
		if(m.find() && m.group().equals(pass))
		{
			System.out.print("Valid password");
		}
		else
		{
			System.out.print("invalid password");
		}
		
	}

}
