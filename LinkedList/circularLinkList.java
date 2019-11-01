package st2;
import java.util.*;
public class circularLink 
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
	void madeCircular()
	{
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=head;
	}
	Node current;
	static boolean isCircular(Node head)
	{
		if(head==null)
			return true;
		Node tem=head.next;
		while(tem!=null&&tem!=head)
		{
			tem=tem.next;
		}
		return (tem==head);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		circularLink l=new circularLink();
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			l.insert(sc.nextInt());
		}
		System.out.println(isCircular(l.head));
		l.madeCircular();
		System.out.println(isCircular(l.head));
	}

}
