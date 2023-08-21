package linkedlist;

import java.util.HashSet;
import java.util.Set;

class Node3
{
	int data;
	Node3 next;
}
public class Removeduplicates 
{
	Set<Integer> set = new HashSet<>();
	Node3 head,temp;
	public Removeduplicates() 
	{
		head = temp = null;
	}
	void insert(int data)
	{
		Node3 a = new Node3();
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
	}
	void removeDuplicates()
	{
		Node3 temp = head;
		while(temp!=null)
		{
			Node3 t1=temp;
			Node3 t2=temp.next;
			while(t2!=null)
			{
				if(temp.data==t2.data)
				{
					t1.next=t2.next;
				}
				else
				{
					t1=t2;
				}
				t2=t2.next;
			}
			temp=temp.next;
		}
	}
	private void display() 
	{
		Node3 t = head;
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
	public static void main(String[] args) 
	{
		Removeduplicates ob = new Removeduplicates();
		int a[]= {12,3,4,5,56,4,5,12,563,56,4};
//		int a[]= {10,20,30,20};
		for(int i =0;i<a.length;i++)
		{
			ob.insert(a[i]);
		}
		ob.display();
		ob.removeDuplicates();
		ob.display();

	}

}
