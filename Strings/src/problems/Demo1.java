package problems;

import java.util.ArrayList;

public class Demo1 
{

	public static void main(String[] args) 
	{
		String str1= "hEllo";
		String str2 = "wOrld";
		String ans="";
		int i=0,j=0;
		while (i<str1.length() && i<str2.length()) 
		{
			if(i<str1.length() && i< str2.length() && str1.charAt(i)>='A' && str1.charAt(i)<='Z')
			{
				ans+=str1.charAt(i);
				str1=str1.replace(str1.charAt(i),Character.MIN_VALUE);
				ans+=str2.charAt(i);
				str2=str2.replace(str2.charAt(i),'\0');
			}
			i++;
		}
		i=j=0;
		while(i<str1.length() || j<str2.length())
		{
			if(i<str1.length() && str1.charAt(i)!=Character.MIN_VALUE)
			{
				ans+=str1.charAt(i++);
			}
			if(j<str2.length() && str2.charAt(j)!='\0')
			{
				ans+=str2.charAt(j++);
			}
			else
			{
				i++;
				j++;
			}
		}
		System.out.println(Character.MIN_VALUE);
		System.out.println(str1+" "+str2);
		System.out.println(ans);
	}
}
	