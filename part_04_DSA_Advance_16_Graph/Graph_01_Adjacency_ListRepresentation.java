package part_04_DSA_Advance_16_Graph;

import java.util.*;

public class Graph_01_Adjacency_ListRepresentation {

	//Add Edge fun
	static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
		
		
		adjList.get(u).add(v);
		
		//Remove below line for directed graph
		adjList.get(v).add(u);
	}
	
	//Print Graph fun
	static void printGraph(ArrayList<ArrayList<Integer>> adjList) {
		
		for(int i=0; i < adjList.size(); i++) {
			
			//For index of array list
//			System.out.print(i+" ");
			
			for(int j=0; j<adjList.get(i).size(); j++) {
				
				System.out.print(adjList.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		int noOfVertices = 4;
		
		ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(noOfVertices);
		
		//Add array list at each i'th index
		for(int i=0; i<noOfVertices; i++)
			adjacencyList.add(new ArrayList<Integer>());
		
		addEdge(adjacencyList, 0,1);
		addEdge(adjacencyList, 0,2);
		addEdge(adjacencyList, 1,2);
		addEdge(adjacencyList, 1,3);

		printGraph(adjacencyList);
	}

}
