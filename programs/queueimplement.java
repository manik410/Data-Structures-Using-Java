package paper;
import java.util.*;
public class queueimplement 
{
	private int front,rear,len,size;
	private int a[];
	queueimplement(int size)
	{
		this.size=size;
		front=-1;
		rear=-1;
		a=new int[size];
		len=0;
	}
	public int getSize()
	{
		return len;
	}
	public boolean isEmpty()
	{
		return (front==-1);
	}
	public boolean isFull()
	{
		return (front==0&&rear==size-1);
	}
	public void insert(int data)
	{
		if(rear==-1)
		{
			front=0;
			rear=0;
			a[rear]=data;
		}
		else if(rear+1>=size)
		{
			throw new IndexOutOfBoundsException("Overflow exception");
		}
		else if(rear+1<size)
		{
			a[++rear]=data;
		}
		len++;
	}
	public int remove()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Underflow exception");
		}
		else
		{
			len--;
			int y=a[front];
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
				front++;
			return y;
		}
		
	}
	public void display()
	{
		System.out.println("Queue");
		if(len==0)
		{
			System.out.println("Empty");
			return;
		}
		for(int i=front;i<=rear;i++)

	{
			System.out.print(a[i]+" ");
			}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Queue");
		int size=sc.nextInt();
		queueimplement q=new queueimplement(size);
		char ch;
		do
		{
			System.out.println("Enter 1 for entering values");
			System.out.println("Enter 2 for removing ");
			System.out.println("Enter 3 for peek value");
			System.out.println("Enter 4 for checking is empty");
			System.out.println("Enter 5 for checking is full");
			System.out.println("Enter 6 for size");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Enter the value");
				try
				{
					q.insert(sc.nextInt());
				}
				catch(Exception e)
				{
					System.out.println("Error "+e.getMessage());
				}
				break;
				case 2:
					try
					{
						System.out.println("Removed Element "+q.remove());
					}
					catch(Exception e)
					{
						System.out.println("Error "+e.getMessage());
					}
					break;
				case 3:
					try
					{
						
					}
					catch(Exception e)
					{
						System.out.println("Error "+e.getMessage());
					}
					break;
				case 4:
					System.out.println("Empty status = "+q.isEmpty());
					break;
				case 5:
					System.out.println("Fill Status = "+q.isFull());
					break;
				case 6:
					System.out.println("Size is "+q.getSize());
					break;
					default:
						System.out.println("Wrong choice");
						break;
			}
			q.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch=sc.next().charAt(0);
		}
		while(ch=='Y'||ch=='y');
	}

}
