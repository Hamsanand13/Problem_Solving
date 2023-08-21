package SubArray;

import org.omg.CORBA.SystemException;

class Solution6 {
    public int minimumAverageDifference(int[] nums) 
    {
        int res[]= new int[nums.length];
        int c=0,d=0,count=0,f=0;
        for(int i=0;i<nums.length;i++)
        {
            c+=nums[i];
            for(int j=(nums.length-1);j>i;j--)
            {
                d+=nums[j];
                count++;
            }
            if(count>0)
            {
                f = d/count;
            }
            else
            {
                f=0;
            }
            //System.out.println("d:"+d);
            //System.out.println("count:"+count);
            int x = c/(i+1)- f;
            res[i]=Math.abs(x);
            //System.out.println("res:"+res[i]);
            count=d=0;
        }
        int min =res[0];
        int flag=0;
        for(int k=0;k<res.length;k++)
        {
            if(min>res[k])
            {
            	min=res[k];
                flag=k;
            }
        }
        return flag;
    }
}
public class Program6 
{
	public static void  main(String v[])
	{
		Solution6 ob = new Solution6();
		int a[]= {};
		System.out.print(ob.minimumAverageDifference(a));
	}
}
