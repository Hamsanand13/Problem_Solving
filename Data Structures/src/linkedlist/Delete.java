package linkedlist;
//import java.util.Scanner;
class Node10
{
	int data;
	Node10 next;
}
class LLDemo
{
	Node10 temp,head;
	void insertElement(int data)
	{
		Node10 a = new Node10();
		a.data=data;
		if(head == null)
		{
			head=temp=a;
		}
		else 
		{
			temp.next=a;
			temp=a;
		}
	}
	void deleteElement(int key)
	{
		Node10 t= head ,prev=null;
		if(t!=null && t.data==key)
		{
			head=t.next;
			return;
		}
		while(t!=null && t.data!=key)
		{
			prev = t;
			t=t.next;
		}
		if(t==null)
		{
			return;
		}
		prev.next=t.next;
	}
	void displayElement()
	{
		Node10 t = head; 
		while(t!=null)
		{
			System.out.print(t.data+"->");
			t=t.next;
		}
	}
}
public class Delete 
{

	public static void main(String[] args) 
	{
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
		LLDemo ob = new LLDemo();
		ob.insertElement(10);
		ob.insertElement(20);
		ob.insertElement(30);
		ob.insertElement(40);
		ob.insertElement(50);
		ob.displayElement();
		ob.deleteElement(20);
		System.out.println();
		ob.displayElement();

	}

}
