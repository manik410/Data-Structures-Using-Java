//Iterating stack
package stack;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Iterator;
public class stack3 
{
	
	public static void main(String args[])
	{
		Stack<String> s=new Stack<String>();
		s.push("Plate 1");
		s.push("Plate 2");
		s.push("Plate 3");
		s.push("Plate 4");
		System.out.println("===Iterator over a stack using forEach() method");
		s.forEach(plate->{
			System.out.println(plate);
		});
		System.out.println("===Iterator over a stack using iterator");
		
		//moves only forward
		Iterator<String> iter=s.iterator();
		while(iter.hasNext())
		{
			String plate=iter.next();
			System.out.println(plate);
		}
		//Moves both forward and backward
		System.out.println("====Iterate over a stack from top to bottom using listIterator()");
		ListIterator<String> iter1=s.listIterator(s.size());
		while(iter1.hasPrevious())
		{
			String plate=iter1.previous();
			System.out.println(plate);
		}
	}

}
