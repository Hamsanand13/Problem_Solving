package DataStructures;
import java.util.*;
public class EvaluatePostfix 
{
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<>();
		String str = "2 3 +";
		String arr[] = str.split(" ");
		for(int i =0;i<arr.length;i++)
		{

			String c = arr[i];
//			System.out.println(c);
			if(!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/"))
			{
				st.push(Integer.parseInt(c));
			}
			else
			{
				int a = st.pop();
				int b = st.pop();
				if(c.equals("+"))
				{
					st.push(b+a);
				}
				else if(c.equals("-"))
				{
					st.push(b-a);
				}
				else if(c.equals("*"))
				{
					st.push(b*a);
				}
				else if(c.equals("/"))
				{
					st.push(b/a);
				}
//				System.out.println(st.peek());
			}
		}
		System.out.println(st.pop());
	}
		
}
