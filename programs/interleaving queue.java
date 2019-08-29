//Interleaving queue
package queueprograms;
import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
public class queue7 
{
	static void interLeaveQueue(Queue<Integer> q)
	{
		//To check the even no of elements
		if(q.size()%2!=0)
			System.out.println("Input even no of integers");
		
		//Initialize an empty stack of int type
		Stack<Integer> s=new Stack<Integer>();
		int halfSize=q.size()/2;
		
		//Push first half elements into the stack
		//Queue"16 17 18 19 20,stack: 15(T) 14 13 12 11
		for(int i=0;i<halfSize;i++)
		{
			s.push(q.poll());
			//q.poll();
		}
		//enqueue back the stack elements
		//queue:16 17 18 19 20 15 14 13 12 11
		while(!s.isEmpty())
		{
			q.add(s.pop());
			//s.pop();
		}
		//dequeue the first half elements of queue
		//and enqueue them back
		//queue:15 14 13 12 11 16 17 18 19 20
		for(int i=0;i<halfSize;i++)
		{
			q.add(q.poll());
			//q.poll();
		}
		//again push the first half elements into the stack
		//queue:16 17 18 19 20
		for(int i=0;i<halfSize;i++)
		{
			s.push(q.poll());
			//q.poll();
		}
		//interleave the elements of queue and stack
		//queue:11 16 12 17 13 18 14 19 15 20
		while(!s.isEmpty())
		{
			q.add(s.pop());
			//s.pop();
			q.add(q.poll());
			//q.poll();
		}
	}
	//Driver Code
	public static void main(String args[])
	{
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		q.add(20);
		interLeaveQueue(q);
		int length=q.size();
		for(int i=0;i<length;i++)
		{
			System.out.print(q.peek()+" ");
			q.poll();
		}
	}

}
