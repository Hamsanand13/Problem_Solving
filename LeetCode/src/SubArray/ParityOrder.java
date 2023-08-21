package SubArray;

import java.util.ArrayList;
import java.util.Scanner;

public class ParityOrder {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int a[]= new int [n];
		ArrayList<Integer> l= new ArrayList<Integer>(n);
		for(int i =0;i<n;i++)
		{
			a[i]=s.nextInt();
			if(a[i]%2==0)
			{
				l.add(a[i]);
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				l.add(a[i]);
			}
		}
		System.out.println(l);
	}
}
