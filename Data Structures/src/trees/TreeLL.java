package trees;
import java.util.*;
class Node3
{
	Node3 left,right;
	int data;
}
class TreeDemo3
{
	Node3 root;
	public TreeDemo3() {
		root=null;
	}
	void InsertCheck(int data)
	{
		root=Insert(root, data);
	}
	Node3 Insert(Node3 root,int data)
	{
		if(root==null)
		{
			Node3 a = new Node3();
			a.data=data;
			root =a;
			return root;
		}
		else if(data<root.data)
		{
			root.left=Insert(root.left, data);
		}
		else if(data>root.data)
		{
			root.right=Insert(root.right, data);
		}
		return root;
	}
	void display()
	{
		System.out.print("preorder: ");
		Preorder(root);
		System.out.print("\nInorder: ");
		Inorder(root);
		System.out.print("\npostorder: ");
		Postorder(root);
	}
	void Preorder(Node3 root)
	{
		if(root!=null)
		{
			System.out.print(" " + root.data);
			Preorder(root.left);
			Preorder(root.right);
		}
			
	}
	void Postorder(Node3 root)
	{
		if(root!=null)
		{
			Postorder(root.left);
			Postorder(root.right);
			System.out.print(" " + root.data);
		}
			
	}
	
	void Inorder(Node3 root) 
	{
	    if (root != null) 
	    {
	      Inorder(root.left);
	      System.out.print(" " + root.data);
	      Inorder(root.right);;
	    }
	  }
}
public class TreeLL 
{
	public static void main(String v[]) 
	{
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		TreeDemo3 obb = new TreeDemo3();
		for(int i=n;i>0;i--)
		{
			obb.InsertCheck(i);
		}
		obb.display();
	}
}
