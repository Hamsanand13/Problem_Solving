package medium_level;

import java.util.Arrays;
import java.util.Scanner;

//Find the smallest missing positive integer
// I/P: [1,2,3,4,5]
// O/P:6
public class PositiveInteger 
{
	public static void main(String v[])
    {
        Scanner s = new Scanner(System.in);
        String str =s.nextLine();
        String str_arr[]=str.split("\\s+");
        int n = str_arr.length;
        int arr[]= new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str_arr[i]);
        }
        boolean ans;
        Arrays.sort(arr);
        for(int i=1;;i++)
        {
            ans = false;
            for(int j =0;j<n;j++)
            {
                if(i==arr[j])
                {
                    ans=true;
                }
            }
            if(!ans)
            {
                System.out.print(i);
                return;
            }
        }
    }
}
