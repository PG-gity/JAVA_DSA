package part_04_DSA_Advance_16_Graph;

import java.util.*;

/* Kahn's Algorithm Topological Sorting Using BFS
 * 
 */

public class Graph_06_KahnAlgorithm_01_TopologicalSortingUsingBFS {

	
	static void topologicalSortingBFS(ArrayList<ArrayList<Integer>> adjList, int noOfV) {
	
//To calculate In Degrees of every Vertices		
		int inDegrees[] = new int[noOfV];
		
		for(int vert=0; vert< noOfV;vert++) {
				//for every adjacent vertex present for vertex(vert) their will be a incoming 
			for(int adjVert: adjList.get(vert)) {
					inDegrees[adjVert]++;
			}
			
		}
		
//BFS for topological shorted print
		
		Queue<Integer> q = new LinkedList<>();
		
		//add vertices with 0 indegree to queue
		for(int i=0;i<noOfV;i++)
			if(inDegrees[i]==0)
				q.add(i);
		
		while(q.isEmpty()==false) {
			
			int u=q.poll();
			
			System.out.print(u+" ");
			
			for(int adjVert:adjList.get(u))
				if(--inDegrees[adjVert]==0)
					q.add(adjVert);
			
		}
		
	}
	static void addEdge(ArrayList<ArrayList<Integer>> adjList,int u, int v) {
		
		adjList.get(u).add(v);

	}
	
	
	public static void main(String[] args) {


		int noOfVertices = 5;
		
		ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(noOfVertices);
		
		for(int i=0; i< noOfVertices;i++)
			adjacencyList.add(new ArrayList<Integer>());
		
		addEdge(adjacencyList,0, 2); 
        addEdge(adjacencyList,0, 3); 
        addEdge(adjacencyList,1, 3); 
        addEdge(adjacencyList,1, 4); 
        addEdge(adjacencyList,2, 3);
        
        topologicalSortingBFS(adjacencyList,noOfVertices);
	}
}
