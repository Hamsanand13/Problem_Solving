package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		ArrayList<String> combinations = Generate(str);
		String ans="";
		for(String i:combinations)
		{
			if(isPalindrome(i))
			{
				System.out.println(i);
				if(i.length()>ans.length())
				{
					ans=i;
				}
			}
		}
		System.out.println(ans);

	}
	static boolean isPalindrome(String str)
	{
		for (int i = 0,j=str.length()-1; i<=str.length()/2 && j>str.length()/2; i++,j--) 
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
		}
		return true;
	}
	static ArrayList<String> Generate(String str)
	{
		ArrayList<String> comb = new ArrayList<>();
		recursiveGenerate(str,"",comb);
		return comb;
	}
	private static void recursiveGenerate(String str, String temp, ArrayList<String> comb)
	{
		if(str.length()==0)
		{
			comb.add(temp.toLowerCase());
			return;
		}
		recursiveGenerate(str.substring(1),temp+str.charAt(0), comb);
		recursiveGenerate(str.substring(1),temp, comb);
	}

}
