package SubArray;
class Solution5
{
    public boolean digitCount(String num)
    {
        int arr[]=new int[10];
        for(int i=0;i<num.length();i++)
        {
            char c=num.charAt(i);
            int count=0;
            for(int j=0;j<num.length();j++)
            {
            	if(c==num.charAt(j))
                {
            		count++;    
                }
            }
            int d =Integer.parseInt(String.valueOf(num.charAt(i)));
            arr[d]=count;
        }
        for(int i=0;i<num.length();i++)
        {
        	int temp=num.charAt(i)-'0';
        	System.out.println(temp);
        	if(temp!=arr[i])
        	{
        		return false;
        	}
        }
        return true;
    }
}
public class Program5
{
	public static void main(String v[])
	{
		Solution5 ob= new Solution5();
		System.out.print(ob.digitCount("1210"));
	}
}
