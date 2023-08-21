 package DataStructures;
import java.util.*;
class NodeD
{
	char data;
	NodeD next;
}
class StackDemo
{
	NodeD top;
	int size;
	int stacksize;
	String f;
	StackDemo(int b) 
	{
		top=null;
		size =0;
		stacksize=b;
		f="";
	}
	void push(char data)
	{
		if(size>stacksize-1)
		{
			System.out.print("Overflow");
		}
		else 
		{
			NodeD a = new NodeD();
			a.data=data;
			a.next=top;
			top=a;
			size++;
		}
	}
	void pushcheck(char data)
	{
		if(Character.isLetterOrDigit(data))
		{
			f=f+data;
		}
		else if(data=='(')
		{
			push(data);
		}
		else if(data==')')
		{
			while(top!=null && peek()!='(')
			{
				f+=Character.toString(pop());
				//size--;
			}
			pop();
			//size--;
		}
		else
		{
			while(top!=null && precidence(data)<=precidence(peek()))
			{
				f+=Character.toString(pop());
				//size--;
			}
			push(data);
			//size++;
		}
	}
	int precidence(char ch)
	{
		switch(ch)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':	
			return 2;
		case '^':
			return 3;
		}
		return-1;
		
	}
	char pop()
	{
		char c = top.data;
		top=top.next;
		size--;
		return c;
	}
	char peek()
	{
		return top.data;
	}
	void display()
	{
		System.out.print(f);
	}
	void check()
	{
		while(top!=null)
		{
			f+=top.data;
			top=top.next;
		}
	}
}
public class InfixtoPostfix
{
	public static void main(String v[])
	{
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		StackDemo sob=new StackDemo(a.length());
		for(int i=0;i<a.length();i++)
		{
			sob.pushcheck(a.charAt(i));
		}
		sob.check();
		sob.display();
	}
	
}
