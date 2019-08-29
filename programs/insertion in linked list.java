//This program demonstrates how we can Insert nodes
//#At the Begining of Linked List(Head Insertion)
//#At the end of the Linked List(Tail Insertion)
//#After a given node
package linklist1;
import java.util.*;
public class insert 
{
	Node head;
	class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	//Let's Insert node at the front(head) of Linked List.
	public void addHeadNode(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node; 
	}
	//Let's Insert node in the middle anywhere of Linked List.
	public void insertAfter(Node prev_node,int data)
	{
		if(prev_node==null)
		{
			System.out.println("Oops! Prev_Node cannot be Null");
			return ;
		}
		Node newNode=new Node(data);
		newNode.next=prev_node.next;
		prev_node.next=newNode;
	}
	//Let's Insert node at the end(tail) of Linked List
	public void addTailNode(int new_data)
	{
		Node new_node=new Node(new_data);
		if(head==null)
		{
			head=new_node;
			return;
		}
		new_node.next=null;
		Node last_node=head;
		while(last_node.next!=null)
		{
			last_node=last_node.next;
		}
		last_node.next=new_node;
		return;
	}
	//Lets print all nodes here
	public void display()
	{
		Node temp_node=head;
		while(temp_node!=null)
		{
			System.out.println(temp_node.data+" ");
			temp_node=temp_node.next;
		}
	}
	public static void main(String args[])
	{
		insert llist=new insert();
		llist.addTailNode(7);
		llist.addHeadNode(2);
		llist.addHeadNode(1);
		llist.addTailNode(8);
		llist.insertAfter(llist.head.next,3);
		System.out.println("Here is the Linked List");
		llist.display();
	}

}
