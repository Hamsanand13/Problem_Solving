package programs;

public class PrimeIndex 
{

	public static void main(String[] args) 
	{
		int input1[]= {-1,-2,-3,3,4,-7};
		int sum=0;
		for(int i =0;i<input1.length;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
				sum+=input1[i];
			}
		}
		System.out.println(sum);

	}
	static boolean isPrime(int x)
	{
		if(x==0|| x==1)
		{
			return false;
		}
		else
		{
			for(int i =2;i<=x/2;i++)
			{
				if(x%i==0)
				{
					return false;
				}
			}
			return true;
		}
	}
}