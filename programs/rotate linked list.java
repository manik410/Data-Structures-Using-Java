//Rotating a Linked List
package linklist1;
import java.util.*;
public class rotate 
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
	public void rotate1(int a)
	{
		Node current=head;
		int count=1;
		while(count<a&&current!=null)
		{
			current=current.next;
			count++;
		}
		if(current==null)
			return;
		Node main=current;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=head;
		head=main.next;
		main.next=null;
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
		Scanner sc=new Scanner(System.in);
		rotate r=new rotate();
		System.out.println("Enter size of link list");
		int x=sc.nextInt();
		int x1;
		for(int i=0;i<x;i++)
		{
			System.out.println("Enter no");
			x1=sc.nextInt();
			r.insert(x1);
		}
		System.out.println("Enter the value of k from where to rotate");
		int k=sc.nextInt();
		if(k>x)
		{
			System.out.println("Impossible");
		}
		else
		{
			r.rotate1(k);
			r.display();
		}
	}
}
