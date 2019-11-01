package linklist1;
import java.util.*;
public class middle 
{
	static Node head;
	static int x;
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
	public  void insert(int d)
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
	public void display()
	{
		int count=0,x1;
		Node current=head;
			x1=(x/2);
			while(current!=null)
			{
				current=current.next;
				count++;
				if(count==x1)
				{
					System.out.println("The middle no is "+current.data);
					break;
				}
			}
			
		}
	public static void main(String args[])
	{
		middle m=new middle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of link list");
		x=sc.nextInt();
		int x1;
		for(int i=0;i<x;i++)
		{
			System.out.println("Enter no");
			x1=sc.nextInt();
			m.insert(x1);
		}
		m.display();
	}

}
