package tree;
import java.util.*;

public class BinaryTree 
{
	static class Node
	{
		int key;
		Node left,right;
		public Node(int item)
		{
			key=item;
			left=right=null;
		}
	}
	Node root;
	BinaryTree()
	{
		root=null;
	}
	BinaryTree(int key)
	{
		root=new Node(key);
	}
	void print(Node root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			print(root.left);
			System.out.print(root.key+" ");
			print(root.right);
		}
	}
	public static void main(String args[])
	{
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.print(tree.root);
	}

}
