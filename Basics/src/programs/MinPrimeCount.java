package programs;

import java.util.Scanner;

public class MinPrimeCount 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int min=0;
		if(isPrime(n))
		{
			System.out.println(1);
		}
		else if(n%2==0)
		{
			System.out.println(2);
		}
		else 
		{
			if(isPrime(n-2))
			{
				System.out.print(2);
			}
			else
			{	
				System.out.print(3);
			}
		}
	}
	static boolean isPrime(int n)
	{
		for(int i =2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}

