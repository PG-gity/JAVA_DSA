package part_04_DSA_Advance_16_Graph;

import java.util.*;

public class Graph_04_DetectCycle_In_UndirectedGraph_UdingDFS {

	static boolean recursiveDFS(ArrayList<ArrayList<Integer>> adjList,int s,boolean visited[], int parent) {
		
		visited[s]=true;
		
		for(int vert: adjList.get(s)) {
			
			if(visited[vert]==false) {
				return recursiveDFS(adjList,vert,visited,s);
			}
			else if( vert != parent)// means visited[vert]=true(i.e. already visited) and again reaching over there so cyclic
				return true;
		}
		
		return false;
	}
	static boolean DFS(ArrayList<ArrayList<Integer>> adjList,int noOfV) {
		
		boolean visited[] = new boolean[noOfV];
		
		for(int i=0;i<noOfV;i++) {
			
			if(visited[i]==false)         // parent as -1
				return recursiveDFS(adjList,i,visited,-1);
		}
		
		return false;
	}
	
	static void addEdge(ArrayList<ArrayList<Integer>> adjList,int u, int v) {
		
		
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	
	public static void main(String[] args) {
		
		int noOfVertices = 6;
		
		ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(noOfVertices);
		
		for(int i=0; i< noOfVertices;i++)
			adjacencyList.add(new ArrayList<Integer>());
		
		addEdge(adjacencyList, 0,1);
		addEdge(adjacencyList, 1,2);
		addEdge(adjacencyList, 1,3);
		addEdge(adjacencyList, 2,3);
		addEdge(adjacencyList, 2,4);
		addEdge(adjacencyList, 4,5);
		
		System.out.println(DFS(adjacencyList,noOfVertices));
	}

}
