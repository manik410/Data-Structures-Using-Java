package st2;
import java.util.*;
public class dublicate 
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
	void insert(int data)
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
	void removeDublicate()
	{
		Node current=head;
		while(current!=null)
		{
			Node t=current;
			while(t.next!=null)
			{
				if(t.next.data==current.data)
				{
					t.next=t.next.next;
				}
				else
				{
					t=t.next;
				}
			}
			current=current.next;
		}
	}
	void print(Node head)
	{
		Node current=head;
		if(head==null)
		{
			return;
		}
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		dublicate d1=new dublicate();
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			d1.insert(sc.nextInt());
		}
		d1.removeDublicate();
		d1.print(d1.head);
	}

}
