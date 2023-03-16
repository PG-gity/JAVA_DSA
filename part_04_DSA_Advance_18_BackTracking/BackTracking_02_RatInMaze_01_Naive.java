package part_04_DSA_Advance_18_BackTracking;

public class BackTracking_02_RatInMaze_01_Naive {
	
	static int N;
	static boolean solveMaze(int[][] maze) {
		int[][] sol = new int[N][N];
	//int[][] sol = maze.clone();	
		
		if(solveMazeRec(maze,0,0,sol)==false) {
			System.out.println(":Solution Doesn't exists");
			return false;
		}
		printSol(sol);
		return true;
	}
	
	static boolean solveMazeRec(int[][] maze,int i,int j,int[][] sol) {
		
		//reached destination?
		if(i==N-1 && j==N-1 && maze[i][j]==1) {
			sol[i][j]=1;
			return true;
		}
		if(isSafe(maze,i,j)==false)
			return false;
		else {
			sol[i][j]=1;
			if(solveMazeRec(maze,i+1,j,sol))
				return true;
			if(solveMazeRec(maze,i,j+1,sol))
				return true;
		}
		sol[i][j]=0;
		
		return false;
	}
	static boolean isSafe(int[][] maze,int i,int j) {
		
		
		return (i<N && j<N && maze[i][j] ==1);
	}
	
	static void printSol(int[][] sol) {
		
		for(int i=0;i<sol.length;i++) {
			
			for(int j=0;j<sol.length;j++)
				System.out.print(" "+sol[i][j]+" ");
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, 
        				 { 1, 1, 0, 1 }, 
        				 { 0, 1, 0, 0 },
        				 { 1, 1, 1, 1 } };
        
        N=4;//actully (4,4):AsIndex: (3,3)
        	//But since square matrix so one size N will be sufficient
        
        
        solveMaze(maze);
	}

}
