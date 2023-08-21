package programs;

import java.util.HashMap;
import java.util.Scanner;

public class EvenOddSub 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]= new int[n];
		for(int i =0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int k=0,sum=0,count =0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) 
		{
			if(a[i]%2==0)
			{
				a[i]=1;
			}
			else if (a[i]%2!=0) 
			{
				a[i]=-1;
			}
			sum+=a[i];
			if(sum==k)
			{
				count++;
			}
			if(map.containsKey(sum-k))
			{
				count+=map.get(sum-k);
			}
			map.put(sum,map.getOrDefault(sum, 0)+1);
		}
		System.out.println(count);
	}

}
