package graph;

/*Problem statements:
 *  0 : water; 1: Land
 *  Find no of Islands using given below data
 *  
 *  	0 1 1 0
 *  	0 1 1 0
 *  	0 0 1 0
 *  	0 0 0 0
 *  	1 1 0 1
 */

import java.util.*;

//Pair class to store pair of row and column
class Pair{
	
	int first;
	int secound;
	public Pair(int f,int s) {
		this.first=f;
		this.secound=s;
	}
}

public class Graph_L8_NumbersOfIslands {
	
/*Try to solve using DFS as well

 */
	//Using BFS to traverse through landMap to mark all connected land visited
	public static void bfsOfMap(int[][] landMap,boolean[][] visited,int sRow,int sColumn) {
		
		Queue<Pair> q = new LinkedList<Pair>();
		
		
		visited[sRow][sColumn]=true;
		q.add(new Pair(sRow,sColumn));
		
		
		while(q.isEmpty()==false) {
			
			sRow=q.peek().first;
			sColumn = q.peek().secound;
			q.remove();
			
			//To check if neighbor is land
			for(int i=-1;i<=1;i++)
				for(int j=-1;j<=1;j++) {
					
					//To calculate neighbor row and column 
					int nRow= sRow + i;
					int nColumn = sColumn +j;
					//To handle corner cases put boundary condition
					//(e.g.: like if(sRow,sColumn) at (0,0) then (-1,-1) IndexOutOfBound error)
					//Also to get no Of columns taking length of first row i.e.: landMap[1].length
					if( (nRow >=0 && nColumn >=0 	
							&& nRow <landMap.length && nColumn < landMap[1].length) 
							
							&& landMap[nRow][nColumn]==1 
							&& visited[nRow][nColumn] ==false) {
						
						visited[nRow][nColumn] = true;
						
						q.add(new Pair(nRow,nColumn));
						
					}
				}
		}		
		
		
		
	}
	public static int noOfIslands(int[][] landMap,int rows,int columns) {
		
		int countIsland=0;
		boolean visited[][] = new boolean[rows][columns];
		
		
		for(int i = 0; i< rows;i++) {
			for(int j=0;j<columns;j++) {
				if(visited[i][j]==false && landMap[i][j]==1) {
					
					bfsOfMap(landMap,visited,i,j);
					countIsland++;
					
				}
			}
		}	
		
		
		return countIsland;
	}
	public static void main(String[] args) {
		
		int noOfRows=5;
		int noOfColumn=4;
		
		int[][] landMap  = new int[noOfRows][noOfColumn];
		
		landMap[0][1] = 1;
		landMap[0][2] = 1;
		landMap[1][1] = 1;
		landMap[1][2] = 1;
		landMap[2][2] = 1;
		
		landMap[4][0] = 1;
		landMap[4][1] = 1;
		
		landMap[4][3] = 1;
		
		System.out.println(noOfIslands(landMap,noOfRows,noOfColumn));
//		
		for(int i=0;i<landMap.length;i++) {
			for(int j=0;j<landMap[i].length;j++) 
				System.out.print(landMap[i][j]+" ");
			
			System.out.println();
		}
		
//		System.out.println(landMap[1].length);
//		System.out.println(landMap.length);
		
	}
}
