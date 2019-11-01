package tree;
import java.util.Scanner;

import tree.searchTree.Node;
public class printleaf 
{
	static class Node
	{
		Node left,right;
		int key;
		Node(int key)
		{
			left=right=null;
			this.key=key;
		}
	}
	Node root;
	printleaf()
	{
		root=null;
	}
	public void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
		}
	}
	public void leafprint(Node root)
	{
			if(root==null)
			{
				return;
			}
			else
			{
				if(root.left!=null)
				{
					leafprint(root.left);
				}
					if(root.right!=null)
					{
						leafprint(root.right);
					}
				else
				{
					System.out.print(root.key+" ");
				}
			}
	}
	public static void main(String args[])
	{
		printleaf tree=new printleaf();
		tree.root=new Node(20);
		tree.root.left=new Node(8);
		tree.root.left.left=new Node(5);
		tree.root.left.right=new Node(3);
		tree.root.left.right.left=new Node(10);
		tree.root.left.right.right=new Node(14);
		tree.root.right=new Node(22);
		tree.root.right.left=new Node(4);
		tree.root.right.right=new Node(25);
		tree.inorder(tree.root);
		System.out.println();
		tree.leafprint(tree.root);
	}

}
