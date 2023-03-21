package graph;

/*Problem statement: 
 * BFS traversal using Adjacency matrix in undirected graph
 * 
 */
public class Graph_L5_BFS_Traversal_Connected_02_Using_AdjacencyMatrix {
not working complete it
	public static void bfsTraversal(int[][] adj) {
		
	}
	
	public static void addEdge(int[][] adj,int row,int column) {
		
		adj[row][column] = 1;
		adj[column][row] = 1;
		
	}
	public static void main(String[] args) {
		
		int noOfVertices=9;
		
		int[][] adj = new int[noOfVertices+1][noOfVertices+1];
		
		addEdge(adj,1,2);
		addEdge(adj,1,6);
		addEdge(adj,2,3);
		addEdge(adj,2,4);
		addEdge(adj,4,5);
		addEdge(adj,5,8);
		addEdge(adj,6,7);
		addEdge(adj,6,9);
		addEdge(adj,7,8);
		
		for(int i=0;i<adj[i].length;i++) {
			for(int j=0;j<adj.length;j++)
				System.out.print(adj[i][j]+" ");
			System.out.println();
		}
	}
}
