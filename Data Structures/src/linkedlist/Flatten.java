 package linkedlist;

import java.util.Scanner;

class Node8
{
	int data;
	Node8 next, down;
}
class LLDemo8
{
	Node8 temp,head,t1;
	public LLDemo8() 
	{
		temp=head=t1=null;
	}
	Node8 insert(Node8 headref,int data)
	{
		Node8 a = new Node8();
		a.data=data;
		a.down=headref;
		headref=a;
		return headref;
	}
	void print()
	{
		temp=head;
		System.out.println("head");
		System.out.println("|");
		while(temp!=null)
		{
			System.out.println(temp.data);
			System.out.println("|");
			temp=temp.down;
		}
		System.out.println("null");
	}
	public Node8 flatten(Node8 headref) 
	{
		if(headref==null || headref.next==null)
		{
			return headref;
		}
		headref.next=flatten(headref.next);
		headref=merge(headref,headref.next);
		return headref;
	}
	private Node8 merge(Node8 a, Node8 b) 
	{
		if(a==null)
		{
			return b;
		}
		if(b==null)
		{
			return a; 
		}
		Node8 res;
		if(a.data<b.data)
		{
			res=a;
			res.down=merge(a.down, b);
		}
		else
		{
			res=b;
			res.down=merge(a, b.down);
		}
		res.next=null;
		return res;
	}
}
public class Flatten 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		LLDemo8 ob = new LLDemo8();
		ob.head=ob.insert(ob.head, 30);
		ob.head=ob.insert(ob.head, 8);
		ob.head=ob.insert(ob.head, 7);
		ob.head=ob.insert(ob.head, 5);
		ob.head.next=ob.insert(ob.head.next,20);
		ob.head.next=ob.insert(ob.head.next,10);
		ob.head.next.next=ob.insert(ob.head.next.next,50);
		ob.head.next.next=ob.insert(ob.head.next.next,22);
		ob.head.next.next=ob.insert(ob.head.next.next,19);
		ob.head.next.next=ob.insert(ob.head.next.next,45);
		ob.head.next.next=ob.insert(ob.head.next.next,22);
		ob.head=ob.flatten(ob.head);
		ob.print();
		

	}

}
