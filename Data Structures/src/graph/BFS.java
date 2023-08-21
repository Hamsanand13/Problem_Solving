package graph;

import java.util.LinkedList;
import java.util.Queue;

class Graph
{
	int v;
	LinkedList<Integer> adj[];
	Queue<Integer> q;
	public Graph(int v) 
	{
		this.v=v;
		adj = new LinkedList[v];
		for (int i = 0; i < adj.length; i++)
		{
			adj[i]= new LinkedList<>();
		}
		q=new LinkedList<Integer>();
	}
	
	public void addEdge(int v, int w) 
	{
		adj[v].add(w);		
	}
	void BFS(int n)
	{
		boolean nodes[]= new boolean[v];
		int a = 0;
		nodes[n]=true;
		q.add(n);
		while (q.size()!=0) 
		{
			n=q.poll();
			System.out.println(n+" ");
			for (int i = 0; i < adj[n].size(); i++) 
			{
				a=adj[n].get(i);
				
				if(!nodes[a])
				{
					nodes[a]=true;
					q.add(a);
				}
			}
		}
	}
	
}
public class BFS 
{

	public static void main(String[] args) 
	{
		Graph g = new Graph(6);
		g.addEdge(0,1);
		g.addEdge(0,3);
		g.addEdge(0,4);
		g.addEdge(4,5);
		g.addEdge(3,5);
		g.addEdge(1,2);
		g.addEdge(1,0);
		g.addEdge(2,1);
		g.addEdge(4,1);
		g.addEdge(3,1);
		g.addEdge(5,4);
		g.addEdge(5,3);
		g.BFS(0);
		
		

	}

}
