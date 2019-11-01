package tree;
import java.util.*;
public class treeoperations 
{
	class Node
	{
		Node left,right;
		int key;
		Node(int key)
		{
			left=right=null;
			this.key=key;
		}
	}
	Node root;
	void insert(int data)
	{
		root=insertRec(root,data);
	}
	Node insertRec(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		else
		{
			if(data<root.key)
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
	void inorderTraversal(Node root)
	{
		if(root==null)
			return;
		else
		{
			inorderTraversal(root.left);
			System.out.print(root.key+" ");
			inorderTraversal(root.right);
		}
	}
	void postorderTraversal(Node root)
	{
		if(root==null)
			return;
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.key+" ");
	}
	void preorderTraversal(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.key+" ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		
	}
	void levelorderTraversal(Node root)
	{
		if(root==null)
			return;
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			root=q.poll();
			System.out.print(root.key+" ");
			if(root.left!=null)
				q.add(root.left);
			if(root.right!=null)
				q.add(root.right);
		}
		
	}
	Node search(Node root,int key)
	{
		if(root==null||root.key==key)
		{
			return root;
		}
		else
		{
			if(key<root.key)
				return search(root.left,key);
			else
				return search(root.right,key);
		}
	}
	void delete(int data)
	{
		root=deleteRec(root,data);
	}
	Node deleteRec(Node root,int data)
	{
		if (root==null)
				return root;
		if(data<root.key)
			root.left=deleteRec(root.left,data);
		else if(data>root.key)
			root.right=deleteRec(root.right,data);
		else
		{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.key=minValue(root.right);
			root.right=deleteRec(root.right,root.key);
		}
		return root;		
	}
	int minValue(Node root)
	{
		int minv=root.key;
		while(root.left!=null)
		{
			minv=root.left.key;
			root=root.left;
		}
		return minv;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		treeoperations tree=new treeoperations();
		boolean t=true;
		while(t)
		{
		System.out.println("Enter 1 for creating Bst");
		System.out.println("Enter 2 for searching node");
		System.out.println("Enter 3 for inorderTraversal");
		System.out.println("Enter 4 for postorderTraversal");
		System.out.println("Enter 5 for preorderTraversal");
		System.out.println("Enter 6 for levelOrder Traversal");
		System.out.println("Enter 7 for deleting Node");
		System.out.println("Enter 8 for exit");
		int x=sc.nextInt();
		
			switch(x)
			{
			case 1:
				System.out.println("Enter the no of terms");
				int data=sc.nextInt();
				for(int i=0;i<data;i++)
				{
					tree.insert(sc.nextInt());
				}
				break;
			case 2:
				System.out.println("===Searching Node===");
				System.out.println("Enter the data to be searched");
				int u=sc.nextInt();
				Node temp=tree.search(tree.root,u);
				if(temp==null)
				{
					System.out.println("Node is not present");
				}
				else
				{
					System.out.println("The Node "+u+" is present");
				}
				break;
			case 3:
				System.out.println("===Inorder Traversal===");
				tree.inorderTraversal(tree.root);
				System.out.println();
				break;
			case 4:
				System.out.println("===Postorder Traversal===");
				tree.postorderTraversal(tree.root);
				System.out.println();
				break;
			case 5:
				System.out.println("===Preorder Traversal===");
				tree.preorderTraversal(tree.root);
				System.out.println();
				break;
			case 6:
				System.out.println("===Levelorder Traversal===");
				tree.levelorderTraversal(tree.root);
				System.out.println();
				break;
			case 7:
				System.out.println("===Deleting Node===");
				System.out.println("Enter node to delete");
				int u1=sc.nextInt();
				tree.delete(u1);
				break;
			case 8:
				System.out.println("Exiting");
				t=false;
			}
		}
	}
}
