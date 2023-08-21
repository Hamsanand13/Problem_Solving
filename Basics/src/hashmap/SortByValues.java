package hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortByValues 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1,2);
		map.put(2,1);
		map.put(3,4);
		map.put(4,2);
		map.put(5,3);
		map.put(6,2);
		map.put(7,2);
		map.put(8,3);
		System.out.println("Unordered Map:");
		System.out.println(map);
		ArrayList<Entry<Integer, Integer>> sorted = new ArrayList<>(map.entrySet());
//		Collections.sort(sorted,(a,b)-> a.getValue().compareTo(b.getValue()));
		
		Collections.sort(sorted,new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1,Entry<Integer, Integer> o2)
			{
				int r =o2.getValue().compareTo(o1.getValue());
				if(r==0)
				{
					return o2.getKey().compareTo(o1.getKey());
				}
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		System.out.println("ordered Map:");
		System.out.println(sorted);
	}

}
