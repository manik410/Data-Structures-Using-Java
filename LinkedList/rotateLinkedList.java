package st2;
import java.util.*;
public class rotate 
{
	static class Node
	{
		int data;
		Node next;
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
	void rotate(int c)
	{
		Node current=head;
		int count=1;
		while(count<c&&current!=null)
		{
			current=current.next;
			count++;
		}
		Node main=current;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=head;
		head=main.next;
		main.next=null;
	}
	void print(Node head)
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
	public static void main(String args[])
	{
		rotate r=new rotate();		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			r.insert(sc.nextInt());
		}
		r.rotate(2);
		r.print(r.head);
	}

}
