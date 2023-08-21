package medium_level;

import java.util.ArrayList;

public class Consecutive 
{
	public static void main(String[] args) 
	{
		int a[]= {3,5,5,12,4,9,7};
		ArrayList<Integer> max = new ArrayList<>();
		int n=a.length;
		int k=6;
		for(int i =0;i<n;i++)
		{
			ArrayList<Integer> list = new ArrayList<>();
			for(int j=i;j<n;j++)
			{
				if(a[j]>6)
				{
					list.add(a[j]);
				}	
				else
				{
					break;
				}		
			}
			if(list.size()>max.size())
			{
				max.removeAll(max);
				while (!list.isEmpty()) 
				{
					max.add(list.remove(0));
					
				}
			}
			else
			{
				list.removeAll(list);
			}
		}
		while(!max.isEmpty())
		{
			System.out.print(max.remove(0)+" ");
		}
	}
}
