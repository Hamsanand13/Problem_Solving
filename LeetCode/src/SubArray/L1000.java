package SubArray;
class Solution8 
{
    public int mergeStones(int[] stones, int k) 
    {
        int n = stones.length;
        if((n-1) % (k-1)>0)
        {
            return -1;
        }
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            a[i+1]=a[i]+stones[i];
        }
//        for(int i=0;i<=n;i++)
//        {
//            System.out.println("a:"+a[i]);
//        }
        int b[][]=new int[n][n];
        for(int i=k;i<=n;++i)
        {
            for(int j=0;j+i<=n;++j)
            {
                int m=j+i-1;
                b[j][m]=Integer.MAX_VALUE;
                for(int l=j;l<m;l+=k-1)
                {
                    b[j][m]=Math.min(b[j][m],b[j][l]+b[l+1][m]);
                    System.out.println("b["+j+"]["+m+"]: "+b[j][m]);
                }
                if((m-j)%(k-1)==0)
                {
                    b[j][m]+=a[m+1]-a[j];
                    System.out.println("b2["+j+"]["+m+"]: "+b[j][m]);
                }
            }
        }
        return b[0][n-1];
    }
}
public class L1000 
{
	public static void main(String[] args) 
	{
		Solution8 ob = new Solution8();
		int a[]= {3,2,4,1};
		int k=2;
		ob.mergeStones(a, k);
	}

}
