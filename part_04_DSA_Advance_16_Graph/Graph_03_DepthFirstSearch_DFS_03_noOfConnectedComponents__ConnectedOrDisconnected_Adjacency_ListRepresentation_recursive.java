package part_04_DSA_Advance_16_Graph;

import java.util.*;

/* For connected graph DFS
 * 
 */
public class Graph_03_DepthFirstSearch_DFS_03_noOfConnectedComponents__ConnectedOrDisconnected_Adjacency_ListRepresentation_recursive {

	//to call and create visited using no of vertices
	static int DFS(ArrayList<ArrayList<Integer>> adjList, int s, int noOfV) {
										//we can remove source s also since every vertices will be called
		boolean visited[] = new boolean[noOfV];
		
		int count = 0;
		
		for(int i=0;i<noOfV;i++)
			if(visited[i]==false) {
				recursiveDFS(adjList,i,visited);
				count++;
			}
		
		return count;
	}
	//recursive function
	static void recursiveDFS(ArrayList<ArrayList<Integer>> adjList,int s, boolean visited[]) {
		
		visited[s]=true;
		
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
		
		// 0 1
		addEdge(adjacencyList,0,1);
		//2 3 4 
		addEdge(adjacencyList,2,3);
		addEdge(adjacencyList,2,4);

		
		int source =0;
		
		System.out.println(DFS(adjacencyList,source,noOfVertices));
	}
}
