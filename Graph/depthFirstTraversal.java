package graph;
import java.util.*;
public class dfstraversal
{
	private int numvertices;
	private boolean visited[];
	private LinkedList<Integer> adjlists[];
	dfstraversal(int x)
	{
		numvertices=x;
		adjlists=new LinkedList[numvertices];
		for(int i=0;i<x;i++)
		{
			adjlists[i]=new LinkedList();
		}
	}
	void addEdge(int src,int dest)
	{
		adjlists[src].add(dest);
	}
	void DFS(int x)
	{
		visited=new boolean[numvertices];
		visited[x]=true;
		Stack<Integer> s=new Stack<Integer>();
		s.push(x);
		while(!s.isEmpty())
		{
			x=s.pop();
			System.out.print(x+" ");
			Iterator<Integer> i=adjlists[x].listIterator();
			while(i.hasNext())
			{
				int n=i.next();
				if(!visited[n])
				{
					visited[n]=true;
					s.push(n);
				}
			}
		}
	}
	public static void main(String args[])
	{
		dfstraversal g=new dfstraversal(5);
		g.addEdge(0,3);
		g.addEdge(0,2);
		g.addEdge(0,1);
		g.addEdge(2,1);
		g.addEdge(2,4);
		g.DFS(0);
	}
}
