package dp;

import java.util.Arrays;

public class Dp_08_Grid_TotalUniquePath {

	/*
//General Recursion:	
	//But even without grid also we can solve this question
	//by using i and j only
	public static int noOfPaths(int[][] grid,int i,int j) {
		
		if(i==0 && j==0)
			return 1;
		if(i<0 || j<0)
			return 0;
		
		int up = noOfPaths(grid, i-1,j);
		int left = noOfPaths(grid,i,j-1);
		
		return left+up;
	
	}
*/

/*	
//dp : Memoization	
	public static int noOfPaths(int[][] grid,int i,int j,int[][] dp) {
		
		
		
		if(i==0 && j==0)
			return dp[i][j]=1;
		if(i<0 || j<0)
			return 0;
		
		if(dp[i][j] != -1)
			return dp[i][j];
		
		int up = noOfPaths(grid, i-1,j,dp);
		int left = noOfPaths(grid,i,j-1,dp);
		
		return dp[i][j] =left+up;
		
	}
	
*/	
	
//dp: Tabulation
	public static int noOfPaths(int[][] grid,int i,int j,int[][] dp) {
		
		
		
		for(int r=0;r<=i;r++)
			for(int c=0;c<=j;c++) {
				
//				System.out.println("r: "+r+" c: "+c);
				if(r==0 && c==0) {
					dp[r][c]=1;
					
					//very important to write continue
					//otherwise below statements will be executed and
					//dp[r][c] =0 will be assigned
					//because: up=0,left=0,r=0,c=0
					continue;
//				System.out.println("dp[r][c] :"+dp[r][c]);
				}	
				
				int up=0,left=0;
				
				if(r>0)
					up= dp[r-1][c];
				
				
				if(c>0)
					left = dp[r][c-1];
				
//				System.out.println("up: "+up+" left: "+left);
				
				dp[r][c] = up+left;
				
			}
		
//		for(int[] rows: dp) {
//			for(int elem:rows) 
//				System.out.print(elem+" ");
//			System.out.println();
//		}
		
		
		return dp[i][j];
		
	}
	public static void main(String[] args) {
		
		int m=3;
		int n=7;
		
		int[][] grid = new int[m][n];
		
		for(int[] rows: grid)
			Arrays.fill(rows, 0);
							
//General recursion:		
//		System.out.println(noOfPaths(grid,m-1,n-1));
		
//dp: Memoization
		
//		int[][] dp = new int[m][n];
//		
//		for(int[] rows: dp)
//			Arrays.fill(rows, -1);
//		
//		System.out.println(noOfPaths(grid,m-1,n-1,dp));
		
//dp: Tabulation
		int[][] dp = new int[m][n];
		
		
		System.out.println(noOfPaths(grid,m-1,n-1,dp));
		
//		for(int[] rows: dp)
//			for(int elem:rows)
//				System.out.println(elem);
		
	}

}
