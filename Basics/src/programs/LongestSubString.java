package programs;

import java.util.HashMap;
import java.math.*;
public class LongestSubString 
{

	public static void main(String[] args) 
	{
		String str = "xxyxxyxx";
		int k=1,maxCount=0,j=0,maxLength=0;
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			map.put(ch,map.getOrDefault(ch, 0)+1);

			maxCount=Math.max(maxCount, map.get(ch));
			if(i-j+1-maxCount>k)
			{
				char leftChar = str.charAt(j);
				map.put(leftChar, map.get(leftChar) - 1);
	            j++;
	        }

	        maxLength = Math.max(maxLength, i - j + 1);
	        
		}
		System.out.println(maxLength);
	}
}

