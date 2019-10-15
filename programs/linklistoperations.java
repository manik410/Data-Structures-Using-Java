package oct;
import java.util.*;
public class linkedlist
{
	static class Node
	{
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=temp;
	}
	public void display()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public void reverseDisplay(Node head)
	{
		if(head==null)
		{
			return;
		}
		reverseDisplay(head.next);
		System.out.print(head.data+" ");
	}
	public void deletion(int s)
	{
		Node current=head;
		boolean key=false;
		if(current.data==s)
		{
			head=current.next;
			return;
		}
		while(current.next!=null)
		{
			if(current.next.data==s)
			{
				current.next=current.next.next;
				return;
			}
			else
			{
				current=current.next;
			}
		}
		if(key==false)
		{
			System.out.println("Element not found");
		}
	}
	public void insertAtFront(int data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public void insertAnyWhere(Node u,int data)
	{
		if(u==null)
		{
			System.out.println("Impossible");
		}
		Node temp=new Node(data);
		temp.next=u.next;
		u.next=temp;
	}
	Node head;
	public static void main(String args[])
	{
		linkedlist l=new linkedlist();
		char ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter 1 for inserting");
			System.out.println("Enter 2 for displaying");
			System.out.println("Enter 3 for displayin in reverse");
			System.out.println("Enter 4 for deletion");
			System.out.println("Enter 5 for inserting at front");
			System.out.println("Enter 6 for inserting at middle any where in the list");
			int x=sc.nextInt();
			switch(x)
			{
			case 1:
				l.insert(sc.nextInt());
				break;
			case 2:
				l.display();
				System.out.println();
				break;
			case 3:
				l.reverseDisplay(l.head);
				System.out.println();
				break;
			case 4:
				System.out.println("Enter the no to delete");
				l.deletion(sc.nextInt());
				break;
			case 5:
				l.insertAtFront(sc.nextInt());
				break;
			case 6:
				l.insertAnyWhere(l.head.next.next,10);
				break;
			}
			System.out.println("Enter y for continue and n for exit");
			ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
	}

}
