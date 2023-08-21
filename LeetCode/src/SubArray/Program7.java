package SubArray;
class Solution7 {
    public boolean divideArray(int[] nums) 
    {
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    nums[i]=0;
                    nums[j]=0;
                }
                
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
public class Program7 
{
	public static void  main(String v[])
	{
		Solution7 ob = new Solution7();
		int a[]= {3,2,3,2,2,2};
		System.out.print(ob.divideArray(a));
	}
}