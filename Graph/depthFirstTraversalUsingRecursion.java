package graph;
import java.util.*;
public class dfsrecursion
{
	private int numvertices;
	private boolean visited[];
	private LinkedList<Integer> adjlists[];
	dfsrecursion(int x)
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
		DFSUtil(x,visited);
	}
		
	void DFSUtil(int x,boolean[] visited)
	{
		visited[x]=true;
			System.out.print(x+" ");
			Iterator<Integer> i=adjlists[x].listIterator();
			while(i.hasNext())
			{
				int n=i.next();
				if(!visited[n])
				{
						DFSUtil(n,visited);
				}
		}
	}
	public static void main(String args[])
	{
		dfsrecursion g=new dfsrecursion(5);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(3,0);
		g.addEdge(2,0);
		g.addEdge(2,1);
		g.addEdge(2,4);
		g.addEdge(1,0);
		g.addEdge(1,2);
		g.addEdge(4,2);
		g.DFS(0);
	}
}
