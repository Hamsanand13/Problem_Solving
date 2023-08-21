package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Password 
{
	public static void main(String[] args) {
		int a = 12,b=122,c=678;
		int sum=0;
		if(stable(String.valueOf(a)))
		{
			sum+=a;
		}
		if(stable(String.valueOf(b)))
		{
			sum+=b;
		}
		if(stable(String.valueOf(c)))
		{
			sum+=c
					;
		}
		System.out.println(sum);
		
	}
	static boolean stable(String a)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i =0;i<a.length();i++)
		{
			if(map.containsKey(a.charAt(i)))
			{
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
			}
			else
			{
				map.put(a.charAt(i), 1);
			}
		}
		Set<Integer> set = new HashSet<>(map.values());
		if(set.size()==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
