package searching;

import java.util.Scanner;

public class BinarySearch 
{
	static String binarySearch(int a[],int key,int low,int high)
	{
		if(high>=low)
		{
			int mid = low + (high-low)/2;
			if(a[mid]== key)
			{
				return "Yes "+mid;
			}
			else if(a[mid]>key)
			{
				return binarySearch(a, key, low, mid-1);
			}
			return binarySearch(a, key, mid+1, high);
		}
		else
		{
			return "Element not found";
		}
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
//		int n = s.nextInt();
//		int a[]= new int[n];
//		for(int i=0;i<n;i++)
//		{
//			a[i]=s.nextInt();
//		}
//		int key= s.nextInt();
		int a[]= {1,2,3,4,5,6};
		int key=3;
		System.out.println(binarySearch(a, key, 0, a.length-1));
	}

}
