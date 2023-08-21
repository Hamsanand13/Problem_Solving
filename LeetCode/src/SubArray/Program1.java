package SubArray;
import java.util.*;
class Solution {
    public long zeroFilledSubarray(int[] nums) 
    {
        long count =0;
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]==0)
            {
                long r=0;
                {
                    while(i<nums.length && nums[i]==0)
                    {
                        i++;
                        r++;
                        //System.out.println("r: "+r);
                    }
                    count+=r*(r+1)/2;
                    System.out.println("count: "+count);
                }
            }
            i++;
        }
        return count;
        
    }
}
public class Program1
{
	public static void main(String[] args) {
		 
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nums[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        Solution ob = new Solution();
        long d=ob.zeroFilledSubarray(nums);
        System.out.print(d);
	}
}

