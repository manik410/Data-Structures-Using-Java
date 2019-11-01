
//=>Ordinary queue is ordered(means the order of insertion is maintained)
//But in Priority queue ordered is not maintained.It does not follows the FIFO principle.
//lowest at front highest at rear(default behaviour)
//remove function follows FIFO principle
// adding an element in ordinary queue the element to be processed is the element to be entered
//priority queue helps in deciding priority to be given to choose a particular element
//default priority is lowest to highest
package priorityQueue;
import java.util.*;
public class basic 
{
	public static void main(String args[])
	{
		PriorityQueue<String> namepqueue=new PriorityQueue<String>();
		namepqueue.add("Lisa");
		namepqueue.add("Robert");
		namepqueue.add("John");
		namepqueue.add("Chris");
		namepqueue.add("Angelina");
		System.out.print(namepqueue);
		System.out.println();
		while(!namepqueue.isEmpty())
		{
			System.out.print(namepqueue.remove()+" ");;
		}
	}

}
