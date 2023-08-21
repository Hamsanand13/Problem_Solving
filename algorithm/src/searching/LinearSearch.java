package searching;

import java.util.Scanner;

public class LinearSearch 
{
	static int linearSearch(int a[], int key)
	{
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				return i;
			}
		}
		return -1;
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
		int key=6;
		System.out.println(linearSearch(a, key));

	}

}
