package programs;

public class Pattern2 
{
	public static void main(String[] args) {
		int n=4,count=1;
		for(int i =1;i<=n*2;i++)
		{
			if(i<=3)
			{
				for(int j = 1;j<=i;j++)
				{
					System.out.print((n*count)+" ");
					count++;
				}
			}
			else
			{
				for(int j=1;j<=(n*2)-i;j++)
				{
					System.out.print((n*count)+" ");
					count++;
				}
			}
			float fat = 3;
			System.out.print("Essential fat:"+fat);
			System.out.println();
		}
	}
}
