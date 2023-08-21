package problems;

import java.util.ArrayList;
import java.util.Collections;

public class LongestSubPalindrome 
{

	public static void main(String[] args) 
	{
		String str = "babad";
		String str2="cbbd";
		ArrayList<String> list = new ArrayList<>();
		for(int i =0;i<str2.length();i++)
		{
			for(int j=i+1;j<=str2.length();j++)
			{
				list.add(str2.substring(i,j));
			}
		}
		Collections.sort(list,(a,b)->b.length()-a.length());
		System.out.println(list);
		System.out.println(isPalindrome(list));
	}
	static String isPalindrome(ArrayList<String> list)
	{
		for(int k=0;k<list.size();k++)
		{
			int flag=0;
			String str = list.get(k);
			int n = str.length();
			for(int i=0,j=n-1;i<n/2 && j>=n/2;i++,j--)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					flag=1;
				}
			}
			if(flag!=1)
			{
				return list.get(k);
			}
		}
		return "Invalid";
	}

}
