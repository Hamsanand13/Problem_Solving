package SubArray;
class Solution4 {
    public String removeDigit(String number, char digit) 
    {
        String res="";
        String sum1="";
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i)==digit)
            {
                sum1=number.substring(0,i);
                sum1+=number.substring((i+1));
                if(res.equals(""))
                {
                	res=sum1;
                }
                else 
                {
                	if(sum1.compareTo(res)>0)
                	{
                		res= sum1;
                	}
                }
            }
        }
        return res;
    }
}
public class Program4
{
	public static void main(String v[])
	{
		Solution4 ob= new Solution4();
		System.out.print(ob.removeDigit("12311", '1'));
	}
}