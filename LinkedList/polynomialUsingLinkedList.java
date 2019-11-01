//Creating polynomial using Linked List
package linklist;
import java.util.*;
public class link1 
{
	Node head;
	static class Node
	{
		Node next;
		int data,data1;
		Node(int data,int data1)
		{
			this.data=data;
			this.data1=data1;
		}
	}
	public static void main(String args[])
	{
		int coefficient;
		int constant;
		Scanner sc=new Scanner(System.in);
		link1 l=new link1();
		System.out.println("Enter no of terms");
		int x=sc.nextInt();
		Node[] a=new Node[x];
		System.out.println("Enter constant and coefficient");
		constant=sc.nextInt();
		coefficient=sc.nextInt();
		l.head=new Node(constant,coefficient);
		for(int i=1;i<x;i++)
		{
			System.out.println("Enter constant and coefficient");
			constant=sc.nextInt();
			coefficient=sc.nextInt();
			a[i]=new Node(constant,coefficient);
		}
		l.head.next=a[1];
		for(int i=1;i<x-1;i++)
		{
			a[i].next=a[i+1];
		}
		Node current=l.head;
		while(current!=null)
		{
			System.out.print(current.data+"x^"+current.data1);
			current=current.next;
			if(current!=null)
			{
				System.out.print("+");
			}
		}
	}

}