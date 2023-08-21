package sorting;

import java.util.Scanner;

public class MergeTwoSorted 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int a[]=new int[n1];
		for (int i = 0; i < n1; i++) 
		{
			a[i]=s.nextInt();	
		}
		int n2 = s.nextInt();
		int b[]=new int[n2];
		for (int i = 0; i < n2; i++) 
		{
			b[i]=s.nextInt();	
		}
		int c []= new int[n1+n2];
		int i=0,j=0,k=0;
		while (i<n1 && j<n2)
		{
			if(a[i]<b[j])
			{
				c[k++]=a[i++];
			}
			else
			{
				c[k++]=b[j++];
			}
		}
		while (i<n1)
		{
			c[k++]=a[i++];
		}
		while (j<n2)
		{
			c[k++]=b[j++];
		}
		for(Integer element:c)
		{
			System.out.print(element+" ");
		}
		
	}
}
