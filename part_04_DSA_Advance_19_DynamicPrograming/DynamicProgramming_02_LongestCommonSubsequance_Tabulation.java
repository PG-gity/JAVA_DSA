package part_04_DSA_Advance_19_DynamicPrograming;

public class DynamicProgramming_02_LongestCommonSubsequance_Tabulation {   
	
	static int lcs(String s1,String s2) {
		
		int m=s1.length();
		int n= s2.length();
							//mind it s1.length()+1: +1 since
		int dp[][] = new int[m+1][n+1];
			
		for(int i=1;i <= m;i++){
			for(int j=1;j <= n;j++) {
				
				if(s1.charAt(i-1)==s2.charAt(j-1)) 
					dp[i][j] = 1+dp[i-1][j-1];
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				
			}
		}
		
//		for(int i=0;i <= m;i++) {
//			for(int j=0;j <= n;j++) 
//				System.out.print(" "+dp[i][j]+" ");
//			System.out.println();
//		}
		
		return dp[m][n];
	}

	public static void main(String[] args) {
		
		String s1="AXYZ", s2="BAZ";
		
		  
		   System.out.println(lcs(s1,s2));
		
	}
}
