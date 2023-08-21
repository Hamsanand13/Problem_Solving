package medium_level;

import java.util.Scanner;

//min-max arrangement in constant space
//I/P:[1,2,3,4,5,6]
//O/P:[6,1,5,2,4,3]
public class MINMAX 
{
	public static void main(String v[])
    {
        Scanner s =  new Scanner(System.in);
        String a = s.nextLine();
        String b[]=a.split(" ");
        int n =b.length;
        int c[] = new int[n];
        int high = b.length-1,low=0;
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            if(flag)
            {
                c[i]=Integer.parseInt(b[high]);
                high--;
            }
            else
            {
                c[i]=Integer.parseInt(b[low]);
                low++;
            }
            flag=!flag;
            System.out.print(c[i]+" ");
        }        
    }
}

