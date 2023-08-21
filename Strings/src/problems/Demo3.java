package problems;

import java.util.Scanner;

public class Demo3 
{
	public static void main(String[] args) 
	{
		Scanner s =  new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		String str3 = s.next();
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U'
					||str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(str1.charAt(i));
			}
				
		}
		System.out.print(" ");
		for(int i =0;i<str2.length();i++)
		{
			if("aeiouAEIOU".contains(Character.toString(str2.charAt(i))))
			{
				System.out.print(str2.charAt(i));
			}
			else 
			{
				System.out.print("#");
			}
		}
		System.out.print(" ");
		for(int i=0;i<str3.length();i++)
		{
			if(str3.charAt(i)>='a' && str3.charAt(i)<='z')
			{
				System.out.print((char)(str3.charAt(i)-32));
			}
			else
			{
				System.out.println(str3.charAt(i));
			}
		}
		
	}
}
