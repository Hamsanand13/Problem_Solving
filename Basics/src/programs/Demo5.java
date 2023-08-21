package programs;
import java.util.Scanner;
public class Demo5 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		float salary = scanner.nextFloat();
		String fl = scanner.next();
		String dep =scanner.next();
		int exp = scanner.nextInt();
		String md = scanner.next();
		String doc = scanner.next();
		float ans=0;
		ans=(salary*25)/100;
		if(dep.equals("ADM"))
		{
			ans+=(salary*5)/100;
		}
		else
		{
			if(dep.equals("TEC") && md.equals("Yes"))
			{
				if(doc.equals("Yes"))
				{
					ans+=(salary*10)/100;
				}
				ans+=(salary*3)/100;
			}
		}
		if(fl.equals("Yes"))
		{
			ans+=(salary*2)/100;
		}
		System.out.printf("%.2f",ans+salary);
	}
}
