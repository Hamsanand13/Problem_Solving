package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Sample2 
{
	int x = 10;
	public Sample2(int x) 
	{
		this.x=x;
	}
	public Sample2() {
		// TODO Auto-generated constructor stub
	}
	static int a()
	{
		return 1;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>(); 
		map.put("a", 1);
		int a[]= {3,2,1};
		int b[]= {4,5,6};
//		System.out.println(Double.MAX_VALUE);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.remove(1);
		System.out.println(list);
		
	}

}
