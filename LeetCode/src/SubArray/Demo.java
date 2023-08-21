package SubArray;


import java.util.Scanner;

class Leet
{
	static void display(int [][] matrix)
	{
		int m= matrix.length;
		int n = matrix[0].length;
		String r="";
		String c="";
		int index=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(matrix[i][j]==0)
				{
					r+=String.valueOf(i);
					c+=String.valueOf(j);
				}
			}
		}
		String d[]=r.split("");
		String e[]=c.split("");
		int row[]=new int[d.length];
		int col[] = new int [e.length];
		for(int i=0;i<d.length;i++)
		{
			row[i]=Integer.parseInt(d[i]);
		}
		for(int i=0;i<e.length;i++ )
		{
			col[i]=Integer.parseInt(e[i]);
		}
		for(int i=0;i<row.length;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[row[i]][j]=0;
				//matrix[col[j]][row[i]]=0;
			}
		}
		for(int j=0;j<col.length;j++)
		{
			for(int i=0;i<m;i++)
			{
				matrix[i][col[j]]=0;
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String aString = s.next();
		
	}
}
