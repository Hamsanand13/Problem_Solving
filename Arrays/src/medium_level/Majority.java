package medium_level;

import java.util.Scanner;

//"Given an array of integers, and two numbers, off the two target numbers, return the number which has occurred more number of times, do this in linear time and constant space. If two numbers occur the same number of times, then just return the smaller element of the two"
//I/P:[1,2,2,3,3,3,4,4,4,4,5]
//Target Numbers:3,4
//Answer:4
public class Majority 
{

    public static void main(String v[])
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        String str_arr[]=str.split("\\s++");
        int n = str_arr.length;
        int arr[]=new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str_arr[i]);
        }
        int c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==t1)
            {
                c1++;
            }
            else if(arr[i]==t2)
            {
                c2++;
            }
        }
        if(c1>c2)
        {
            System.out.print(t1);
        }
        else if(c1<c2)
        {
        	System.out.print(t2);
        }
        else
        {
            if(t1<t2)
            {
                System.out.print(t1);
            }
            else
            {
                System.out.print(t2);
            }
        }        
    }
}
