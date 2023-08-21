package doublyLL;


class Node
{
	int data;
	Node left,right;
}
class DLL
{
	Node head,temp;
	void insert(int data)
	{
		Node a=new Node();
		a.data=data;
		if(head==null)
		{
			head=temp=a;
			head.left=null;
		}
		else
		{
			temp.right=a;
			a.left=temp;
			temp=a;
			
		}
	}
	public void delete(int key) 
	{
		Node tNode = head;
		while(tNode!=null)
		{
			if(tNode.data==key && tNode==head)
			{
				head=tNode.right;
			}
			else
			{
				
			}
		}
			
	}
	public void display() 
	{
		Node t = head;
		while(t!=null)
		{
			System.out.print(t.data);
			if(t.right != null)
			{
				System.out.print("-->");
			}
			t=t.right;
		}
		System.out.println();
	}
}
public class DLLDemo 
{

	public static void main(String[] args) 
	{
		DLL ob = new DLL();
		ob.insert(10);
		ob.insert(20);
		ob.insert(30);
		ob.insert(40);
		ob.display();
		ob.delete(10);
		System.out.println();
		ob.display();

	}

}
