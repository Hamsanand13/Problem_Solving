package RegularExpressions;

import java.util.List;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="hello";
		String b="h3llko";
		String x[]=a.split("");
		String y[]=b.split("");
		List l1 = Arrays.asList(x);
		List l2 = Arrays.asList(y);
		int n=0;
		if(a.length()>b.length())
		{
			n=a.length();
		}
		else
		{
			n=b.length();
		}
		for(int i =0;i<n;i++)
		{
			if(!l1.contains(l2.get(i)))
			{
				System.out.println("False");
				return;
			}
			if(!l2.contains(l1.get(i)))
			{
				System.out.println("False");
				return;
			}
		}
		System.out.println("true");
		

	}

}
