package st2;
import java.util.*;
public class stackArray 
{
	private long a[];
	int top=0;
	int maxsize=0;
	stackArray(int size)
	{
		top=-1;
		maxsize=size;
		a=new long[maxsize];
	}
	public boolean isFull()
	{
		return top==maxsize-1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public void push(int data)
	{
		a[++top]=data;
	}
	public long peek()
	{
		return a[top];
	}
	public long pop()
	{
		return a[top--];
	}
	public static void main(String args[])
	{
		stackArray sr=new stackArray(5);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			sr.push(sc.nextInt());
		}
		while(!sr.isEmpty())
		{
			long y=sr.peek();
			sr.pop();
			System.out.print(y+" ");
		}
	}
}
