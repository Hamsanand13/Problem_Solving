package linkedlist;

class Node9
{
	int data;
	Node9 next;
}

public class ReverseLL 
{
	static Node9 head,temp;
	
	static void insert(int data)
	{
		Node9 a = new Node9();
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
	static void reverse()
	{
		Node9 prev,curr,forw;
		prev=null;
		curr = head;
		forw=head.next;
		while(curr!=null)
		{
			forw=curr.next;
			curr.next=prev;
			prev=curr;
			curr=forw;
		}
		head=prev;
	}
	static void display()
	{
		Node9 t1 = head;
		while(t1!=null)
		{
			System.out.print(t1.data+" ");
			t1=t1.next;
		}
	}

	public static void main(String[] args) 
	{
		insert(50);
		insert(40);
		insert(30);
		insert(20);
		insert(10);
		display();
		reverse();
		System.out.println("reversed:");
		display();
	}

}
