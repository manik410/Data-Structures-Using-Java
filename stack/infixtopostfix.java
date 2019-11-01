package st2;
import java.util.*;
public class infixtopostfix
{
	static int pre(char ch)
	{
		switch(ch)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
	}
		return -1;
			}
	public String convert(String s)
	{
		Stack<Character> s2=new Stack<Character>();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				s1=s1+ch;
			}
			else if(ch=='(')
				s2.push(ch);
			else if(ch==')')
			{
				while(!s2.isEmpty()&&s2.peek()!='(')
				{
					s1=s1+s2.pop();
				}
				if(!s2.isEmpty()&&s2.peek()!='(')
					return "Invalid EXpression";
				else
					s2.pop();
			}
			else
			{
				while(!s2.isEmpty()&&pre(ch)<=pre(s2.peek()))
				{
					s1=s1+s2.pop();
				}
				s2.push(ch);
			}
		}
		while(!s2.isEmpty())
		{
			s1=s1+s2.pop();
		}
		return s1;
	}
	public static void main(String args[])
	{
		infixtopostfix ar=new infixtopostfix();
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=ar.convert(s);
		System.out.println(s1);
	}

}
