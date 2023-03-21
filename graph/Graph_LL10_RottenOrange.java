package graph;

import java.util.*;

/*Problem Statement:
 * 0: Empty cell
 * 1: Fresh Orange
 * 2: Rotten Orange
 * 
 * Calculate time to rotten all oranges  
 * 
 */

class CordTimePair{
	
	int first;
	int secound;
	
	int time;
	
	CordTimePair(int f,int s,int t) {
		
		this.first=f;
		this.secound=s;
		this.time=t;
	}
}

public class Graph_LL10_RottenOrange {

	//BFS for each rotten orange
	public static int bfsRotten(int[][] box) {
		
		int[][] rotten = new int[box.length][box[0].length];
		
		Queue<CordTimePair> q = new LinkedList<CordTimePair>();
		int time=0;
		
		for(int sr=0;sr<box.length;sr++)
			for(int sc =0;sc <box[0].length;sc++)
				if(box[sr][sc]==2) {
					q.add(new CordTimePair(sr,sc,time));
					rotten[sr][sc]=2;
				}	
		
//		//Remove
//		System.out.println("noOfRotten time:"+time);
//		for(int i=0;i<box.length;i++) {
//			for(int j =0;j <box[0].length;j++) 
//				System.out.print(rotten[i][j]+" ");
//			System.out.println();	
//		}
		
		
	
		//changes in neighbor row index
		int[] delRowInd= {0,-1,0,1};
		int[] delColInd = {-1,0,1,0};
		
		while(q.isEmpty()==false) {
			
			int sr= q.peek().first;
			int sc=q.peek().secound;
			time =q.peek().time;
			
			
			q.remove();
			
			
			
			
			for(int i=0;i<4;i++) {
				
				int nR = sr+delRowInd[i];
				int nC = sc+delColInd[i];
				
				if(nR>=0 && nR <box.length
						 && nC>=0 && nC <box[0].length
						 && box[nR][nC]==1 && rotten[nR][nC] != 2
						) {
					
					q.add(new CordTimePair(nR,nC,time+1));
					rotten[nR][nC]=2;
					
				}
			}
			
//			//remove
//			System.out.println("noOfRotten time:"+time);
//			for(int i=0;i<box.length;i++) {
//				for(int j =0;j <box[0].length;j++) 
//					System.out.print(rotten[i][j]+" ");
//				System.out.println();	
//			}
			
			
			
		}
		
		return time;
		
	}

	public static void main(String[] args) {
		
		int boxSize = 3;
		
		int[][] box = new int[boxSize][boxSize];
		
		box[0][0] = 0;
		box[0][1] = 1;
		box[0][2] = 2;
		box[1][0] = 0;
		box[1][1] = 1;
		box[1][2] = 1;
		box[2][0] = 2;
		box[2][1] = 1;
		box[2][2] = 1;
		
//		box[0][0] = 1;
//		box[0][1] = 2;
//		box[0][2] = 1;
//		box[1][0] = 1;
//		box[1][1] = 1;
//		box[1][2] = 0;
//		box[2][0] = 0;
//		box[2][1] = 1;
//		box[2][2] = 1;
		
//		//Remove
//		for(int sr=0;sr<box.length;sr++) {
//			for(int sc =0;sc <box[0].length;sc++)
//				System.out.print(box[sr][sc]+" ");
//			System.out.println();
//		}	
		
		System.out.println("Time: "+bfsRotten(box));
		
		
	}	
}
