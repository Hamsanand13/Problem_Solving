package graph;

import java.util.Scanner;
import java.util.Vector;

public class Adjacency 
{
	static void initGraph(int v, int[][] edges, int n)
	{
		Vector<Integer> adj[] = new Vector[v];
		for(int i=0;i<v;i++)
		{
			adj[i]=new Vector<>();
		}
		for(int i=0;i<n;i++)
		{
			addEdge(adj,edges[i][0],edges[i][1]);
		}
		adjacencylist(adj, v);
	}
	
	static void addEdge(Vector<Integer>[] adj, int i, int j) 
	{
		adj[i].add(j);
		
	}
	static void adjacencylist(Vector<Integer> adj[], int V)
	  {
	    for (int i = 0; i < V; i++) {
	      System.out.print(i+ "->");
	      for (int x : adj[i]) {
	        System.out.print(x+ " ");
	      }
	      System.out.println();
	    }
	  }
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int v=3;
		int edges[][]= {{0,1},{1,2},{0,2}};
		int n=3;
		initGraph(v,edges,n);
		

	}

}
