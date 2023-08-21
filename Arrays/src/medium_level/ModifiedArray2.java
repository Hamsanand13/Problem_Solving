package medium_level;

import java.util.Scanner;

//I/P:[1,2,3,4,5,6] max_min_max_min......
//O/P:[6,1,5,2,4,3]
public class ModifiedArray2 
{
    public static void main(String v[])
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b[] =a.split("\\s+");
        int n = b.length;
        int c[] =new int[n];
        int high=n-1,low=0;
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
            System.out.print(c[i]+" ");
            flag=!flag;
        }
    }
}
