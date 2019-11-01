package st2;
import java.util.*;
public class levelfind
{
	static class Node
	{
		Node left,right;
		int data;
		Node(int data)
		{
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
	int printLevel(Node root)
	{
		int m=0,n=0;
		if(root==null)
			return -1;
		m=printLevel(root.right);
		n=printLevel(root.left);
		if(m>n)
			return m+1;
		else
			return n+1;
	}
	int printHeight(Node root)
	{
		int m=0,n=0;
		if(root!=null)
		{
			m=printHeight(root.left);
			m++;
			n=printHeight(root.right);
			n++;
			return m=m>n?m:n;
		}
		else
		{
			return 0;
		}	
	}
	public static void main(String args[])
	{
		levelfind f=new levelfind();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			f.insert(sc.nextInt());
		}
		int l=f.printLevel(f.root);
		System.out.println("The level of the tree is "+l);
		int h=f.printHeight(f.root);
		System.out.println("The height of the tree is "+h);
	}

}
