package st2;
import java.util.*;
public class linkedlistop 
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
	Node head;
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
	public void remove(int s)
	{
		Node current=head;
		boolean key=false;
		if(current.data==s)
		{
			head=current.next;
		}
		else
		{
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
	}
	public void display(Node head)
	{
		if(head==null)
		{
			return;
		}
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public void displayReverse(Node head)
	{
		if(head==null)
		{
			return;
		}
		displayReverse(head.next);
		System.out.print(head.data+" ");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		linkedlistop l=new linkedlistop();
		do 
		{
			System.out.println("Enter 1 for inserting");
			System.out.println("Enter 2 for deleting");
			System.out.println("Enter 3 for displaying");
			System.out.println("Enter 4 for displaying in reverse");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				l.insert(sc.nextInt());
				break;
			case 2:
				int data=sc.nextInt();
				l.remove(data);
				break;
			case 3:
				l.display(l.head);
				System.out.println();
				break;
			case 4:
				l.displayReverse(l.head);
				System.out.println();
				break;
			}
			System.out.println("Enter y for continue and n for exit");
			ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
	}

}
