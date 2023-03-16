package part_04_DSA_Advance_16_Graph;

import java.util.*;


public class Graph_05_DetectCycle_In_DirectedGraph_UdingDFS {

	static boolean recDFS(ArrayList<ArrayList<Integer>> adjList,int s,boolean visited[],boolean recStack[]) {
		
		visited[s]=true;
		
		//for path visited
		recStack[s]=true;
		
		//for every vertices of s
		for(int vert: adjList.get(s)) {
			
			if(visited[vert]==false) {
				if(recDFS(adjList,vert,visited,recStack)==true)
					return true;
			}
			//for visited = true and path visited also true means a cycle
			else if(recStack[vert]==true)
				return true;
		}
		
		recStack[s]=false;
		
		return false;
	}
	static boolean detectCycleDFS(ArrayList<ArrayList<Integer>> adjList, int noOfV) {
		
		boolean visited[] = new boolean[noOfV];
		
		//for path visited
		boolean recStack[] = new boolean[noOfV];
		
		
		for(int i=0;i<noOfV;i++)
			if(visited[i]==false)
				if(recDFS(adjList,i,visited,recStack)==true)//we can put only recDFS (without ==true) 
					return true;							//since reDFS will also return true false directly but this is for readability
					

			
		return false;	
	}
	
	
	static void addEdge(ArrayList<ArrayList<Integer>> adjList,int u, int v) {
		
		
		adjList.get(u).add(v);
	}

	//try to print graph
	static void pringGraph(ArrayList<ArrayList<Integer>> adjList, int noOfV) {
		
		
	}
	public static void main(String[] args) {
		int noOfVertices = 6;
		
		ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(noOfVertices);
		
		for(int i=0; i< noOfVertices;i++)
			adjacencyList.add(new ArrayList<Integer>());
		
		//0 -> 1 <- 2 -> 3 -> 4-> 5 -> 3
		addEdge(adjacencyList, 0,1);
		addEdge(adjacencyList, 2,1);
		addEdge(adjacencyList, 2,3);
		addEdge(adjacencyList, 3,4);
		addEdge(adjacencyList, 4,5);
		addEdge(adjacencyList, 5,3);
		
		System.out.println(detectCycleDFS(adjacencyList,noOfVertices));
	}
}
