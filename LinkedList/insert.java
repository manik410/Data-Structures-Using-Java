package st2;
import java.util.*;
public class insert 
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
	void insertAtHead(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		temp.next=head;
		head=temp;
	}
	void print(Node head)
	{
		Node current=head;
		if(head==null)
			return;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	void insertAfter(Node cur,int data)
	{
		Node temp=new Node(data);
		temp.next=cur.next;
		cur.next=temp;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		insert t=new insert();
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			t.insertAtHead(sc.nextInt());
		}
		t.print(t.head);
		System.out.println();
		t.insertAfter(t.head.next.next,10);
		t.print(t.head);
	}

}
