package SubArray;

public class gcd {

	public static void main(String[] args) 
	{
		int nums[]={7,5,6,8,3};
		int max=0,min=nums[0];
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]<min)
			{
				min=nums[i];
		    }
		    if(nums[i]>max)
		    {
		    	max=nums[i];
		    }
		}
		int div=0;
		for(int i=1;i<=max;i++)
        {
			if(min%i==0 && max%i==0 && i<=min)
			{
				if(div<i)
				{
					div=i;
		        }
			}
        }
		System.out.print("The smallest number in nums is "+min);
		System.out.print("\nThe largest number in nums is "+max);
		System.out.print("\nThe greatest common divisor of "+min+" and "+max+" is "+div);
	}
}
