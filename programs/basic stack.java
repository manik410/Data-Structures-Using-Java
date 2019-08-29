//Simple stack
package stack;
import java.util.Stack;
public class stack1 
{
	public static void main(String args[])
	{
		Stack<String> s=new Stack<String>();
		s.push("Jack");
		s.push("Queen");
		s.push("King");
		s.push("Ace");
	while(!s.isEmpty())
	{
		System.out.print(s.pop()+" ");
	}
	}
}
