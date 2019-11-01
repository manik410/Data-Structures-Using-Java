package paper;
import java.util.*;
public class stackLinkedList 
{
	static class Node
	{
		int data;
		Node link;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node top;
	stackLinkedList()
	{
		this.top=null;
	}
	public void push(int data1)
	{
		Node temp=new Node(data1);
		if(temp==null)
		{
			System.out.println("Heap Overflow");
			return;
		}
		temp.link=top;
		top=temp;
			
	}
	public boolean isEmpty()
	{
		return top==null;
	}
	public int peek()
	{
		if(!isEmpty())
			return top.data;
		else
		{
			System.out.println("Stack Empty");
			return -1;
		}
	}
	public void pop()
	{
	if(top==null)
	{
		System.out.println("Stack Underflow");
		return;
	}
		top=top.link;
	}
	public void display()
	{
		if(top==null)
		{
			System.out.println("Stack Underflow");
			System.exit(0);
		}
		Node cr=top;
		while(cr!=null)
		{
			System.out.print(cr.data+" ");
			cr=cr.link;
		}
		System.out.println();
	}
	public void reverse(Node top)
	{
		if(top==null)
		{
			return;
		}
		reverse(top.link);
		System.out.print(top.data+" ");
	}
	public static void main(String args[])
	{
		stackLinkedList l=new stackLinkedList();
		Scanner sc=new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("Enter 1 for inserting");
			System.out.println("Enter 2 for deletion");
			System.out.println("Enter 3 for Forward to Backward");
			System.out.println("Enter 4 for Backward to Forward");
			int choice=sc.nextInt();
			switch(choice)
			{	
				case 1:
					l.push(sc.nextInt());
					break;
				case 2:
					l.pop();
					break;
				case 3:
					l.display();
					break;
				case 4:
					l.reverse(l.top);
					System.out.println();
					break;
			}
			System.out.println("Enter y for continue and n for exit");
			ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
	}

}
