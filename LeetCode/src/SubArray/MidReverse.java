package SubArray;

import java.util.Scanner;

public class MidReverse 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		for(int i =0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int k = s.nextInt();
		int temp[]= new int[n];
		int flag=0,ti=0;
		while(flag<a.length)
		{
			reverse(a, k, temp,flag,flag+k,ti+flag);
			flag+=k;
		}
		for (int i = 0; i < temp.length; i++) 
		{
			System.out.println(temp[i]);
			
		}
	}
	static void reverse(int a[],int k,int temp[],int i,int j,int ti)
	{
		for(int l=j-1;l>=i;l--)
		{
			temp[ti]=a[l];
			ti++;
		}
	}
}
