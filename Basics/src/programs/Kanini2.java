package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Kanini2 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		ArrayList<Integer>list=new ArrayList<>();
		boolean flag =true;
		int count1=0,count2=0;
		while (flag) 
		{
			int a = s.nextInt();
			if(a%2==1)
			{
				count1++;
			}
			else if(a<0)
			{
				count2++;
			}
			list.add(a);
			if(count1>2 || count2>=3)
			{
				break;
			}
		}
		for(Integer integer : list)
		{
			System.out.println(integer);
		}
	}

}
