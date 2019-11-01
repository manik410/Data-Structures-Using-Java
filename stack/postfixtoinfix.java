package st2;
import java.util.*;
public class postfixtoinfix 
{
	static boolean isCharacter(char ch)
	{
		return (ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z');
	}
	public String convert(String s)
	{
		Stack<String> s1=new Stack<String>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(isCharacter(c))
			{
				s1.push(c+"");
			}
			else
			{
				String op=s1.pop();
				String op1=s1.pop();
				s1.push("("+op1+s.charAt(i)+op+")");
			}
		}
		return s1.peek();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		postfixtoinfix ab=new postfixtoinfix();
		String s1=sc.next();
		String s2="";
		s2=ab.convert(s1);
		System.out.println(s2);
	}

}
