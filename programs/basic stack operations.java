//Basic stack operations
package stack;
import java.util.Stack;
public class stack2
{
	public static void main(String args[])
	{
		Stack<String> s=new Stack<String>();
		s.push("Jack");
		s.push("Queen");
		s.push("King");
		s.push("Ace");
		System.out.println("Stack of Cards=> "+s);
		System.out.println();
		
		//Poping items from stack
		
		String cardAtTop=s.pop();
		System.out.println("Stack.pop()=>"+cardAtTop);
		System.out.println("Current stack=>"+s);
		System.out.println();
		
		//Get the item at the top of stack without removing it
		
		cardAtTop=s.peek();
		System.out.println("Stack.peek()=>"+cardAtTop);
		System.out.println("Current Stack=>"+s);
		
	}
}
