//ArrayList
//freedom from fixed size
//freedom from data-type
package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Demo1 
{
	public static void main(String args[])
	{
		ArrayList list=new ArrayList();
		list.add(20);
		list.add("hello");
		list.add(200.50);
		list.add(12.2f);
		list.add("hello");
		list.remove(200.50);
		//let's print whole list in a single line
		System.out.println(list);
		
		
		// let's access individual element.
		System.out.println(list.get(1));
		
		//let's access whole list
		for(Object x:list)
		{
			System.out.println(x);
		}
		
		//Count of elements
		System.out.println("Total elements : "+list.size());
		
		
		//Accessing values using iterator
		Iterator pointer=list.iterator();
		while(pointer.hasNext())
		{
			System.out.println(pointer.next());
		}
		
		
		//for each loop
		list.forEach(item->{
			System.out.println(item);
			
		});
	}

}
