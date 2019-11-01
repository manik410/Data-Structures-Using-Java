package queueprograms;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class queue2 
{
	public static void main(String args[])
	{
		Queue<String> q=new LinkedList<String>();
		q.add("John");
		q.add("Brad");
		q.add("Angelina");
		q.add("Julia");
		
		System.out.println("Iterating over a Queue");
		
		q.forEach(name->{
			System.out.print(name+" ");
		});
		
		
		System.out.println("\nIterating over a Queue using iterator");
		Iterator<String> iter=q.iterator();
		while(iter.hasNext())
		{
			String name=iter.next();
			System.out.print(name+" ");
		}
		
		
		System.out.println("\nIterating over a Queue using iterator and forEachRemaining");
		iter=q.iterator();
		iter.forEachRemaining(name->
		{
			System.out.print(name+" ");
		});
		
		System.out.println("\nIterating over a queue using simple for-each loop");
		for(String name:q)
		{
			System.out.print(name+" ");
		}
	}

}
