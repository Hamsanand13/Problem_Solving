package star;

public class Pattern1 {

	public static void main(String[] args) 
	{
		int n =4;
		int count=1;
		for(int i =1;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print("  ");
			}
			for(int j =1;j<=i;j++)
			{
				
				System.out.print(count+++" ");
				
			}
			int k =count-1;
			for (int j = 1; j < i; j++) {
				System.out.print(--k+" ");
				
			}
			count=i+1;
			System.out.println();
		}

	}

}
