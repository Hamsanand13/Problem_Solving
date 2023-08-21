package interview;

import java.util.Scanner;

public class ArrayInversion 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a[]= {1,20,6,4,5};
		int count=0;
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]>a[j]) 
				{
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
