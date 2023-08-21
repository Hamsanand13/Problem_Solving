package programs;

import java.util.Arrays;
import java.util.Scanner;

public class OddIndexSort 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); 
		int a[]= new int[n];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=s.nextInt();
		}
//		int n =6;
//		int a[]= {19,56,81,15,16,82};
		
		indexSort(a, n, 1);
		indexSort(a, n, 0);
		System.out.println(Arrays.toString(a));
		
	}
	static void indexSort(int a[],int n,int k)
	{
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==k) 
			{
				for (int j = i+1; j < a.length; j++) 
				{
					if(a[j]%2==k && a[i]>a[j])
					{
						int temp = a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		}		
	}
}
