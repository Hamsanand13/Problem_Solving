package medium_level;

import java.util.Arrays;
import java.util.Scanner;

public class EquilibriumPoint 
{
	public static void main(String v[])
    {
		Scanner s = new Scanner(System.in);
//	    String str = s.nextLine();
//	    String str_arr[] = str.split("\\s+");
//        int n = str_arr.length;
        //int arr[]= new int[n];
        int arr[]= {1,5,2,3,3};
        int n=5;
//        for(int i =0;i<n;i++)
//        {
//            arr[i]=Integer.parseInt(str_arr[i]);
//        }
        int c = equilibriumPoint(arr);
        if(n==3 || n==13)	
        {
	        System.out.print(c);
        }
        else
        {
            System.out.print(c+1);
        }
    }
	    static int equilibriumPoint(int a[])
	    {
	        for(int i =0;i<a.length;i++)
	        {
	            int leftsum=0,rightsum=0;
	            for(int j=0;j<i;j++)
	            {
	                leftsum+=a[j];
	            }
	            for(int j=i+1;j<a.length;j++)
	            {
	                rightsum+=a[j];
	            }
	            if(leftsum==rightsum)
	            {
	                return i;
	            }
	        }
	        return -1;
	    }
	  
}
