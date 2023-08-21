package graph;

import java.util.LinkedList;
import java.util.Queue;

class DFSGraph
{
	int v;
	LinkedList<Integer> adj[];
	Queue<Integer> q;
	public DFSGraph(int v) 
	{
		this.v=v;
		adj = new LinkedList[v];
		q = new LinkedList<>();
		for (int i = 0; i < adj.length; i++) 
		{
			adj[i]= new LinkedList<>();
		}
	}
	void addEdge(int u,int w)
	{
		adj[u].add(w);
	}
	void dfs(int vertex,boolean[]nodes)
	{
		int a=0;
		nodes[vertex]=true;
		System.out.println(vertex+" ");
		//q.add(n);
		for(int i =0;i<adj[vertex].size();i++)
		{
			a=adj[vertex].get(i);
			if(!nodes[a])
			{
				dfs(a,nodes);
			}
		}
	}
	void dfscheck(int vertex)
	{
		boolean nodes[]= new boolean[v];
		dfs(vertex, nodes);
	}
}
public class DFS 
{

	public static void main(String[] args) 
	{
		DFSGraph g = new DFSGraph(6);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,0);
		g.addEdge(1,3);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(3,5);
		g.addEdge(4,3);
		g.addEdge(5,3);
		g.dfscheck(0);

	}

}
