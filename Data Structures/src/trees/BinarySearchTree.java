package trees;
class Node5
{
	int data;
	Node5 left,right;
}
class BST
{
	Node5 root;
	void insert(int data)
	{
		root = insertrec(root, data);
	}
	Node5 insertrec(Node5 root,int data)
	{
		Node5 a = new Node5();
		a.data=data;
		if(root == null)
		{
			root =a ;
			return root;
		}
		else if(data>root.data)
		{
			root.right = insertrec(root.right,data);
		}
		else if(data<root.data)
		{
			root.left=insertrec(root.left, data);
		}
		return root;
	}
	void inorder()
	{
		inorderrec(root);
	}
	void inorderrec(Node5 root)
	{
		if(root!=null)
		{
			inorderrec(root.left);
			System.out.println(root.data);
			inorderrec(root.right);
		}
	}
	void preorder()
	{
		preorderrec(root);
	}
	void preorderrec(Node5 root)
	{
		if(root!=null)
		{
			
			System.out.println(root.data);
			preorderrec(root.left);
			preorderrec(root.right);
		}
	}
}
public class BinarySearchTree 
{
	public static void main(String[] args) {
		BST tree = new BST();
		 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(4);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(13);
 
        // print inorder traversal of the BST
        System.out.print("Inorder:");
        tree.inorder();
        System.out.println();
        System.out.print("preorder:");
        tree.preorder();
	}
}
