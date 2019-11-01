package st2;
import java.util.*;
public class searchTree 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node root;
	void insert(int data)
	{
		root=insertRec(root,data);
	}
	Node insertRec(Node root,int data)
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
				root.left=insertRec(root.left,data);
			}
			else
			{
				root.right=insertRec(root.right,data);
			}
			return root;
		}
	}
	Node search(Node root,int data)
	{
		if(root==null ||root.data==data)
			return root;
		else
		{
			if(data<root.data)
			{
				return search(root.left,data);
			}
			else
			{
				return search(root.right,data);
			}
		}
	}
	public static void main(String args[])
	{
		searchTree t=new searchTree();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			t.insert(sc.nextInt());
		}
		System.out.println("Enter the Node you want to search");
		int d=sc.nextInt();
		Node temp=t.search(t.root,d);
		if(temp==null)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println("Found");
		}
	}

}
