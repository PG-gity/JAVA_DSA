package part_04_DSA_Advance_16_Graph;

import java.util.*;

public class Graph_02_BreadthFirstSearch_BFS_03_noOfConnectedComponents_Or_NoOfConnected_IsLand {

			//Same as Disconnected we'll call for every vertices
	static int countConnectedBFS(ArrayList<ArrayList<Integer>> adjList, int noOfV) {
		
		int count=0;
		boolean visited[] = new boolean[noOfV];
		
		for(int i=0;i < noOfV; i++) {
			
			if(visited[i]==false) {
				
				connectedBFS(adjList,i,visited);
	
				count++;
			}
		}
		
		return count;
	}
	
	static void connectedBFS(ArrayList<ArrayList<Integer>> adjList, int s, boolean[] visited) {
		
		visited[s]=true;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(s);
		
		while(q.isEmpty()==false) {
			
			int u = q.poll();
			System.out.print(u+" ");
			
			for(int vert: adjList.get(u)) {
				
				if(visited[vert]==false) {
					visited[vert] =true;
					q.add(vert);
				}
			}
			
		}
		
	}
	
	
	static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
		
		adjList.get(u).add(v);
		adjList.get(v).add(u);
		
	}
	
	public static void main(String[] args) {
		
		int noOfV=9;
		
		ArrayList<ArrayList<Integer>> adjcanceyList = new ArrayList<ArrayList<Integer>>(noOfV);
		
		for(int i=0;i<noOfV; i++)
			adjcanceyList.add(new ArrayList<Integer>());
		
						  
		addEdge(adjcanceyList,0,1);
		addEdge(adjcanceyList,0,2);
		addEdge(adjcanceyList,1,2);
		
		addEdge(adjcanceyList,3,4);
		
		addEdge(adjcanceyList,5,6);
		addEdge(adjcanceyList,5,7);
		addEdge(adjcanceyList,7,8);
		
		System.out.println("\nCount: "+countConnectedBFS(adjcanceyList,noOfV));
		
	}

}
