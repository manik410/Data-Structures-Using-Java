//Doubling each element of Queue
package queueprograms;
import java.util.LinkedList;
import java.util.Stack;
import java.util.*;
public class queue4 
{
	static void stutter(Queue<Integer> q)
	{
		Queue<Integer> s=new LinkedList<Integer>();
		while(!q.isEmpty())
		{
			int l=q.poll();
			s.add(l);
			s.add(l);
		}
		s.forEach(name->
		{
			System.out.print(name+" ");
		});
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Queue<Integer> q=new LinkedList<Integer>();
		int x,x1;
		System.out.println("Enter the size of queue");
		x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			x1=sc.nextInt();
			q.add(x1);
		}
		stutter(q);
	}

}
