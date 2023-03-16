package part_04_DSA_Advance_16_Graph;

import java.util.*;

/*MindIT: Time: O(V+E) 
 * think why
 * p4_L16: 00:38:17
 */
public class Graph_02_BreadthFirstSearch_BFS_02_Disconnected_GraphTraversal {

	//we can call for every vertices for connected BFS
	static void disconnectedBFS(ArrayList<ArrayList<Integer>> adjList, int noOfVertices) {
		
		boolean[] visited= new boolean[noOfVertices];
		
		for(int i=0;i<noOfVertices;i++) {
			
			if(visited[i]==false)
				connectedBFS(adjList,noOfVertices,i,visited);
		}
	}
	
	//connected BFS function						//noOfVertices:no of vertices, s:Source
	static void connectedBFS(ArrayList<ArrayList<Integer>> adjList, int noOfVertices,int s, boolean[] visited) {
		
		visited[s]=true;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(s);
		while(q.isEmpty()==false) {
			
			int u = q.poll();
			System.out.print(u+" ");
						
						//traverse i'th(i.e. u'th) array list
			for(int vert: adjList.get(u)) {
				
				if(visited[vert]==false) {
					
					visited[vert]=true;
					q.add(vert);
					
				}
			}
		}
	}
	
	static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u,int v) {
		
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	
	
	public static void main(String[] args) {
		
		int noOfV = 7;
		
		ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(noOfV);
		
		
		for(int i=0; i< noOfV; i++)
			adjacencyList.add(new ArrayList<Integer>());
		
		//one connected 0 1 2 3
							
		addEdge(adjacencyList,0,1);
		addEdge(adjacencyList,0,2);
		addEdge(adjacencyList,1,3);
		
		//another 4 5 6
		addEdge(adjacencyList,4,5);
		addEdge(adjacencyList,5,6);
		
		
		disconnectedBFS(adjacencyList,noOfV);
		
	}

}
