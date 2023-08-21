package DataStructures;

import javax.swing.Popup;

class Node5
{
	int data;
	Node5 next;
}
class Demo5
{
	Node5 top;
	Node5 topd;
	public Demo5() 
	{
		top=null;
		topd=null;
	}
	void push(int data)
	{
		Node5 a = new Node5();
		a.data=data;
		if(top==null)
		{
			top=a;
		}
		else
		{
			a.next=top;
			top=a;
		}
	}
	void descendingorder()
	{
		System.out.print(top.data);
		while(pop()!=-1)
		{
			if(topd==null)
			{
				Node5 a = new Node5();
				a.data=pop();
				top=top.next;
				topd=a;
			}
			if(pop()<popd())
			{
				int temp = popd();
				Node5 a = new Node5();
				a.data=top.data;
				a.next=topd;
				top.data =temp;
			}
		}
		System.out.print(topd.data);
	}
		int pop()
		{
			if(top!=null)
			{
				int c = top.data;
				return c;
			}
			return -1;
		}
		int popd()
		{
			if(topd!=null)
			{
				int c = topd.data;
				topd=topd.next;
				return c;
			}
			return -1;
		}
		void display()
		{
			while (topd!=null)
			{
				System.out.print(topd);
				topd=topd.next;
			}
		}
	}
public class StackDescending {

	public static void main(String[] args) 
	{
		int a[]= {8,5,3,7,2,6};
		Demo5 ob = new Demo5();
		for(int i=0;i<a.length;i++)
		{
			ob.push(a[i]);
		}
		ob.descendingorder();
		ob.display();
	}

}
