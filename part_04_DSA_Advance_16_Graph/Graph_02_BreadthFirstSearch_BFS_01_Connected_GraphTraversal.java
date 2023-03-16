package part_04_DSA_Advance_16_Graph;

import java.util.*;

public class Graph_02_BreadthFirstSearch_BFS_01_Connected_GraphTraversal {

	
												//noOfV:no of vertices, s:Source //for disconnected BFS we'll also pass boolean visited[] 
	static void connectedBFS(ArrayList<ArrayList<Integer>> adjList, int noOfV, int s) {
	
										
		boolean[] visited = new boolean[noOfV];
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		visited[s]=true;
		
		q.add(s);
	
		while(q.isEmpty()==false) {
		
			int u = q.poll();
			System.out.print(u+" ");
		
			//traversal of i'th array list
			for(int vert: adjList.get(u)) {
			
				if(visited[vert]==false) {
				
					visited[vert] = true;
					q.add(vert);
				}
			}
		}
	}

	//Add Edge											vertices u , v 
	static void addEdge(ArrayList<ArrayList<Integer>> adjList,int u, int v) {
		
		
		
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}	
	
	public static void main(String[] args) {
		
		int noOfV=5;
		
		ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(noOfV);
		
		for(int i=0; i< noOfV; i++)
			adjacencyList.add(new ArrayList<Integer>());
		
							
		addEdge(adjacencyList,0,1);
		addEdge(adjacencyList,0,2);
		addEdge(adjacencyList,1,2);
		addEdge(adjacencyList,1,3);
		addEdge(adjacencyList,2,3);
		addEdge(adjacencyList,2,4);
		addEdge(adjacencyList,3,4);
		
		connectedBFS(adjacencyList,noOfV,0);
		
	}

}
