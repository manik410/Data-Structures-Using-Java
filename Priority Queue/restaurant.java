package priorityQueue;
import java.util.*;
class rest
{
	String name;
	int time;
	int no;
	rest(String name,int time,int no)
	{
		this.name=name;
		this.time=time;
		this.no=no;
	}
	public  String getName()
	{
		return name;
	}
	public int getTime()
	{
		return time;
	}
	public int getNo()
	{
		return no;
	}
}
public class restaurant 
{
	static Comparator<rest> c=new Comparator<rest>()
			{
		public int compare(rest c1,rest c2)
		{
			if(c1.getTime()>c2.getTime())
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
			};
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		PriorityQueue<rest> pq=new PriorityQueue<rest>(c);
		boolean f=true;
		int i=0;
		do
		{
			System.out.println("Enter 1 for entering customer details and 2 for exit ");
			int x=sc.nextInt();
			if(x==1)
			{
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter time for which customer is waiting");
				int time=sc.nextInt();
				i++;
				int p=(i*i)+i+41;
				rest su=new rest(name,time,p);
				pq.add(su);
			}
			else
			{
				f=false;
			}
		}
		while(f==true);
		while(!pq.isEmpty())
		{
			rest r=pq.poll();
			System.out.println(r.getName()+" "+r.getTime()+" "+r.getNo());
		}
	}

}
