//Basic linked list
package linklist;
public class link2 
{
	Node head;//this is head
	//Node class Demonstrates Node of a Linked List
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static void main(String args[])
	{
		//Let's create an empty linked list here
		link2 l=new link2();
		l.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		l.head.next=second;
		second.next=third;
		System.out.println(l);
		Node current=l.head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}

}
