package graph;

import java.util.ArrayList;
/*Problem Statements:
 * No of connected islands 
 * no of provinces
 * 
 */
public class Graph_L7_NumbersOfProvinces {
	
	public static int noOfProvinces(ArrayList<ArrayList<Integer>> adj, int n) {
		
		//size n+1; since if size=n then index goes upto n-1(i.e. 8-1=7)
		//but we have 8 nodes
		boolean[] visited= new boolean[n+1];
		
		int count=0;
		
		for(int i=1;i<=n;i++) {
			
			if(visited[i]==false) {
				count++;
				dfsTraversal(adj,visited,i);
				
			}
		}
		
		return count;
	}

	public static void dfsTraversal(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int s) {
		
		if(vis[s]==false)	
			vis[s] = true;
		
		
		for(Integer it : adj.get(s))
			if(vis[it]==false) {
				dfsTraversal(adj,vis,it);
			}
				
		
	}
	public static void addEdge(ArrayList<ArrayList<Integer>> adj,Integer u,Integer v) {
		
		adj.get(u).add(v);
		adj.get(v).add(u);
		
	}
	public static void main(String[] args) {
		
		int noOfNodes=8;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<=noOfNodes;i++)
			adj.add(new ArrayList<Integer>());
		
		addEdge(adj,1,2);
		addEdge(adj,2,3);
		
		addEdge(adj,4,5);
		addEdge(adj,5,6);
		
		addEdge(adj,7,8);
		
		System.out.println(noOfProvinces(adj,noOfNodes));
		
	}
}
