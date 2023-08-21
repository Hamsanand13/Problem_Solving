package linkedlist;

import java.util.LinkedList;
import java.util.Stack;

public class LLDemo1 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ob = new LinkedList<>();
		ob.add(10);
		ob.add(20);
		ob.add(20);
		ob.add(10);
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i <ob.size(); i++) 
		{
			s.push(ob.get(i));
		}
		while(!s.isEmpty())
		{
			if(s.pop()!=ob.getFirst())
			{
				System.out.println("false");
				return;
			}
			ob.removeFirst();
		}
		System.out.println("palindrome");
	}
}
