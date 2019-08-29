//Find the following insights from the given dataset
//=>Display the average salary of all employees
//=>Display the list of Male Employees(Name/Salary) from Sales Team and whose Salary<Average Salary.
//=>Display the list of Employees in Descending order according to Salary.
//int salary=Integer.parseInt(h.split(",")[4]);
package collections;
import java.util.*;
import java.io.*;
public class Demo5 
{
	public static void main(String args[])throws IOException
	{
		ArrayList<Integer> sal=new ArrayList<Integer>();
	    Map<Integer,String> h2= new TreeMap<Integer,String>(Collections.reverseOrder());
		FileReader fr=new FileReader("G:\\file\\data.txt");
		BufferedReader br=new BufferedReader(fr);
		int sum=0;
		String h;
		br.readLine();
		while((h=br.readLine())!=null)
		{
			String[] s=h.split(",");
			int salary=Integer.parseInt(h.split(",")[4]);
			sum=sum+salary;
			sal.add(salary);
			h2.put(Integer.parseInt(s[4]),s[0]);
		}
		br.close();
		fr.close();
		int l=sal.size();
		sum=sum/l;
		System.out.println("The Average Salary of all Employees : "+sum);
		System.out.println("===========================");
		FileReader fr1=new FileReader("G:\\file\\data.txt");
		BufferedReader br1=new BufferedReader(fr1);
		String h1;
		br1.readLine();
		while((h1=br1.readLine())!=null)
		{
			String s[]=h1.split(",");
			if(s[1].equals("Male")&&s[s.length-1].equals("Sales")&&(Integer.parseInt(s[4])<sum))
			{
				System.out.println("Name : "+s[0]);
				System.out.println("Salary : "+s[4]);
			}
		}
		System.out.println("===========================");
        for (Map.Entry<Integer, String> entry : h2.entrySet())  
            System.out.println("Name = " + entry.getValue()+", Salary = " + entry.getKey()); 
		br1.close();
		fr1.close();
}
}
