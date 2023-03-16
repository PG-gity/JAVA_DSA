package part_04_DSA_Advance_16_Graph;

import java.util.*;

/*Detect Cycle:Detect Cycle using Kahn's algorithms topological sorting BFS
 * Idea: If we'll go for topological sorting for cyclic graph, topological sort is not possible 
 * 		 since a cycle will make infinite loop dependency and sorted Vertices will be less then no of vertices. 
 * 		 	
 */
public class Graph_06_KahnAlgorithm_02_DetectCycle_UsingTopologicalSortingBFS {

	
	static boolean detectCycleKahnAlgo(ArrayList<ArrayList<Integer>> adjList,int noOfV) {
		
		int inDegrees[] = new int[noOfV];
		
		for(int v=0;v<noOfV;v++)
			for(int adjVert: adjList.get(v))
				inDegrees[adjVert]++;
		
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<noOfV;i++)
			if(inDegrees[i]==0)
				q.add(i);
		
		
		int noOfSortedElem=0;
		while(q.isEmpty()==false) {
			
			int u = q.poll();
			noOfSortedElem++;
			
			for(int x: adjList.get(u))
				if(--inDegrees[x]==0)
					q.add(x);
		}
		
		return (noOfSortedElem < noOfV);
	}
	
	static void addEdge(ArrayList<ArrayList<Integer>> adjList,int u, int v) {
		
		adjList.get(u).add(v);

	}
	public static void main(String[] args) {
		
		int noOfVertices = 5;
		
		ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(noOfVertices);
		
		for(int i=0; i< noOfVertices;i++)
			adjacencyList.add(new ArrayList<Integer>());
		
		addEdge(adjacencyList,0, 1); 
        addEdge(adjacencyList,4, 1); 
        addEdge(adjacencyList,1, 2); 
        addEdge(adjacencyList,2, 3); 
        addEdge(adjacencyList,3, 1);
		
        System.out.println(detectCycleKahnAlgo(adjacencyList,noOfVertices));
	}

}
