//Basic operations in stack
package stack;
import java.util.Stack;
public class stack4 
{
	public static void main(String args[])
	{
		Stack<String> s=new Stack<String>();
		s.push("Jack");
		s.push("Queen");
		s.push("King");
		s.push("Ace");
		System.out.println("Stack : "+s);
		
		//Check if the stack is Empty
		
		System.out.println("Is the Stack Empty?"+s.isEmpty());
		
		//Find the size of the stack
		System.out.println("Size of Stack : "+s.size());
		
		//Search for an element
		//the search() method return the 1-based position of the element from the top of  stack
		//it returns -1 if the element was not found in the stack
		int position=s.search("Queen");
		if(position!=-1)
		{
			System.out.println("Found the element \"Queen\" at position : "+position);
		}
		else
		{
			System.out.println("Element not found");
		}
		
	}

}
