//TreeMap
//Stores data in Sorted Order
package collections;
import java.util.Map;
import java.util.TreeMap;
public class Demo8 
{
	public static void main(String args[])
	{
		TreeMap<Integer, String> sorted=new TreeMap<Integer,String>();
		sorted.put(5, "Five");
		sorted.put(4, "four");
		sorted.put(1, "one");
		sorted.put(2, "two");
		sorted.put(3, "three");
		for(Map.Entry<Integer, String> pair:sorted.entrySet())
		{
			System.out.println(pair.getKey()+"=>"+pair.getValue());
		}
	}

}
