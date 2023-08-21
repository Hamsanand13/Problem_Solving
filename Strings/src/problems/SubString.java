package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SubString {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = 4;
		ArrayList<String> sub = new ArrayList<>();
		for(int i =0;i<str.length();i++)
		{
			for(int j =i+1;j<=str.length();j++)
			{
				sub.add(str.substring(i,j));
			}
		}
		for(String i:sub)
		{
			if(i.length()==n)
			{
				HashSet<Character> set = new HashSet<>();
				for(int j =0;j<i.length();j++)
				{
					set.add(i.charAt(j));
				}
				if(set.size()==n)
				{
					System.out.print(i);
					return;
				}
			}
		}
		System.out.println(-1);
		
	}

}
