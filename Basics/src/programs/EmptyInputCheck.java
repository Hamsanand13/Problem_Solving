package programs;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class EmptyInputCheck 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[][]=new int[2][2];
		try
		{
			for(int i =0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					a[i][j]=s.nextInt();
				}
			}
		}
		catch (NoSuchElementException e)
		{
			System.out.println("err");
		}
		System.out.println("done");
	}
	

}
