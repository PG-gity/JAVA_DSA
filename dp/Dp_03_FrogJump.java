package dp;

import java.util.Arrays;

/*PROBLEM STATEMENT:
There is a frog on the '1st' step of 
an 'N' stairs long staircase. The frog 
wants to reach the 'Nth' stair. 'HEIGHT[i]' 
is the height of the '(i+1)th' stair.If Frog 
jumps from 'ith' to 'jth' stair, the energy 
lost in the jump is given by absolute value 
of ( HEIGHT[i-1] - HEIGHT[j-1] ). If the Frog is 
on 'ith' staircase, he can jump either to '(i+1)th' 
stair or to '(i+2)th' stair. Your task is to find the 
minimum total energy used by the frog to reach from 
'1st' stair to 'Nth' stair.

For Example:
If the given ‘HEIGHT’ array is [10,20,30,10],
 the answer 20 as the frog can jump from 1st stair 
 to 2nd stair (|20-10| = 10 energy lost) and then a 
 jump from 2nd stair to last stair 
 (|10-20| = 10 energy lost). So, the total energy lost is 20.

Input Format:
The first line of the input contains an
 integer, 'T,’ denoting the number of test cases.

The first line of each test case contains a 
single integer,' N’, denoting the number of stairs in the staircase,

The next line contains ‘HEIGHT’ array.
Output Format:
For each test case, return an integer 
corresponding to the minimum energy lost to reach the last stair.
Note:
You do not need to print anything. 
It has already been taken care of. Just implement the given function.

Constraints:
1 <= T <= 10
1 <= N <= 100000.
1 <= HEIGHTS[i] <= 1000 .


 * 
 */

public class Dp_03_FrogJump {
	
/*
//General Recursion	
	public static int minEnergy(int[] h,int n) {
		
		if(n==0)
			return 0;
		
		int oneStepEng = minEnergy(h,n-1) + Math.abs(h[n]-h[n-1]);
		
		int twoStepEng=Integer.MAX_VALUE;
		
		if(n>1)
			twoStepEng = minEnergy(h,n-2) + Math.abs(h[n]-h[n-2]);
		
		return Math.min(oneStepEng, twoStepEng);
	}
	
*/
	
/*	
//Memorization or memoization :: Top- Down (n to base case)
	public static int minEnergy(int[] h,int n,int[] dp) {
		
		if(dp[n] != -1)
			return dp[n];
		
		
		if(n==0)
			return 0;
		
		int oneStepEng = minEnergy(h,n-1,dp) + Math.abs(h[n]-h[n-1]);
		
		int twoStepEng=Integer.MAX_VALUE;
		
		if(n>1)
			twoStepEng = minEnergy(h,n-2,dp) + Math.abs(h[n]-h[n-2]);
		
		dp[n] =  Math.min(oneStepEng, twoStepEng);
		
		return dp[n];
	}	

*/

//Tabulation method :: Bottom-Up ( Base case to n)
	public static int minEnergy(int[] h,int n,int[] dp) {
		
		dp[0] = 0;
		
		for(int i =1 ; i<dp.length;i++) {
			
			int oneStepEng = dp[i-1] + Math.abs(h[i] - h[i-1]);
			
			int twoStepEng = Integer.MAX_VALUE;
			
			if(i>1)
				twoStepEng = dp[i-2] + Math.abs(h[i]- h[i-2]);
			
			dp[i] = Math.min(oneStepEng, twoStepEng);
			
		}
		
		
		return dp[n];
	}	
	
	public static void main(String[] args) {
		
//		int[] Height = {10,20,30,10};
		int[] Height = {30,10,60,10,60,50};
		
		int[] dp = new int[Height.length];
		
		Arrays.fill(dp, -1);
		
		 System.out.println(minEnergy(Height,Height.length-1,dp));
	
	}
}
