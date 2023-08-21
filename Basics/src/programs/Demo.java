package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    static void slidingWindow(int a[],int n,int k)
    {
    	int max=0;
    	for(int i=0;i<=n-k;i++)
    	{
    		for(int j=0;j<k;j++)
    		{
    			if(a[i+j]>max)
    			{
    				max=a[i+j];
    			}
    		}
    		System.out.print(max+" ");
    			
    	}
    }
 
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int a[] = new int [n];
//        for(int i = 0;i<n;i++)
//        {
//        	a[i]=s.nextInt();
//        }
//        int k = s.nextInt();
        int a[]= {1,2,3,4,5};
        int n=5;
        int k =3;
        String str[]= {"hams","anand"};
        String xString = Arrays.toString(str);
        System.out.println(xString);
//        Demo.slidingWindow(a, n, k);
        int length=0;
        String str1="I am Harithirisha";
        for(int i=str1.length()-1;i>=0;i--)
        {
        	if(str1.charAt(i)==' ')
        	{
        		break;
        	}
        	else
        	{
        		length++;
        	}
        }
        System.out.println(length);
    }
}