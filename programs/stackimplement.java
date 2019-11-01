package paper;
import java.util.*;
public class stackimplement 
{
	private long[] a;
	int top;
	int maxsize;
	stackimplement(int size)
	{
		maxsize=size;
		a=new long[maxsize];
		top=-1;
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public boolean isFull()
	{
		return (top==maxsize-1);
	}
	public long pop()
	{
		return a[top--];
	}
	public long peek()
	{
		return a[top];
	}
	public void push(int data)
	{
		a[++top]=data;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int size=sc.nextInt();
		stackimplement ar=new stackimplement(size);
		for(int i=0;i<size;i++)
		{
			ar.push(sc.nextInt());
		}
		while(!ar.isEmpty())
		{
			long value=ar.peek();
			System.out.print(value+" ");
			ar.pop();
		}
	}

}
