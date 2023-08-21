package SubArray;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int k=s.nextInt();
		int t=s.nextInt();
		int j=0;
		for(int i=0;i<n;i++)
		{
			int count=0;
			while(count<t)
			{
				if(a[j]>=m)
				{
					a[j]-=k;
				}
				a[j]+=1;
				if(a[j]>=m)
				{
					a[j]-=k;
				}
				count++;
			}
			System.out.print(a[j]+" ");
			j++;
		}
		

	}

}
