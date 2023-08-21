package programs;

public class DecreasingSequence 
{

	public static void main(String[] args) 
	{
		int a[]= {12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,-5};
		//23 12 5 4 
		//87 9
		int n = a.length;
		boolean check=true;
		int count=0,t=0,l=0;
		for(int i =0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
			{
				if(check)
				{
					check=false;
					count++;
				}
				t++;
				if(t>l)
				{
					l=t;
				}
			}
			else
			{
				check=true;
				t=0;
			}
		}
		if(count>0)
		{
			l++;
		}
		System.out.println(count+" "+l);
	}

}
