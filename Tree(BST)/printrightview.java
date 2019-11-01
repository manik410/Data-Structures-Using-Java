package tree;
import java.util.*;
public class printright 
{
	ArrayList<Integer> al=new ArrayList<Integer>();
	static class Node
	{
		Node right,left;
		int key;
		Node(int key)
		{
			right=left=null;
			this.key=key;
		}
	}
	void rightview(Node c)
	{
		if(c==null)
			return;
		else
		{
			System.out.print(c.key+" ");
			if(c.right!=null)
			{
				rightview(c.right);
			}
		}
	}
	void insert(int key)
	{
		root=insertRec(root,key);
	}
	Node insertRec(Node root,int key)
	{
		if(root==null)
		{
			root=new Node(key);
		}
		else
		{
			if(root.key>key)
			{
				root.left=insertRec(root.left,key);
			}
			else
			{
				root.right=insertRec(root.right,key);
			}
		}
		return root;
	}
	void inorder(Node root)
	{
		if(root==null)
			return;
		else
		{
			inorder(root.left);
			al.add(root.key);
			inorder(root.right);
		}
	}
	void printorder(Node root)
	{
		if(root==null)
			return;
		else
		{
			printorder(root.left);
			System.out.print(root.key+" ");
			printorder(root.right);
		}
	}
	Node root;
	printright()
	{
		root=null;
	}
	public static void main(String args[])
	{
		printright tree=new printright();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right=new Node(3);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		tree.root.right.right.right=new Node(9);
		System.out.println("The right view of tree is ");
		tree.rightview(tree.root);
		System.out.println();
		tree.inorder(tree.root);
		System.out.println("The no of nodes in a tree is "+tree.al.size());
		printright tree1=new printright();
		for(int i=0;i<tree.al.size();i++)
		{
			tree1.insert(tree.al.get(i));
		}
		System.out.println("The inorder of Bst is ");
		tree1.printorder(tree1.root);
	}

}
