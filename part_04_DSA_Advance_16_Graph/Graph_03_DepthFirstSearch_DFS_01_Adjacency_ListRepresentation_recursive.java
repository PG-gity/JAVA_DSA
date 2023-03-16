package part_04_DSA_Advance_16_Graph;

import java.util.*;

/* For connected graph DFS
 * 
 */
public class Graph_03_DepthFirstSearch_DFS_01_Adjacency_ListRepresentation_recursive {

	//to call and create visited using no of vertices
	static void DFS(ArrayList<ArrayList<Integer>> adjList, int s, int noOfV) {
		
		boolean visited[] = new boolean[noOfV];
		
		recursiveDFS(adjList,s,visited);
		
	}
	//recursive function
	static void recursiveDFS(ArrayList<ArrayList<Integer>> adjList,int s, boolean visited[]) {
		
		visited[s]=true;
		
		System.out.print(s+" ");
		
		for(int vert: adjList.get(s))
			if(visited[vert]==false)
				recursiveDFS(adjList,vert,visited);
		
	}
	
	static void addEdge(ArrayList<ArrayList<Integer>> adjList,int u, int v) {
		
		
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	
	
	public static void main(String[] args) {
		
		int noOfVertices=5;
		
		ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(noOfVertices);
		
		for(int i=0; i< noOfVertices;i++)
			adjacencyList.add(new ArrayList<Integer>());
		
		
		addEdge(adjacencyList,0,1);
		addEdge(adjacencyList,0,2);
		addEdge(adjacencyList,1,3);
		addEdge(adjacencyList,1,4);
		addEdge(adjacencyList,2,3);
		addEdge(adjacencyList,3,4);
		
		int source =0;
		
		DFS(adjacencyList,source,noOfVertices);
	}
}
