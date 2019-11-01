package queueprograms;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Stack;
public class queue3 
{
	public static void main(String args[])
	{
		int x,x1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		x=sc.nextInt();
		Queue<Integer> q=new LinkedList<Integer>();
		Stack<Integer> s=new Stack<Integer>();
		for(int i=0;i<x;i++)
		{
			x1=sc.nextInt();
			q.add(x1);
		}
		while(!q.isEmpty())
		{
			s.push(q.poll());
		}
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
		q.forEach(name->
		{
			System.out.print(name+" ");
		});
	}

}
