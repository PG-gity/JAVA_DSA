package part_04_DSA_Advance_16_Graph;

import java.util.*;
sab galat hai
/*Kosaraju's Algorithm for Strongly Connected Components Using DFS
 * Idea: similar to topological sort
 */
public class Graph_10_KosarajuAlgorithm_01_StronglyConnectedComponents_UsingDFS {

	static void recDFS(ArrayList<ArrayList<Integer>> adjList,Stack<Integer> st, int vert, boolean[] visited) {
		
		visited[vert]=true;
		
		for(int adjVert:adjList.get(vert))
			if(visited[adjVert]==false)
				recDFS(adjList,st,adjVert,visited);
		
		st.push(vert);
		
	}
				//Strongly connected components
	static void kosarajuSSC(ArrayList<ArrayList<Integer>> adjList,int noOfV) {
		
		boolean visited[] = new boolean[noOfV];
		
		Stack<Integer> st = new Stack<>();
		
		for(int vert=0;vert<noOfV;vert++)
			if(visited[vert]==false)
				recDFS(adjList,st,vert,visited);
		
		while(st.isEmpty()==false) {
			
			System.out.println(st.pop()+" ");
		}
	}
	static void addEdge(ArrayList<ArrayList<Integer>> adjList,int u, int v) {
		
		adjList.get(u).add(v);

	}
	
	public static void main(String[] args) {
		
		int noOfVertices = 5; 
		
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(noOfVertices); 
		
		for (int i = 0; i < noOfVertices; i++) 
			adj.add(new ArrayList<Integer>()); 

		addEdge(adj,0, 1); 
        addEdge(adj,1, 2); 
        addEdge(adj,2, 0); 
        addEdge(adj,1, 3); 
        addEdge(adj,3, 4);
        
        kosarajuSSC(adj,noOfVertices);
	}
}
