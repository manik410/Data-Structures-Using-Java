//ArrayList using Generic class.
//Always avoid type casting.
//It checks at compile time.
package collections;
import java.util.*;
public class Demo3 
{
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		for(int x:al)
		{
			System.out.println(x);
		}
		//Enhanced For Loop
		al.forEach(item->{
			System.out.println(item);
		});
	}

}
