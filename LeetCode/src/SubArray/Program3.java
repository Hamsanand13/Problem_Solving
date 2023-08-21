package SubArray;
import java.util.*;
class Solution3 
{
    public int percentageLetter(String s, char letter) 
    {
        double count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==letter)
            {
                count++;
            }
        }
        int d =(int) (count/s.length()*100);
        return d;
    }
}
public class Program3
{
	public static void main(String v[])
	{
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		char letter =  s.next().charAt(0);
		Solution3 ob = new Solution3();
		System.out.print(ob.percentageLetter(a, letter));
	}
}
