package paper;
import java.util.*;

import paper.stackLinkedList.Node;
public class queueLinkedList
{
	static class QNode
	{
		QNode link;
		int key;
		QNode(int key)
		{
			this.key=key;
			this.link=null;
		}
	}
	QNode front,rear;
	queueLinkedList()
	{
		this.front=this.rear=null;
	}
	public void enqueue(int x)
	{
		QNode temp=new QNode(x);
		if(this.rear==null)
		{
			this.rear=this.front=temp;
			return;
		}
		this.rear.link=temp;
		this.rear=temp;
	}
	QNode dequeue()
	{
		if(this.front==null)
			return null;
		QNode temp1=this.front;
		this.front=this.front.link;
		if(this.front==null)
			this.rear=null;
		return temp1;
	}
	public void display(QNode front)
	{
		if(front==null)
		{
			return;
		}
		while(front!=null)
		{
			System.out.print(front.key+" ");
			front=front.link;
		}
	}
	public void reverse(QNode front)
	{
		if(front==null)
		{
			return;
		}
		else
		{
			reverse(front.link);
			System.out.print(front.key+" ");
		}
	}
	public static void main(String args[])
	{
		char ch;
		queueLinkedList l=new queueLinkedList();
		Scanner sc=new Scanner(System.in);
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
					l.enqueue(sc.nextInt());
					break;
				case 2:
					l.dequeue();
					break;
				case 3:
					l.display(l.front);
					System.out.println();
					break;
				case 4:
					l.reverse(l.front);
					System.out.println();
					break;
			}
			System.out.println("Enter y for continue and n for exit");
			ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
	}

}
