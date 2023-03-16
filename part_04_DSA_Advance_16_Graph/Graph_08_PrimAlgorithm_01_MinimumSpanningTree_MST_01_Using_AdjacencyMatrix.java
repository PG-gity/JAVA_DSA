package part_04_DSA_Advance_16_Graph;

import java.util.*;

public class Graph_08_PrimAlgorithm_01_MinimumSpanningTree_MST_01_Using_AdjacencyMatrix {

	//for better solution go with adjacency list, for key we can use minHeap
	static int primMST(int graph[][], int noOfV) {

		int sum=0;
		
		int key[] = new int[noOfV];
		
		Arrays.fill(key, Integer.MAX_VALUE);
		
		key[0]=0;
		
		boolean mstSet[] = new boolean[noOfV];
		
		for(int count=0;count<noOfV;count++) {
			
			//To get minimum key which is not included in MST set
			int u=-1;
			
			for(int i=0;i<noOfV;i++)
				if(mstSet[i]==false && (u == -1 || key[i]<key[u]))
					u=i;
				
			mstSet[u]=true;
			
			sum+=key[u];
			
			for(int v=0;v<noOfV;v++)
				if(mstSet[v]==false && graph[u][v] != 0)
					key[v] = Math.min(key[v], graph[u][v]);
			
		}
		
		return sum;
	}
	public static void main(String[] args) {
		int V=4;
		
		int graph[][] = new int[][] { { 0, 5, 8, 0}, 
									  { 5, 0, 10, 15 }, 
									  { 8, 10, 0, 20 }, 
									  { 0, 15, 20, 0 },};  

		System.out.print(primMST(graph,V));
	}
}
