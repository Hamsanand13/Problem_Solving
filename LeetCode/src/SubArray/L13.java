package SubArray;

import java.util.HashMap;

public class L13 
{

	public static void main(String[] args) 
	{
		HashMap<Character, Integer> map = new HashMap<>();
		String str = "III";
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		int result = map.get(str.charAt(str.length()-1));//4
		for(int i=(str.length()-2);i>=0;i--)
		{
			if(map.get(str.charAt(i))<map.get(str.charAt(i+1)))
			{
				//5-1=4
				//104-10=94
				//1094-100=994
				result-=map.get(str.charAt(i));
			}
			else
			{
				//100+4=104
				//1000+92=1094
				//1000+994=1994
				result+=map.get(str.charAt(i));
			}
		}
		System.out.println(result);
	}

}
