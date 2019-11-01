package st2;
import java.util.*;
public class queueLinkedList 
{
	static class QNode
	{
		QNode link;
		int key;
		QNode(int key)
		{
			this.key=key;
			link=null;
		}
	}
	QNode rear,front;
	public void enqueue(int data)
	{
		QNode temp=new QNode(data);
		if(front==null)
		{
			this.front=this.rear=temp;
			return;
		}
		this.rear.link=temp;
		this.rear=temp;
		
	}
	public QNode dequeue()
	{
		if(this.front==null)
		{
			return null;
		}
		QNode temp=this.front;
		this.front=this.front.link;
		if(this.front==null)
		{
			this.rear=null;
		}
		return temp;
	}
	public void print(QNode front)
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
	public void printReverse(QNode temp)
	{
		if(temp==null)
		{
			return;
		}
		else
		{
			printReverse(temp.link);
			System.out.print(temp.key+" ");
		}
	}
	public static void main(String args[])
	{
		queueLinkedList al=new queueLinkedList();
		Scanner sc=new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("Enter 1 for entering");
			System.out.println("Enter 2 for removing");
			System.out.println("Enter 3 for printing");
			System.out.println("Enter 4 for printing in reverse");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				al.enqueue(sc.nextInt());
				break;
			case 2:
				al.dequeue();
				break;
			case 3:
				al.print(al.front);
				System.out.println();
				break;
			case 4:
				al.printReverse(al.front);
				System.out.println();
			}
			System.out.println("Enter y for continue and n for exit");
			ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
	}

}
