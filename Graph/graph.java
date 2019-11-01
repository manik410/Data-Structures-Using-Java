//undirected graph
package graph;
import java.util.*;
public class graph 
{
	//A user define class to represent a graph
	//A graph is an array of adjacency lists.
	//Size of arraylist will be V(number of vertices) in graph
	static class Graph
	{
		int V;
		LinkedList<Integer> adjListArray[];
		//constructor
		Graph(int V)
		{
			this.V=V;
			//defines the size of array as no of vertices
			adjListArray=new LinkedList[V];
			//create a new list for each vertex
			//such that adjacent nodes can be stored
			for(int i=0;i<V;i++)
			{
				adjListArray[i]=new LinkedList<>();
			}
		}
	}
	//adds an edge to an undirected graph
	static void addEdge(Graph graph,int src,int dest)
	{
		//Add an edge from src to dest
		graph.adjListArray[src].add(dest);
		
		//Since graph is undirected add an edge from dest
		//to src also
		graph.adjListArray[dest].add(src);
	}
	//a utility function to print the adjacency list
	//representation of graph
	static void printGraph(Graph graph)
	{
		for(int v=0;v<graph.V;v++)
		{
			System.out.println("Adjacency list of vertex " +v);
			System.out.print("head");
			for(Integer pCrawl:graph.adjListArray[v])
			{
				System.out.print("->"+pCrawl);
			}
			System.out.println();
		}
	}
	//Driver program to test above functions
	public static void main(String args[])
	{
		//Create the graph given in above figure
		int V=5;
		Graph gr=new Graph(V);
		addEdge(gr,0,1);
		addEdge(gr,0,4);
		addEdge(gr,1,2);
		addEdge(gr,1,3);
		addEdge(gr,1,4);
		addEdge(gr,2,3);
		addEdge(gr,3,4);
		//print the adjacency list representation of above
		//graph
		printGraph(gr);
	}

}
