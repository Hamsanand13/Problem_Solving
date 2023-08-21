package linkedlist;

class Node2
{
	int data;
	Node2 next;
}
public class SortLL 
{
	Node2 head,temp;
	public SortLL() 
	{
		head=temp=null;
	}
	void insert(int data)
	{
		Node2 a = new Node2();
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
	void sortLinkedlist()
	{
		Node2 t=head;
		while(t!=null)
		{
			Node2 t2 = t.next;
			while(t2!=null)
			{
				if(t.data>t2.data)
				{
					int temp=t.data;
					t.data=t2.data;
					t2.data=temp;
				}
				t2=t2.next;
			}
			t=t.next;
		}
	}
	public static void main(String[] args) 
	{
		SortLL ob = new SortLL();
		int a[]= {20,40,10,30};
		for(int i =0;i<a.length;i++)
		{
			ob.insert(a[i]);
		}
		ob.display();
		ob.sortLinkedlist();
		ob.display();

	}
	private void display() 
	{
		Node2 t = head;
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

}
