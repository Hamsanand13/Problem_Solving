package DataStructures;
import java.util.*;
class Node {
	int data;
	Node next;
}

class LinkedList {
	Node head;

	void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	void show() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.print(node.data);
	}
	// void insertAtStart(int data)
	// {
	// Node a = new Node();
	// a.data=data;
	// a.next=head;
	// head=a;

	// }
	void insertAtMiddle(int data, int index) 
	{
		Node a = new Node();
		a.data = data;
		a.next = null;
		Node temp = head;
		if (index == 0) {
			a.data = data;
			a.next = head;
			head = a;
		} 
		else 
		{
			for (int i = 1; i < index - 1; i++) 
			{
				temp = temp.next;
			}
			a.next = temp.next;
			temp.next = a;
		}
	}
	void delete(int index)
	{
		Node temp = head;
		if(index==0)
		{
			head=head.next;
		
		}
		else
		{
			for(int i=1;i<index-1;i++)
			{
					temp=temp.next;
			}
			Node n2=temp.next;
			temp.next=n2.next;
		}
		
	}
}
public class Main {
	public static void main(String v[]) {
		LinkedList o = new LinkedList();
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int data;
		for(int i=0;i<a;i++)
		{
			data = s.nextInt();
			o.insert(data);
		}
		//o.insertAtMiddle(5, 0);
		//o.insertAtMiddle(15,3);
		o.delete(4);
		o.show();
	}
}
