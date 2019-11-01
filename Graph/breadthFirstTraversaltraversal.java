package graph;
import java.util.*;
public class bfstraversal 
{
	private int numVertices;
	private LinkedList<Integer> adjLists[];
	private boolean visited[];
	bfstraversal(int x)
	{
		numVertices=x;
		adjLists=new LinkedList[numVertices];
		for(int i=0;i<numVertices;i++)
		{
			adjLists[i]=new LinkedList();
		}
	}
	void addEdge(int sr,int dest)
	{
		adjLists[sr].add(dest);
	}
	void BFS(int x)
	{
		visited=new boolean[numVertices];
		Queue<Integer> queue = new LinkedList<Integer>(); 
        visited[x]=true; 
        queue.add(x); 
        while (queue.size() != 0) 
        { 
            x = queue.poll(); 
            System.out.print(x+" "); 
            Iterator<Integer> i = adjLists[x].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 
	public static void main(String args[])
	{
		bfstraversal g=new bfstraversal(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		System.out.println("Following is the breadth first traversal starting from"
				+ "vertex 2");
		g.BFS(2);
	}

}
