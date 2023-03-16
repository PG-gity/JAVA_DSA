package part_04_DSA_Advance_16_Graph;

import java.util.*;

public class Graph_06_KahnAlgorithm_03_TopologicalSortingUsingDFS {

	static void sortDFS(ArrayList<ArrayList<Integer>> adjList,Stack<Integer> st,int vert,boolean []visited){
		
		visited[vert]=true;
		
		for(int adjVert: adjList.get(vert))
			if(visited[adjVert]==false)
				sortDFS(adjList,st,adjVert,visited);
		
		st.push(vert);
	}
	static void topologicalSort(ArrayList<ArrayList<Integer>> adjList,int noOfV) {
		
		boolean []visited = new boolean[noOfV];
		
		Stack<Integer> st = new Stack<>();
		
		//call every not visited vertex for sortDFS
		for(int vert=0;vert<noOfV; vert++)
			if(visited[vert]==false)
				sortDFS(adjList,st,vert,visited);

		while(st.isEmpty()==false)
			System.out.print(st.pop()+" ");
		
		
	}
	static void addEdge(ArrayList<ArrayList<Integer>> adjList,int u, int v) {
		
		adjList.get(u).add(v);

	}
	
	public static void main(String[] args) {
		
//		int noOfVertices = 5; 
		
		int noOfVertices = 6; 
		
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(noOfVertices); 
		
		for (int i = 0; i < noOfVertices; i++) 
			adj.add(new ArrayList<Integer>()); 

//			  addEdge(adj,0, 1); 
//            addEdge(adj,1, 3); 
//            addEdge(adj,2, 3); 
//            addEdge(adj,3, 4); 
//            addEdge(adj,2, 4);
		addEdge(adj,5, 0); 
        addEdge(adj,4, 0); 
        addEdge(adj,4, 1); 
        addEdge(adj,5, 2); 
        addEdge(adj,2, 3);
        addEdge(adj,3, 1);
            
            topologicalSort(adj,noOfVertices);
	}

}
