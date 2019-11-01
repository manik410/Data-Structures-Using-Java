package graph;
import java.util.*;
//data structure to store graph edges
class Edge
{
	int src,dest,weight;
	Edge(int src,int dest,int weight)
	{
		this.src=src;
		this.dest=dest;
		this.weight=weight;
	}
}
//class to represent a graph object
class Graph1
{
	//data structure for adjacency list node
	static class Node
	{
		int value,weight;
		Node(int value,int weight)
		{
			this.value=value;
			this.weight=weight;
		}
	}
	//a list of list to represent adjacency list
	List<List<Node>> adj=new ArrayList<>();
	//constructor to construct graphs
	public Graph1(List<Edge> edges)
	{
		//allocate memory for adjacency list
		for(int i=0;i<edges.size();i++)
		{
			adj.add(i,new ArrayList<>());
		}
		// add edges to the undirected graph
		for(Edge e:edges)
		{
			//allocate new node in adjacency list from src to
			//dest
			adj.get(e.src).add(new Node(e.dest,e.weight));
			
			//uncomment line 39 for undirected graph
			//allocate new node in adjacency list from dest to
			//src
			//adj.get(e.dest).add(new Node(e.src,e.weight));
		}
	}
}
public class weightedgraph 
{
	//print adjacency list representation of graph
	private static void printGraph(Graph1 graph)
	{
		int src=0;
		int n=graph.adj.size();
		for(int i=0;i<n;i++)
		{
			//print current vertex and and all its
			//neighbouring vertices
			for(Graph1.Node edge:graph.adj.get(i))
			{
				System.out.print(i+"->"+edge.value+"("+
			edge.weight+")\t");
			}
			System.out.println();
			src++;
		}
	}
	//Weighted Digraph implementation in Java
	public static void main(String args[])
	{
		//Input:List of edges in a weighted digraph (as per above diagram)
		//tuple(x,y,w) represents an edge from x to y having weight w
		List<Edge> edges=Arrays.asList
				(new Edge(0,1,6),new Edge(1,2,7),new Edge(2,0,5)
				,new Edge(2,1,4),new Edge(3,2,10),new Edge(4,5,1),
				new Edge(5,4,3));
	
	//construct graph from given list of edges
	Graph1 gr=new Graph1(edges);
	//print adjacency list representation of graph
	printGraph(gr);
}

}
