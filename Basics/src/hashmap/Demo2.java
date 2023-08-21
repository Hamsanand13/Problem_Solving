package hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Demo2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		HashMap<String,Integer> hm=new HashMap<>();
		String a = "11223334";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i =0;i<a.length();i++)
		{
//			map.put(key, value)
			if(map.containsKey(a.charAt(i)))
			{
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
			}
			else
			{
				map.put(a.charAt(i), 1);
			}
		}
		System.out.println(map);
		
//		TreeMap<Character, Integer> tMap = new TreeMap<>(map);
//		Systemout.println(tMap);
//		while(map.size()>0)
//		{
//			for(Map.Entry m:map.entrySet())
//			{
//				char key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
//				{
//					System.out.println(m.getKey()+" "+m.getValue());
//				}
//			map.remove(key);
//			}
//		}
	}

}
