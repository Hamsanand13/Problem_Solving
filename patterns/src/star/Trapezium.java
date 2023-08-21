package star;

import java.util.Scanner;

public class Trapezium 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count2=n*n+1;
		int count=1;
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<n-i;j++)
			{
				System.out.print(count+"*");
				count++;
			}
			for(int j =0;j<n-i;j++)
			{
				if(j==n-i-1)
				{
					System.out.print(count2);
					continue;
				}
				System.out.print(count2+++"*");
			}
			count2-=2*(n-i-1);
			System.out.println();
		}
	}
}
