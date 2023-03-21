package graph;


public class Graph_L9_FloodFillAlgorithm {

	public static void dfsToFloodFill(int[][] grid,boolean[][] vis,int sr,int sc,int oC,int nC) {
		
		if(vis[sr][sc]==false && grid[sr][sc]==oC) {
			vis[sr][sc]=true;
			grid[sr][sc]=nC;
		}
		
		int[] delRow = {0,-1,0,+1};
		int[] delCol = {-1,0,+1,0};
		
		//you can calculate neighbor index in 2D array then check Or following approach will be ok
				//Or delCol
		for(int i=0;i<4;i++) {
			int nRow = sr + delRow[i];
			int nCol = sc + delCol[i];
			if((nRow>=0 
					&&  nRow < grid.length
					&& nCol  < grid.length 
					&& nCol>=0)
					
					&& vis[nRow][nCol] ==false 
					&& grid[nRow][nCol]==oC) {
				dfsToFloodFill(grid,vis,nRow,nCol,oC,nC);
			}
		}
		
	}
	public static void floodFill(int[][] grid,int sr,int sc,int newColor) {
		
		boolean[][] visited = new boolean[grid.length][grid[1].length];
		
		int oldColor = grid[sr][sc];
		
		for(int r=0;r<grid.length;r++)
			for(int c=0;c<grid[1].length;c++) {
				if(visited[r][c]==false && grid[r][c] == oldColor)
					dfsToFloodFill(grid,visited,r,c,oldColor,newColor);
			}
		
	}
	public static void main(String[] args) {
		
		int sizeOfMatrix=3;
		
		int[][] grid = new int[sizeOfMatrix][sizeOfMatrix];
		
		grid[0][0] = 1;
		grid[0][1] = 1;
		grid[0][2] = 1;
		grid[1][0] = 2;
		grid[1][1] = 2;
		grid[1][2] = 0;
		grid[2][0] = 2;
		grid[2][1] = 2;
		grid[2][2] = 2;
		
		for(int r=0;r<grid.length;r++) {
			for(int c=0;c<grid[1].length;c++)
				System.out.print(grid[r][c]+" ");
			System.out.println();
		}
		
		int sRow=2,sCol=0, newColor=4;
		
		floodFill(grid,sRow,sCol,newColor);
		
		System.out.println();
		for(int r=0;r<grid.length;r++) {
			for(int c=0;c<grid[1].length;c++)
				System.out.print(grid[r][c]+" ");
			System.out.println();
		}		
	}
}
