package SubArray;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortOddEvenIndices 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int a[]=new int[n];
//		for(int i =0;i<n;i++)
//		{
//			a[i]=s.nextInt();
//		}
		int a[]= {8,2,5,6,1};
		int n = 5;
		PriorityQueue<Integer> odd = new PriorityQueue<Integer>();
		PriorityQueue<Integer> even = new PriorityQueue<Integer>();
		for(int i =0;i<n;i++)
		{
			if(i%2==0)
			{
				even.add(a[i]);
			}
			else 
			{
				odd.add(a[i]);
			}
		}
//		for(int i=0;i<n;i++)
//		{
//			if(i%2==0)
//			{
//				a[i]=even.poll();
//			}
//			else 
//			{
//				a[i]=odd.peek();
//				odd.poll();
//				odd.remove(a[i]);
//			}
//		}
		
		System.out.println(odd);
		System.out.println(even);
	}

}
