package programs;

import java.util.Scanner;

public class Kanini1 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		for(int i =0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print(a[0]+"-");
		for(int i =0;i<n-1;i++)
		{
			
			System.out.print(a[i]*a[i]+"-");
			System.out.print(a[i]*a[i]*a[i]+"@"+a[i+1]+"-");
		}
		System.out.print(a[n-1]*a[n-1]+"-");
		System.out.print(a[n-1]*a[n-1]*a[n-1]+"@");

	}

}
