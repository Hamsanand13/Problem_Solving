package SubArray;

class Solution9 
{
    public String addSpaces(String s, int[] spaces) 
    {
        String ans="";
        int n=s.length();
        int i=0;
        int j=0;
        while(i<n && j<spaces.length)
        {
            if(i==spaces[j])
            {
                ans+=" ";
                ans+=s.charAt(i);
                j++;
            }
            else
            {
                ans+=s.charAt(i);
            }
            i++;
        }
        ans+=s.substring(i,s.length());
        return ans;
    }
}
/* Alternate (time complexity)
 * class Solution 
{
    public String addSpaces(String s, int[] spaces) 
    {
        String ans="";
        int i=0;
        for(int j=0;j<spaces.length;j++)
        {
            ans+=s.substring(i,spaces[j])+" ";
            i=spaces[j];    
        }
        ans+=s.substring(i,s.length());
        return ans;
    }
}
 */
public class L2109 {

	public static void main(String[] args) {
		Solution9 ob =new Solution9();
		String s="LeetcodeHelpsMeLearn";
		int spaces[] = {8,13,15};
		System.out.println(ob.addSpaces(s, spaces));

	}

}
