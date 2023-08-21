package programs;

public class ReduceString {

	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("geeksforgeeks");
		int k =2;
		int i=0;
		boolean check=true;
		while(check)
		{
			check=false;
			while(i<sb.length()-k)
			{
				int j=i+1;
				while(j<sb.length() && sb.charAt(i)==sb.charAt(j))
				{
					j++;
				}
				if(j-i>=k)
				{
					check=true;
					sb.delete(i, j);
				}
				else
				{
					i=j;
				}
			}	
		}
		System.out.println(sb);

	}

}
