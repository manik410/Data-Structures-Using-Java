package priorityQueue;
import java.util.*;
class student1
{
	public int id;
	public double cgpa;
	public String name;
	student1(int id,String name,double cgpa)
	{
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getCgpa()
	{
		return cgpa;
	}
}
public class student 
{
	static Comparator<student1> c=new Comparator<student1>()
	{
		public int compare(student1 s1,student1 s2)
		{
			if(s1.getCgpa()!=s2.getCgpa())
			{
				if(s1.getCgpa()>s2.getCgpa())
				{
					return -1;
				}
				else
				{
					return 1;
				}
			}
			else 
			{
				if(s1.getName().compareTo(s2.getName())!=0)
				{
					return (s1.getName().compareTo(s2.getName()));
				}
				else
				{
					return s1.getId()-s2.getId();
				}
			}
		}
	};
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of events");
		int events=sc.nextInt();
		PriorityQueue<student1> pq=new PriorityQueue<student1>(c);
		for(int i=0;i<events;i++)
		{
			String s=sc.next();
			if(s.equals("enter")||s.equals("ENTER"))
			{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter cgpa");
				double cgpa=sc.nextDouble();
				student1 su=new student1(id,name,cgpa);
				pq.add(su);
			}
			else if(s.equals("SERVED")||s.equals("served"))
			{
				pq.poll();
			}
		}
		if(pq.isEmpty())
		{
			System.out.println("Enter empty");
		}
		while(!pq.isEmpty())
		{
			student1 su=pq.poll();
			System.out.println(su.getName());
		}
		
	}
}
