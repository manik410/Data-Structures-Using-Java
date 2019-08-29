//HashMap (Key-Value) Pair
package collections;
import java.io.*;
import java.util.*;
public class Demo7
{
	public static void main(String args[])
	{
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("en", "English");
		map.put("fr", "French");
		map.put("hi", "Hindi");
		map.put("cn", "Chinese");
		map.put("Hi", "English");
		
		//Individual Access
		System.out.println(map.get("hi"));
		
		
		//Printing all together
		//First Method
		Set s=map.keySet();
		s.forEach(k->
		{
			System.out.println(k+"=>"+map.get(k));
		});
		
			//Second Method
		  for(Map.Entry<String,String> m:map.entrySet())
		  {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		   }
	}
}
