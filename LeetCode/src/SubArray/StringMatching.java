package SubArray;
/*
  Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*'
  where:

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).
*/
class Match 
{
    public boolean isMatch(String s, String p) 
    {
        if(s==null || p==null)
        {
            return false;
        }
        boolean match[][]=new boolean[s.length()+1][p.length()+1];
        match[0][0]=true;
        for(int i=1;i<=p.length();i++)
        {
            if(p.charAt(i-1)=='*')
            {
                match[0][i]=match[0][i-1];
            }
        }
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=p.length();j++)
            {
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?')
                {
                    match[i][j]=match[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*')
                {
                    match[i][j]=match[i-1][j] || match[i][j-1];
                }
            }
        }
        for(int i=0;i<(s.length()+1);i++)
        {
        	for(int j=0;j<(p.length()+1);j++)
        	{
        		System.out.print(match[i][j]+"\t");
        	}
        	System.out.println();
        }
        return match[s.length()][p.length()];
    }
}

public class StringMatching 
{

	public static void main(String[] args) 
	{
		Match ob = new Match();
		String s="abcd";
		String p="?*d";
		System.out.println(ob.isMatch(s, p));

	}

}
