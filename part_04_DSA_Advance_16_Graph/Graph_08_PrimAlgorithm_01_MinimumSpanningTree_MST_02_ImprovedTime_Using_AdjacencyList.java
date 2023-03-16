package part_04_DSA_Advance_16_Graph;

import java.util.*;

/* Prim's algorithm for minimum spanning tree (MST) to calculate path sum of MST
 */

//Helper Class for key value pair
class Pair{
	
	int key;//node or Vertices
	int value;//weight or distance
	public Pair(int key,int value) {
		this.key=key;
		this.value=value;
	}
	
}
public class Graph_08_PrimAlgorithm_01_MinimumSpanningTree_MST_02_ImprovedTime_Using_AdjacencyList {

	static int minimumSpanningTree(ArrayList<ArrayList<ArrayList<Integer>>> adjList,int noOfV) {
		
		//In java PriorityQueue implements minHeap by default 
		PriorityQueue<Pair> pq= new PriorityQueue<Pair>((x,y)->x.value-y.value);
		
		boolean[] visited= new boolean[noOfV];
		
		//starting point or source
					//key,value
		pq.add(new Pair(0,0));
		
		int sum=0;
		
		while(pq.isEmpty()==false) {
			
			int key=pq.peek().key;
			int val=pq.peek().value;
			
			pq.remove();
			
			if(visited[key]== true)
				continue;
			
			visited[key]= true;
			
			sum+=val;
			
			for(int i=0; i <adjList.get(key).size();i++) {
				
				int edgeValue = adjList.get(key).get(i).get(1);
				int adjKey = adjList.get(key).get(i).get(0);
				
				if(visited[edgeValue]==false)
					pq.add(new Pair(adjKey,edgeValue));
				
			}
			
		}
		return sum;
	}
	
//modify it getting IndexOutOFBound error during running
	static void addEdge(ArrayList<ArrayList<ArrayList<Integer>>> adjList,int u, int v,int w) {
		
		adjList.get(u).get(v);
		adjList.get(u).get(v).add(w);
		adjList.get(v).get(u);
		adjList.get(v).get(u).add(w);
		
	}
	public static void main(String[] args) {
		
		int noOfV=5;
		
		ArrayList<ArrayList<ArrayList<Integer>>> adjList = new ArrayList<ArrayList<ArrayList<Integer>>>(noOfV);
		
		
		for(int i=0;i<noOfV;i++)
			adjList.add(new ArrayList<ArrayList<Integer>>());
		
		for(int i=0;i<noOfV;i++)
			adjList.get(i).add(new ArrayList<Integer>());
		
		
		addEdge(adjList,0,1,5);
		addEdge(adjList,0,2,8);
		addEdge(adjList,1,2,10);
		addEdge(adjList,1,3,15);
		addEdge(adjList,2,3,20);
		
	}
}
