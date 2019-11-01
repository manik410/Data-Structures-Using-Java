package st2;
import java.util.*;
public class traversal 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			left=right=null;
			this.data=data;
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
	void printpre(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		printpre(root.left);
		printpre(root.right);
	}
	void printin(Node root)
	{
		if(root==null)
			return;
		printin(root.left);
		System.out.print(root.data+" ");
		printin(root.right);
	}
	void printpos(Node root)
	{
		if(root==null)
			return;
		printpos(root.left);
		printpos(root.right);
		System.out.print(root.data+" ");
	}
	public static void main(String args[])
	{
		traversal t=new traversal();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			t.insert(sc.nextInt());
		}
		t.printpre(t.root);
		System.out.println();
		t.printin(t.root);
		System.out.println();
		t.printpos(t.root);
	}

}
