//removing dublicates from sorted linked list
package linklist1;
import java.util.*;
public class dublicate
{
	static Node head;
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void insert(int d)
	{
		Node n=new Node(d);
		if(head==null)
		{
			head=n;
			return;
		}
		Node n1=head;
		while(n1.next!=null)
		{
			n1=n1.next;
		}
		n1.next=n;
	}
	public void removedublicates()
	{
		Node current=head;
		while(current!=null)
		{
			Node temp=current;
			while(temp!=null&&temp.data==current.data)
			{
				temp=temp.next;
			}
			current.next=temp;
			current=current.next;
		}
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
	public static void main(String args[])
	{
		dublicate d=new dublicate();
		Scanner sc=new Scanner(System.in);
		int x,x1;
			System.out.println("Enter the no of elements");
			x=sc.nextInt();
			for(int i=0;i<x;i++)
			{
				System.out.println("Enter the no");
				x1=sc.nextInt();
				d.insert(x1);
			}
			d.removedublicates();
			d.display();
	}
	

}
