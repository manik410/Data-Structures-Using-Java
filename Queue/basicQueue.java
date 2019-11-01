package queueprograms;
import java.util.LinkedList;
import java.util.Queue;
public class queue1 
{
	public static void main(String args[])
	{
		Queue<String> q=new LinkedList<String>();
		q.add("Jennifer");
		q.add("Angelina");
		q.add("Johnny");
		q.add("Sachin");
		System.out.println("Queue is :"+q);
		
		//Check if queue is empty
		System.out.println("Is queue is empty ?"+q.isEmpty());
		
		//Find then size of the queue
		
		System.out.println("Size of the waiting Queue is "+q.size());
		
		
		//Check if the Queue contains an element
		
		String name="Johnny";
		if(q.contains(name))
		{
			System.out.println("The queue contains "+name);
		}
		else
		{
			System.out.println("The queue doesn't contains "+name);
		}
		
		//Get the element at the front of the Queue without removing it using element()
		//The element() method throws NoSuchElementException if the queue is empty
		String firstPerson=q.element();
		System.out.println("First Person in the Waiting Queue (element()) "+firstPerson);
		
		//Get the element at the front of the Queue without removing it using peek().
		//The peek() method is similar to element() except that it returns null if the queue is empty
		
		firstPerson=q.peek();
		System.out.println("First Person in the waiting queue "+firstPerson);
	}

}
