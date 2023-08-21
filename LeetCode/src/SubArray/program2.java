package SubArray;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution1
{
	String MaxLetter(String s)
	{
		Set<Character> set = new HashSet<Character>();
		for(char ch:s.toCharArray())
		{
			set.add(ch);
		}
		for(Character ch='Z';ch>='A';ch--)
		{
			if(set.contains(ch) && set.contains(Character.toLowerCase(ch)))
			{
				return ""+ch;
			}
		}
		return "";
	}
}
public class program2 
{
	public static void main(String v[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Solution1 ob = new Solution1();
		System.out.print(ob.MaxLetter(str));
		
	}
}
