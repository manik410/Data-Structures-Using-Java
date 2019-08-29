//Finding maximum from stack
package stack;
import java.util.Stack;
public class maxStack 
{
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<Integer>();
		Stack<Integer> back=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(60);
		s.push(60);
		int top=s.pop();
		back.push(top);
		while(!s.isEmpty())
		{
			int top1=s.pop();
			back.push(top1);
			top=Math.max(top, top1);
		}
		while(!back.isEmpty())
		{
			s.push(back.pop());
		}
		System.out.println("The stack is "+s);
		System.out.println("The maximum is "+top);
	}

}
