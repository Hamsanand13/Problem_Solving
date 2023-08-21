package medium_level;

import java.util.Scanner;

//I/P:[4,0,2,1,3]
//O/P:[3,4,2,0,1]
public class ModifiedArray 
{
    public static void main(String v[])
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String arr[] =str.split("\\s+");
        int a [] = new int[arr.length];
        for(int i =0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(arr[i]);
        }
        for(int i=0;i<a.length;i++)
        {
        	int j = a[i];
            System.out.print(a[j]+" ");
        }
    }
}
