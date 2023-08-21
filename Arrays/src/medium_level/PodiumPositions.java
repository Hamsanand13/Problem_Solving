package medium_level;

import java.util.Arrays;
import java.util.Scanner;

//I/P:[10,20,30,40,50,60,70,80]
//O/P:[60,70,80]
public class PodiumPositions {
	public static void main(String v[])
    {
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        String str_arr[]=str.split("\\s+");
//        int n = str_arr.length;
//        int arr[]= new int[n];
//        for(int i =0;i<n;i++)
//        {
//            arr[i]= Integer.parseInt(str_arr[i]);   
//        }
		int n = 8;
		int arr[]= {10,20,30,40,50,60,70,80};
        int ans[]= new int[3];
        for(int i =0;i<3;i++)
        {
            ans[i]=podiumPosition(arr);
        }
        Arrays.sort(ans);
        for(int i =0;i<3;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    static int podiumPosition(int a[])
    {
        int c = a[0];
        int flag=0;
        for(int i =0;i<a.length;i++)
        {
            if(a[i]>c)
            {
                c=a[i];
                flag=i;
            }
        }
        a[flag]=0;
        return c;
    }
}