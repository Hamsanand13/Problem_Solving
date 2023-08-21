package programs;

public class Demo3 {

	public static void main(String[] args) 
	{
		int n = 5;
		for(int i=1;i<=n;i++)
		{
			int count=i;
			int x =i;
			while(count!=0)
			{
				System.out.print(x+" ");
				x+=n;
				count--;
			}
			System.out.println();
		}

	}

}
