package st2;
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
			link=null;
		}
	}
	Node top;
	public void push(int data)
	{
		Node temp=new Node(data);
		if(temp==null)
		{
			return;
		}
		temp.link=top;
		top=temp;
	}
	public void pop()
	{
		if(top==null)
		{
			return;
		}
		top=top.link;
	}
	public void print(Node top)
	{
		if(top==null)
		{
			return;
		}
		while(top!=null)
		{
			System.out.print(top.data+" ");
			top=top.link;
		}
			
	}
	public void printReverse(Node top)
	{
		if(top==null)
		{
			return;
		}
		printReverse(top.link);
		System.out.print(top.data+" ");
	}
	public void printTop(Node top)
	{
		if(top==null)
		{
			return;
		}
		else
		{
			System.out.println(top.data);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		stackLinkedList al=new stackLinkedList();
		char ch;
		do 
		{
			System.out.println("Enter 1 for entering");
			System.out.println("Enter 2 for deleting");
			System.out.println("Enter 3 for printing");
			System.out.println("Enter 4 for printing in reverse");
			System.out.println("Enter 5 for printing top data");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				al.push(sc.nextInt());
				break;
			case 2:
				al.pop();
				break;
			case 3:
				al.print(al.top);
				System.out.println();
				break;
			case 4:
				al.printReverse(al.top);
				System.out.println();
				break;
			case 5:
				al.printTop(al.top);
				break;
			
			}
			System.out.println("Enter y for continue and n for exit");
			ch=sc.next().charAt(0);
		} 
		while (ch=='Y'||ch=='y');
	}

}
