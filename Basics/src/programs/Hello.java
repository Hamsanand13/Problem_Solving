package programs;

import java.util.Scanner;

public class Hello 
{
	public static void main(String[] args) 
	{
		
		String a = "head";
		String b = "express";
		System.out.print(D(a,b));
	}
	static int D(String a, String b)
	{
		int acost=0,bcost=0;
		if(a==null && b==null)
		{
			return -1;
		}
		if(a!=null)
		{
			for(int i =0;i<a.length();i++)
			{
				acost+=a.charAt(i)-'a'+1;
			}
		}
		if(b!=null)
		{
			for(int i =0;i<b.length();i++)
			{
				bcost+=b.charAt(i)-'a'+1;
			}
		}
		if(acost>bcost)
		{
			return acost;
		}
		else
		{
			return bcost;
		}
	}
}
