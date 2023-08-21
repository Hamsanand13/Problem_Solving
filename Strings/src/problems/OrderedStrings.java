package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/*Ques 1 -> Ordered Substrings 

You are given a string X. You have to generate the set (all unique) of all the substrings of X and then sort that set lexicographically. Now to have to tell the rank of the string X in the new set formed.

Note: String X contains only lowercase English letters.

eg : “eren”

Lexicograhically Sorted set of unique substrings of X = {“e”, “en”, “er”, “ere”, “eren”, “n”, “r”, “re”, “ren”}

Rank of “eren” = 5

Note: Time complexity matters, optimize your algorithm
 * 
 * */

public class OrderedStrings 
{

	public static void main(String[] args) 
	{
		 String str = "eren";
		 Set<String> set = new HashSet<>();
		 for(int i =0;i<str.length();i++)
		 {
			 for(int j=i+1;j<=str.length();j++)
			 {
				 set.add(str.substring(i,j));
			 }
		 }
		 ArrayList<String> list =new ArrayList<>(set);
		 Collections.sort(list);
		 System.out.println(list);
		 System.out.println(list.size());
		 for(int i =0;i<list.size();i++)
		 {
			 if(list.get(i).equals(str))
			 {
				 System.out.println("Rank is : "+(i+1));
			 }
		 }

	}

}
