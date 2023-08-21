package programs;

public class ThreeEncodedStrings 
{

	public static void main(String[] args) 
	{
		String a = "John";
		String b = "Johny";
		String c = "NjOARD";
		int n1=a.length();
		int n2=b.length();
		int n3=c.length();
		String f="",m="",l="";
		if(n1%3==0)
		{
			int k = n1/3;
			f+= a.substring(0,k);
			m+=a.substring(k,2*k);
			l+=a.substring(2*k);
		}
		else if(n1%3==2)
		{
			int k=n1/3;
			f+=a.substring(0,k+1);
			m+=a.substring(k+1,(2*k+1));
			l+=a.substring(2*k+1);
		}
		else if(n1%3==1)
		{
			int k = n1/3;
			f+=a.substring(0,k);
			m+=a.substring(k,k*2+1);
			l+=a.substring(k*2+1);
			
		}
		
		
		
		
		if(n2%3==0)
		{
			int k = n2/3;
			f+= b.substring(0,k);
			m+=b.substring(k,2*k);
			l+=b.substring(2*k);
		}
		else if(n2%3==2)
		{
			int k=n2/3;
			f+=b.substring(0,k+1);
			m+=b.substring(k+1,(2*k+1));
			l+=b.substring(2*k+1);
		}
		else if(n2%3==1)
		{
			int k = n2/3;
			f+=b.substring(0,k);
			m+=b.substring(k,k*2+1);
			l+=b.substring(k*2+1);
			
		}
		
		if(n3%3==0)
		{
			int k = n3/3;
			f+=c.substring(0,k);
			m+=c.substring(k,2*k);
			l+=c.substring(2*k);
		}
		else if(n3%3==2)
		{
			int k=n1/3;
			f+=c.substring(0,k+1);
			m+=c.substring(k+1,(2*k+1));
			l+=c.substring(2*k+1);
		}
		else if(n3%3==1)
		{
			int k = n3/3;
			f+=c.substring(0,k);
			m+=c.substring(k,k*2+1);
			l+=c.substring(k*2+1);
			
		}
		
		System.out.println(f+" "+m+" "+l);

	}

}
