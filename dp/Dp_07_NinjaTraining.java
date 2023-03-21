package dp;

import java.util.Arrays;

public class Dp_07_NinjaTraining {

/*	
//General Recursion	
	public static int maxPoint(int[][] allPoints,int d,int last) {
		
		if(d==0) {
			int dayMax=0;
			
			//Checking for max value for 0 day
			for(int i=0;i<3;i++) {
				if( i != last) {
					dayMax = Math.max(dayMax, allPoints[d][i]);
				}
			}
			return dayMax;
		}
		
		int dayMax = 0;
		
		for(int i=0;i<3;i++) {
			if(i != last) {
				
				int activity =  allPoints[d][i] + maxPoint(allPoints,d-1,i); 
				
				dayMax = Math.max(dayMax, activity);
			}	
		}
		
		return dayMax;
		
	}
*/

/*	
//DP : Memorization	
	public static int maxPoint(int[][] allPoints,int d,int last,int[][] dp) {
		
		if(dp[d][last] != -1)
			return dp[d][last];
		
		
		if(d==0) {
			int dayMax=0;
			
			//Checking for max value for 0 day
			for(int i=0;i<3;i++) {
				if( i != last) {
					dayMax = Math.max(dayMax, allPoints[d][i]);
				}
			}
			return dp[d][last]= dayMax;
		}
		
		int dayMax = 0;
		
		for(int i=0;i<3;i++) {
			if(i != last) {
				
				int activity =  allPoints[d][i] + maxPoint(allPoints,d-1,i,dp); 
				
				dayMax = Math.max(dayMax, activity);
			}	
		}
		
		return dp[d][last] = dayMax;
		
	}	
*/

/*
//DP : Tabulation	
		public static int maxPoint(int[][] allPoints,int d) {
		
			int[][] dp = new int[d+1][4];
			
			dp[0][0] = Math.max(allPoints[0][1], allPoints[0][2]);
			dp[0][1] = Math.max(allPoints[0][0], allPoints[0][2]);
			dp[0][2] = Math.max(allPoints[0][0], allPoints[0][1]);
			
//			dp[0][3] = Math.max(allPoints[0][0], Math.max(allPoints[0][1], allPoints[0][2]));
			
			for(int day = 1; day<=d; day++) {
				for(int last = 0; last < 4;last++) {
					
					dp[day][last] =0;
					
					for(int task = 0; task < 3; task++) {
						
						if(task != last) {
							
							
							int activity = dp[day-1][task] + allPoints[day][task];
							
							dp[day][last]  = Math.max(activity, dp[day][last]);
						}
					}
				}
			}
			
			return dp[d][3];
			
		}
*/		

//DP : Tabulation: Further space optimization
	public static int maxPoint(int[][] allPoints,int d) {
			
			int[] dp = new int[4];
			
			dp[0] = Math.max(allPoints[0][1], allPoints[0][2]);
			dp[1] = Math.max(allPoints[0][0], allPoints[0][2]);
			dp[2] = Math.max(allPoints[0][0], allPoints[0][1]);
			
//			dp[0][3] = Math.max(allPoints[0][0], Math.max(allPoints[0][1], allPoints[0][2]));
			
			for(int day = 1; day<=d; day++) {
				int[] dpTemp = new int[4];
				
				for(int last = 0; last < 4;last++) {
					
					dpTemp[last] = 0;
					
					for(int task = 0; task < 3; task++) {
						
						if(task != last) {
							
							
							dpTemp[day]  = Math.max(dp[task] + allPoints[day][task], dp[task]);
							
							
						}
					}
				}
				dp= dpTemp;
			}
			
			return dp[d-1];
			
	}	
		
	
	public static void main(String[] args) {
		
		
		
//		int[][] allPoints= {{1,2,5},
//				   			{3,1,1},
//				   			{3,3,3}};
		
		int[][] allPoints= {{10,40,70},
	   						{20,50,80},
	   						{30,60,90}};
		
		//No Of Days 0 based indexing 2 for 3 days
		int n = 3 ;
		
//General Recursion:
		//Passing last day as -1 that will not match with any dayMaxValue
		
//		System.out.println(maxPoint(allPoints,n,-1));
		
		
//dp: Memorization :
								//making dp[][4] : 4 since last is passed as 3 so for array size 4 index 3 exists
//		int[][] dp = new int[allPoints.length][allPoints[0].length+1];
//		
//		// How to fill 2D Array with a value		
//		for(int[] arr : dp)
//			Arrays.fill(arr, -1);
//								  //passing last =3 (
//		System.out.println(maxPoint(allPoints,n-1,3,dp));
		
////dp: Tabulation
		
		
		
		System.out.println(maxPoint(allPoints,n-1));
//		
	}

	
}
