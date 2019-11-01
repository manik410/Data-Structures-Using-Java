package linklist;
public class train 
{
	Coach firstCoach;
	static class Coach
	{
		int data;
		String data1;
		Coach next;
		Coach(String name,int seat)
		{
			data1=name;
			data=seat;
		}
	}
	public static void main(String args[])
	{
		train t=new train();
		t.firstCoach=new Coach("First-AC",25);
		Coach a2=new Coach("Second-AC",10);
		Coach s1=new Coach("First-Sleeper",10);
		Coach s2=new Coach("Second-Sleeper",10);
		Coach g1=new Coach("General",50);
		t.firstCoach.next=a2;
		a2.next=s1;
		s1.next=s2;
		s2.next=g1;
		Coach current=t.firstCoach;
		System.out.println("-----------------Train--------------------");
		while(current!=null)
		{
			System.out.print(current.data1+" Capacity -> "+current.data+" ");
			current=current.next;
		}
		
	}

}
