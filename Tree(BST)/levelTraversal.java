package st2;
import java.util.*;
public class levelTraversal 
{
	static class Node
	{
		Node left,right;
		int data;
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
	void print(Node root)
	{
		if(root==null)
		{
			return;
		}
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			root=q.poll();
			System.out.print(root.data+" ");
			if(root.left!=null)
			{
				q.add(root.left);
			}
			if(root.right!=null)
			{
				q.add(root.right);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		levelTraversal t=new levelTraversal();
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			t.insert(sc.nextInt());
		}
		t.print(t.root);
	}

}
