package st2;
import java.util.*;
public class deleteTree 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	Node root;
	void insert(int data)
	{
		root=inserRec(root,data);
	}
	Node inserRec(Node root,int data)
	{
		Node temp=new Node(data);
		if(root==null)
		{
			root=temp;
			return root;
		}
		else
		{
			if(data<root.data)
			{
				root.left=inserRec(root.left,data);
			}
			else
			{
				root.right=inserRec(root.right,data);
			}
			return root;
		}
	}
	void print(Node root)
	{
		if (root==null)
			return;
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}
	void delete(int data)
	{
		root=deleteRec(root,data);
	}
	Node deleteRec(Node root,int data)
	{
		if(root==null)
			return root;
		if(data<root.data)
		{
			root.left=deleteRec(root.left,data);
		}
		else if(data>root.data)
		{
			root.right=deleteRec(root.right,data);
		}
		else
		{
			if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
				return root.left;
			root.data=min(root.right);
			root.right=deleteRec(root.right,root.data);
		}
		return root;
	}
	static int min(Node root)
	{
		int minval=root.data;
		while(root.left!=null)
		{
			minval=root.left.data;
			root=root.left;
		}
		return minval;
	}
	public static void main(String args[])
	{
		deleteTree t=new deleteTree();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			t.insert(sc.nextInt());
		}
		t.print(t.root);
		System.out.println();
		System.out.println("Enter the node you want to delete");
		int d=sc.nextInt();
		t.delete(d);
		t.print(t.root);
	}

}
