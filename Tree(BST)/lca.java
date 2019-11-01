package st2;
import java.util.*;
public class lca 
{
	static class Node
	{
		Node left,right;
		int data;
		Node(int  data)
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
	/*Node printlca(Node root,int a,int b)
	{
		if(root==null)
		return null;
		else if(root.data>a&&root.data>b)
		{
			return printlca(root.left,a,b);
		}
		else if(root.data<a&&root.data<b)
		{
			return printlca(root.right,a,b);
		}
		return root;
	}*/
	Node printlca(Node root,int a,int b)
	{
		while(root!=null)
		{
			if(root.data>a&&root.data>b)
			{
				root=root.left;
			}
			else if(root.data<a&&root.data<b)
			{
				root=root.right;
			}
			else
			{
				break;
			}
		}
		return root;
	}
	public static void main(String args[])
	{
		lca l=new lca();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
				l.insert(sc.nextInt());
		}
		Node u=l.printlca(l.root,50,110);
		System.out.println(u.data);
	}

}
