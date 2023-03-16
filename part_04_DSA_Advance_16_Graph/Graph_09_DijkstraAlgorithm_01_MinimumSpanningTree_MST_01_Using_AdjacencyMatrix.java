package part_04_DSA_Advance_16_Graph;

import java.util.Arrays;
import java.util.Collections;

public class Graph_09_DijkstraAlgorithm_01_MinimumSpanningTree_MST_01_Using_AdjacencyMatrix {

	
	static int[] dijkastraMST(int graph[][], int src) {
		
		int noOfV = graph.length;
		
		int dis[] = new int[noOfV];
		
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		dis[src]=0;
		
		//minimum distance path
		boolean mstDistConsidered[] = new boolean[noOfV];
		
		for(int count=0; count<noOfV-1;count++) {
			
			int u=-1;
			
			for(int i=0;i<noOfV;i++)
				if(mstDistConsidered[i]==false && (u==-1 || dis[i]<dis[u]))
					u=i;
			
			mstDistConsidered[u]=true;
			
			for(int v=0;v<noOfV;v++) {
				if(mstDistConsidered[v]==false && graph[u][v] != 0)
					dis[v] = Math.min(dis[v], dis[u]+graph[u][v]);
			}
		}
		return dis;
	}
	public static void main(String[] args) {
		
		int graph[][] = new int[][] { { 0, 50, 100, 0}, 
									  { 50, 0, 30, 200 }, 
									  { 100, 30, 0, 20 }, 
									  { 0, 200, 20, 0 },};  

		int source=0;							  
		
		int[] ans = dijkastraMST(graph,source);
		for(int i:ans)
			System.out.println(i);
		
	}

}
