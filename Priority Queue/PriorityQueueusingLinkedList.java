package priorityQueue;
import java.util.*;
public class QueueusingLinkedList 
{
	 static class Node
	 {
	 	Node next;
	 	int data;
	 	int priority;
	 }
	 //static Node node=new Node();
	 
	 //function to create a new Node
	 static Node newNode(int d,int p)
	 {
		 Node temp=new Node();
		 temp.data=d;
		 temp.priority=p;
		 temp.next=null;
		 return temp;
	 }
	 //return the value at head
	 static int peek(Node head)
	 {
		 return head.data;
	 }
	 //removes the element with the highest priority from the list
	 static Node pop(Node head)
	 {
		 //Node temp=head;
		 head=head.next;
		 return head;
	 }
	 
	 //function  to push according to priority
	 static Node push(Node head,int d,int p)
	 {
		 Node start=head;
		 
		 //create new Node
		 Node temp=newNode(d,p);
		    // Special Case: The head of list has lesser  
		    // priority than new node. So insert new  
		    // node before head node and change head node. 
		 if(head.priority>p)
		 {
			 //insert new node before head
			 temp.next=head;
			 head=temp;
		 }
		 else
		 {
			 //traverse the list and find position to insert new node
			 while(start.next!=null&&start.next.priority<p)
			 {
				 start=start.next;
			 }
		        // Either at the ends of the list  
		        // or at required position 
			 temp.next=start.next;
			 start.next=temp;
		 }
		 return head;
	 }
	 //function to check if list is empty
	 static int isEmpty(Node head)
	 {
		 return head==null?1:0;
	 }
	public static void main(String args[])
	{
		//create a priority queue
		//7.4.5.6
		Node pq=newNode(4,1);
	    pq =push(pq, 5, 2);  
	    pq =push(pq, 6, 3);  
	    pq =push(pq, 7, 0);  
	    
	    while (isEmpty(pq)==0) {  
	        System.out.printf("%d ", peek(pq));  
	        pq=pop(pq);  
	    } 
	}

}
