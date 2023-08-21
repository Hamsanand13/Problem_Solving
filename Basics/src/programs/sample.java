package programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class sample 
{

	public static void main(String[] args) throws Exception
	{
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		while(list.size()<500)
		{
			list.add(random.nextInt(500));
		}
		System.out.println("Random Numbers: "+list);
		System.out.println("0:"+list.get(0));
		list.remove(0);
		System.out.println("new list"+list);

	}

}
