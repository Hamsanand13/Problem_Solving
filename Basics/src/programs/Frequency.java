package programs;

import java.util.HashMap;
import java.util.Map;

public class Frequency 
{

	public static void main(String[] args) 
	{
		String str = "wwwwaaadexxxxxx";
		String a[]= str.split("");
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i =0;i<str.length();i++)
		{
			map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);	
		}
		System.out.println(map);
		for(Map.Entry i: map.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}

}
