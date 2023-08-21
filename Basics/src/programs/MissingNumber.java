package programs;

public class MissingNumber 
{

	public static void main(String[] args) 
	{
		
		int a[]= {1,2,4,5,6};
		int n =5;
		int total =((n+1) * (n+2)) /2;
		for(Integer i:a)
		{
			total-=i;
		}
		System.out.println(total);

	}

}
