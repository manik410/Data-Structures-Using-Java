//This java program demonstrates how to reverse a linked list
package linklist1;
import java.util.*;
public class reverse 
{
	static Node head;
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
		}
	}
	//Function to reverse the linked list
	Node reverseMyList(Node node)
	{
		Node prev=null;
		Node current=node;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node=prev;
		return node;
	}
	//prints content of linked list
	void printMyList(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	public static void main(String args[])
	{
		reverse r=new reverse();
		r.head=new Node(10);
		r.head.next=new Node(15);
		r.head.next.next=new Node(20);
		r.head.next.next.next=new Node(25);
		System.out.println("Given Linked List");
		r.printMyList(head);
		head=r.reverseMyList(head);
		System.out.println("\nReversed Linked List");
		r.printMyList(head);
	}	
}
