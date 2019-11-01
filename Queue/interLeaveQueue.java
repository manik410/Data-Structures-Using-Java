package st2;
import java.util.*;
public class interLeaveQueue
{
	static void print1(Queue<String> q)
	{
		Stack<String> s1=new Stack<String>();
		int a=q.size()/2;
		for(int i=0;i<a;i++)
		{
			s1.push(q.poll());
		}
		while(!s1.isEmpty())
		{
			q.add(s1.pop());
		}
		for(int i=0;i<a;i++)
		{
			q.add(q.poll());
		}
		for(int i=0;i<a;i++)
		{
			s1.push(q.poll());
		}
		while(!s1.isEmpty())
		{
			q.add(s1.pop());
			q.add(q.poll());
		}
		while(!q.isEmpty())
		{
			System.out.print(q.poll()+" ");
		}
	}
	public static void main(String args[])
	{
		Queue<String> q=new LinkedList<String>();
		q.add("Sunday");
		q.add("Monday");
		q.add("Tuesday");
		q.add("Wednesday");
		q.add("Thursday");
		q.add("Friday");
		q.add("Saturday");
		q.add("Apple");
		q.add("Banana");
		q.add("Orange");
		q.add("Cherry");
		q.add("Kiwi");
		q.add("Mango");
		q.add("Litchi");
		print1(q);
	}

}
