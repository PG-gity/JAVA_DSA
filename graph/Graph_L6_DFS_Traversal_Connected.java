package graph;

import java.util.*;
public class Graph_L6_DFS_Traversal_Connected {

	public static ArrayList<Integer> dfsEveryNode(ArrayList<ArrayList<Integer>> adj,int s,int n) {
		
		ArrayList<Integer> dfsL = new ArrayList<Integer>();
		boolean[] visited = new boolean[n];
		
		//run below line for noOfNodes time In 
		//disconnected graph to calculate no of islands 
		dfsOfConnected(adj,dfsL,visited,s);
		
		return dfsL;
	}
	public static ArrayList<Integer> dfsOfConnected(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> dfsList,boolean[] vis,int s){
		
		 
		if(vis[s] ==false) {
			vis[s] = true;
			dfsList.add(s);
		}
		
		
		
		for(Integer it: adj.get(s)) 
			if(vis[it]==false) 
				dfsOfConnected(adj,dfsList,vis,it);
			
		
		return dfsList;
	}
	public static void addEdge(ArrayList<ArrayList<Integer>> adj,Integer u,Integer v) {
		
		adj.get(u).add(v);
		adj.get(v).add(u);
		
	}
	public static void main(String[] args) {
		
		// noOfNodes are 8 but it,s 1 indexing (starting from 1) so 8+1=9
		int noOfNodes = 9;
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<noOfNodes;i++)
			adjList.add(new ArrayList<Integer>());
		
		addEdge(adjList,1,2);
		addEdge(adjList,1,3);
		addEdge(adjList,2,5);
		addEdge(adjList,2,6);
		addEdge(adjList,3,4);
		addEdge(adjList,4,8);
		addEdge(adjList,8,7);
		addEdge(adjList,7,3);
		
		
		int source = 1;
		
		
		System.out.println(dfsEveryNode(adjList,source,noOfNodes));
		
		
	}
}
