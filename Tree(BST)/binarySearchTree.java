package tree;
import java.util.Scanner;
public class binarySearchTree
{
	class Node
	{
		int data;
		Node left,right;
		Node(int x)
		{
			data=x;
			left=null;
			right=null;
		}
	}
	Node root;
	binarySearchTree()
	{
		root=null;
	}
	binarySearchTree(int x)
	{
		root=new Node(x);
	}
	public void insert(Node c,int x)
	{
		Node temp=new Node(x);
		if(c==null)
		{
			return;
		}
			if(x>c.data)
			{
				insert(c.right,x);
				if(c.right==null)
				{
					c.right=temp;
				}
			}
			else
			{
				insert(c.left,x);
				if(c.left==null)
				{
					c.left=temp;
				}
			}
	}
	public void print(Node c)
	{
		if(c==null)
			return;
		
		else
		{
			print(c.left);
			System.out.print(c.data+" ");
			print(c.right);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of terms");
		int size=sc.nextInt();
		int a;
		a=sc.nextInt();
		binarySearchTree tree=new binarySearchTree(a);
		for(int i=1;i<size;i++)
		{
			tree.insert(tree.root,sc.nextInt());
		}
		tree.print(tree.root);
	}

}
