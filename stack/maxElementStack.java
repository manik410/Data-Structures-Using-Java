package st2;
import java.util.*;
public class maxStack 
{
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			s.push(sc.nextInt());
		}
		int max=s.pop();
		while(!s.isEmpty())
		{
			int m=s.pop();
			max=Math.max(max, m);
		}
		System.out.println(max);
	}

}
