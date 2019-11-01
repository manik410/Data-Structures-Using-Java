package st2;
import java.util.*;
public class levelInsertion 
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
	Node insertlt(int[] a,Node root,int i)
	{
		if(i<a.length)
		{
			Node temp=new Node(a[i]);
			root=temp;
			root.left=insertlt(a,root.left,2*i+1);
			root.right=insertlt(a,root.right,2*i+2);
		}
		return root;
	}
	void print(Node root)
	{
		if(root==null)
			return;
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		levelInsertion l=new levelInsertion();
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		l.root=l.insertlt(a,l.root,0);
		l.print(l.root);
	}
}
