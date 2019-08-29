//Find the total unique count of movies from the given database
//Also find the count of each unique movie category
package collections;
import java.util.*;
import java.io.*;
public class Demo9 {
	public static void main(String args[])throws IOException
	{
		FileReader fw=new FileReader("G:\\file\\data1.txt");
		BufferedReader br=new BufferedReader(fw);
		HashSet set1=new HashSet();
		ArrayList list=new ArrayList();
		String h;
		int count=0;
		br.readLine();
		while((h=br.readLine())!=null)
		{
			String[] h1=h.split(",");
			String[] h2=h1[h1.length-1].split("[|]");
			for(int i=0;i<h2.length;i++)
			{
				set1.add(h2[i]);
				list.add(h2[i]);
			}
		}
		br.close();
		fw.close();
		System.out.println("Total unique Count : "+set1.size());
		System.out.println("=================");
		set1.forEach(k->
		{
			System.out.println(k);
		});
		Iterator iter=set1.iterator();
		while(iter.hasNext())
		{
			String cp=(String)iter.next();
			count=0;
			for(int i=0;i<list.size();i++)
			{
				if(cp.equals(list.get(i)))
				{
					count++;
				}
			}
			System.out.println("Total "+cp+" movies : "+count);
		}
	}

}
