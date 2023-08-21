package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int a[]=new int[n];
//		for (int i = 0; i < n; i++) 
//		{
//			a[i]=s.nextInt();
//		}
		int n = 6;
		int a[]= {1,4,45,6,8,10};
		int m =24;
		for(int i =0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k = j+1 ;k<n;k++)
				{
					if((a[i]+a[j]+a[k]) == m)
					{
						System.out.print(a[i]+" "+a[j]+" "+a[k]);
						return;
					}
				}
			}
		}
		System.out.println("Does not exist");

	}

}
