package linkedlist;

import java.util.Scanner;

class Node 
{
	int data;
	Node next;
}
class Demo 
{
	int size;
	Node head,temp;
	 public Demo()
	{
		 size=0;
		head=temp = null;
	}
	void insert(int data)
	{
		Node a = new Node();
		a.data=data;
		if(head==null)
		{
			head=temp=a;
		}
		else
		{
			temp.next=a;
			temp=a;
		}
		size++;
	}
	void display()
	{
		Node t = head;
		while(t!=null)
		{
			System.out.print(t.data);
			if(t.next != null)
			{
				System.out.print("-->");
			}
			t=t.next;
		}
		System.out.println();
	}
	void printMiddleelement()
	{
		Node t2 = head;
		int m = size/2;
		if(size%2==1)
		{
			while(m!=0)
			{
				t2=t2.next;
				m--;
			}
			System.out.print(t2.data);
		}
		else
		{
			while(m>1)
			{
				t2=t2.next;
				m--;
			}
			System.out.println(t2.data);
			System.out.println(t2.next.data);
		}
		System.out.println();
	}
	public void deleteMiddleelement() 
	{
		Node t2 = head;
		int m = size/2;
		if(size%2==1)
		{
			while(m>1)
			{
				t2=t2.next;
				m--;
			}
			t2.next=t2.next.next;
			display();
		}
		else
		{
			while(m>2)
			{
				t2=t2.next;
				m--;
			}
			t2.next=t2.next.next.next;
			display();
		}
	}
}
public class Middleelement
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo();
		Scanner s = new Scanner(System.in);
		int n  =s.nextInt();
		for(int i=1;i<=n;i++)
		{
			ob.insert(i);
		}
		ob.display();
		ob.printMiddleelement();
		ob.deleteMiddleelement();
	}
}

