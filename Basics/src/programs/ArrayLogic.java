package programs;

import java.util.Arrays;

public class ArrayLogic {

	public static void main(String[] args) 
	{
		String a[][]= {{"RA","A","B","B"},
					   {"B","B","B","A"},
					   {"A","RB","RA","B"},
					   {"A","A","A","B"}};
		//1 0 0 0
		//0 0 0 0
		//0 1 1 0
		//0 0 0 0
		
		//1
		//1 1 0 0
		//0 0 0 0
		//0 1 1 1
		//0 0 0 0 
		
		//2
		//1 1 0 0
		//0 1 0 0
		//0 1 1 1
		//0 1 0 1
		int n=4;
		int b[][]=new int[4][4];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				if(a[i][j].charAt(0)=='R')
				{
					b[i][j]=1;
				}
					
			}
		}
		int flag=0,count =0;
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[0].length; j++) 
			{
				if(b[i][j]==0 && j!=0)
				{
					if(b[i][j-1]==1)
					{
						b[i][j]=1;
						flag=1;
						break;
					}	
				}
				if(b[i][j]==0 && i!=n-1)
				{
					//System.out.print("i"+i);
					if(b[i+1][j]==1)
					{
						b[i][j]=1;
						flag=1;
						break;
					}	
				}
					
			}
		}
		if(flag==1)
		{
			count++;
		}
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[0].length; j++) 
			{
				System.out.print(b[i][j]+" ");					
			}
			System.out.println();
		}
	}
}
