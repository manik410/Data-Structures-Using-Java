package st2;
import java.util.*;
public class spiral 
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
	int findLevel(Node root)
	{
		int m=0,n=0;
		if(root==null)
		{
			return 0;
		}
		else
		{
			m=findLevel(root.right);
			n=findLevel(root.left);
			if(m>n)
				return m+1;
			else
				return n+1;
		}
	}
	void printSpiral(int level,Node root)
	{
		for(int i=0;i<level;i++)
		{
			if(i%2==0)
				even(root,i);
			else
				odd(root,i);
		}
	}
	static void even(Node root,int u)
	{
		if(u==0)
		{
			System.out.print(root.data+" ");
		}
		else
		{
			even(root.right,u-1);
			even(root.left,u-1);
		}
	}
	static void odd(Node root,int u)
	{
		if(u==0)
		{
			System.out.print(root.data+" ");
		}
		else
		{
				even(root.left,u-1);
				even(root.right,u-1);
		}
	}
	public static void main(String args[])
	{
		spiral s=new spiral();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			s.insert(sc.nextInt());
		}
		int level=s.findLevel(s.root);
		s.printSpiral(level,s.root);
	}

}
