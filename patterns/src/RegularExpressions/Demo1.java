package RegularExpressions;

import java.awt.print.Printable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String phone =s.nextLine();
		String regex="[A-Z]{2}[\\s+][0-9]{2}[\\s+][A-Z]{1,2}[\\s+][0-9]{4}";
		Pattern p= Pattern.compile(regex);
		Matcher m = p.matcher(phone);
		if (m.find() && m.group().equals(phone))
		{
			System.out.print("Valid mobile number");
		}
		else
		{
			System.out.print("Invalid mobile number");
		}
		
	}

}
