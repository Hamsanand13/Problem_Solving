package medium_level;

import java.util.Scanner;

//I/P:[1,2,3,4],[2,2,3]
//O/P:[2,3]
public class Intersection 
{
	public static void main(String v[])
    {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        String arr1[]=str1.split("\\s+");
        String arr2[]=str2.split("\\s+");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i].equals(arr1[j])&& !arr1[j].equals("X"))
                {
                    System.out.print(arr2[i]+" ");
                    arr1[j]="X";
                }
            }
        }
    }
}
