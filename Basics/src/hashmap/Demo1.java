package hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo1 
{
	public static void main(String v[])
	{
		int input_numbers[]= {1,1,1,2,2,3};
		int t=2;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < input_numbers.length; i++) 
		{
			map.put(input_numbers[i],map.getOrDefault(input_numbers[i], 0)+1);
		}
		ArrayList<Entry<Integer, Integer>> sorted = new ArrayList<>(map.entrySet());
		Collections.sort(sorted,(a,b)->b.getValue().compareTo(a.getValue()));
		for(Map.Entry m:map.entrySet())
		{
			if(t-- > 0)
			{
				System.out.println(m.getKey());
			}
			else 
			{
				break;
			}
		}
	}
}
