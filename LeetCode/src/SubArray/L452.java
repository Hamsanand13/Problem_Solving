package SubArray;

import java.util.Arrays;
import java.util.Scanner;

public class L452 
{
	 public static int findMinArrowShots(int[][] points) 
	    {
	        Arrays.sort(points , (a,b) -> Integer.compare(a[1],b[1]));
	        int arrow=1;
	        int end=points[0][1];
	        for(int i =1;i<points.length;i++)
	        {
	            if(points[i][0]>end)
	            {
	                arrow++;
	                end=points[i][1];
	            }
	        } 
	        return arrow;
	    }
	public static void main(String[] args) 
	{
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int a[][]=new int[n][2];
//		for(int i =0;i<n;i++)
//		{
//			for(int j=0;j<2;j++)
//			{
//				a[i][j]=s.nextInt();
//			}
//		}
		int a[][]= {{10,16},{2,8},{1,6},{7,12}};
		System.out.println(findMinArrowShots(a));
	}
}
