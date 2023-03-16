package part_04_DSA_Advance_19_DynamicPrograming;

import java.util.Arrays;

//longest common subsequence of two strings
public class DynamicProgramming_02_LongestCommonSubsequance_Memoization {

/*Basic Solution:
	static int lcs(String s1,String s2,int m,int n) {

		//base condition
		if(n==0 || m==0)
			return 0;
		
		if(s1.charAt(m-1) == s2.charAt(n-1)) {
			
			return 1+lcs(s1,s2,m-1,n-1);
		}
		
		return (Math.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1)));
		
	}
*/	
//DynamicPrograming Solution for longest common subsequence of two strings
	
	static int memo[][];
	static int lcs(String s1,String s2,int m,int n) {
		
		if(memo[m][n] != -1)
			return memo[m][n];
		
		//base condition
		if(m==0 || n==0) {
			memo[m][n]=0;
			
		}else if(s1.charAt(m-1)==s2.charAt(n-1)) {
			
			memo[m][n]= 1+lcs(s1,s2,m-1,n-1);
		} else {
			memo[m][n]= Math.max(lcs(s1,s2,m-1,n), lcs(s1,s2,m,n-1));
		}
		
		return memo[m][n];
	}
	
	public static void main(String[] args) {
		
		String s1="AXYZ";
		String s2 = "BAZ";
		
		memo = new int[s1.length()+1][s2.length()+1];
		
		
		for(int i[]:memo) {
			Arrays.fill(i, -1);
		}
		
		System.out.println(lcs(s1,s2,s1.length(),s2.length()));
	}
}
