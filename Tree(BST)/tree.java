package st2;
import java.util.*;
public class tree 
{
	static class Node
	{
		Node left,right;
		int data;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	Node root;
	tree()
	{
		root=null;
	}
	tree(int a)
	{
		root=new Node(a);
	}
	void print(Node root)
	{
		if(root==null)
		{
			return;
		}
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}
	public static void main(String args[])
	{
		tree t=new tree();
		t.root=new Node(10);
		t.root.left=new Node(6);
		t.root.right=new Node(20);
		t.root.right.left=new Node(15);
		t.root.right.right=new Node(30);
		t.print(t.root);
	}

}
