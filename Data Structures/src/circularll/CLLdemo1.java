package circularll;

import java.util.HashSet;
import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
class CLL
{
	Node head,temp;
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
		temp.next=head;
	}
	void display()
	{
		Node t = head;
		if(head!=null)
		{
			do 
			{
				System.out.print(t.data+"->");
				t=t.next;
			} while (t!=head);
			
		}
	}
	int  count()
	{
		int c =0;
		Node t=head;
		if(t==null)
		{
			return -1;
		}
		HashSet<Integer> set = new HashSet<>();
		set.add(t.data);
		t=t.next;
		while(t!=head)
		{
			if(set.contains(t.data))
			{
				c++;
			}
			else 
			{
				set.add(t.data);
			}
			t=t.next;
		}
		return c;
	}
}
public class CLLdemo1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner("System.in");
//		int n = s.nextInt();
//		for(int i=0;i<n;i++)
//		{
//			
//		}
		CLL ob = new CLL();
		ob.insert(10);
		ob.insert(20);
		ob.insert(10);
		ob.insert(40);
		ob.insert(50);
		ob.insert(50);
		ob.display();
		System.out.println("\ncount:"+ob.count());

	}

}
