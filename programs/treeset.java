//Tree Set by default it is ascending.
package collections;
import java.io.*;
import java.util.*;
public class Demo6
{
	public static void main(String args[])throws IOException
	{
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(3);
		set.add(6);
		set.add(1);
		set.add(4);
		System.out.println(set);
		Iterator<Integer> iter=set.descendingIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}