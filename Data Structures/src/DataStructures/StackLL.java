package DataStructures;
//stack using linked list
//to find the element in the list
//input: no of elements , elements, search element
import java.util.Scanner;
class NodeA
{
	int data;
	NodeA next;
}
class stackl
{
	NodeA top;
	int size;
	public stackl() {
		top=null;
		size=0;
	}
	void push(int x)
	{
		NodeA a = new NodeA();
		a.data=x;
		a.next=top;
		top=a;
		size++;
	}
	void peek()
	{
		if(top==null)
		{
			System.out.print("Stack is empty");
		}
		else 
		{
			System.out.print(top.data);
		}
	}
	public int pop(int data)
	{
		while(top!=null)
		{
			if(top.data == data)
			{
				return 1;
			}
			else 
			{
				size--;
				top=top.next;
			}
		}
		return 0;
	}
	
}
public class StackLL {
	public static void main(String[] args) {
		stackl ob = new stackl();
		Scanner st=new Scanner(System.in);
		int n = st.nextInt();
		for(int i=0;i<n;i++)
		{
			int data = st.nextInt();
			ob.push(data);
		}
		int d = st.nextInt();
		int c = ob.pop(3);
		if(c==1)
		{
			System.out.print("Element found");
		}
		else
		{
			System.out.print("Element not found");
			
		}
	}
}
