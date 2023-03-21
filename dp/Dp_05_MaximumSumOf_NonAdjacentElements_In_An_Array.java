package dp;

import java.util.*;

/*Problem Statements:
 * 
You are given an array/list of ‘N’ integers. 
You are supposed to return the maximum sum of the subsequence with
the constraint that no two elements are adjacent in the given array/list.

Note:

A subsequence of an array/list is obtained by deleting some number of elements(can be zero)
from the array/list, leaving the remaining elements in their original order.
Detailed explanation ( Input/output format. Notes. Constraints, Images ) v

Input Format:

The first line contains a single integer 'T’ denoting the number of test cases.
The first line of each test case contains a single integer 'N' denoting the number of elements
in the array.
The second line contains single space-separated integers denoting the elements of the
array/list.

Output Format:

For each test case
, print a single integer that denotes the maximum sum of the non-adjacent
elements.
Print the output of each test case in a separate line.
Note:
You do not need to print anything; it has already been taken care of. lust implement the given
function.

Sample Input 1:
2
3
1 2 4
4
2 1 4 9
Sample Output 1:
5
11

Sample Input 2:
2
5
1 2 3 5 4
9
1 2 3 1 3 5 8 1 9
Sample Output 2:
8
24
 * 
 */

public class Dp_05_MaximumSumOf_NonAdjacentElements_In_An_Array {

/*
//general Recursion : Having overlapping problems
	public static int subSeqAlterElemSum(int[] arr,int sum,int n) {
		
		if(n==0)
			return arr[0];

		if(n<0) {
			
			return 0;
		}
		
		
		
		int take = arr[n] + subSeqAlterElemSum(arr,sum,n-2);
		
		int notTake = 0 + subSeqAlterElemSum(arr,sum,n-1);
		
		
		return Math.max(take, notTake);
		
	}
*/	
	

/*	
//Memoization 	
	public static int subSeqAlterElemSum(int[] arr,int sum,int n,int[] dp) {
		
		//Base Case
		if(n==0)
			dp[0] = arr[0];

		if(n<0) {
			
			return 0;
		}
		
		//Stoping overlapping calls using dp array
		if(dp[n] != -1)
			return dp[n];
		
		int take = arr[n] + subSeqAlterElemSum(arr,sum,n-2,dp);
		
		int notTake = 0 + subSeqAlterElemSum(arr,sum,n-1,dp);
		
		System.out.println("Take : " +take+" NotTake : "+notTake);
		
		dp[n] = Math.max(take, notTake);
		
		return dp[n];
	}
*/	


/*	
//Tabulations	
	public static int subSeqAlterElemSum(int[] arr,int sum,int n,int[] dp) {
		
		dp[0] = arr[0];
		
		
		for(int i=1;i< dp.length;i++) {
			
			int take = arr[i] ;//+ dp[i-2];
			
			if(i>1)
				take += dp[i-2];
			
			int notTake = 0 + dp[i-1];
			
//			System.out.println("Take : " +take+" NotTake : "+notTake+" Max: "+Math.max(take, notTake));
			
			dp[i] = Math.max(take, notTake);
			
		}
		
		return dp[n];
	}
*/
	

//Tabulations: Further space optimization	
	public static int subSeqAlterElemSum(int[] arr,int sum,int n,int[] dp) {
		
		//  i-2,	i-1,	i
		// prev2 , prev1, curi
		
		int prev = arr[0];
		
		int prev2=0, curi=0;
		
		for(int i=1;i< dp.length;i++) {
			
			int take = arr[i] ;//+ dp[i-2];
			
			if(i>1)
				take += prev2;
			
			int notTake = 0 + prev;
			
//			System.out.println("Take : " +take+" NotTake : "+notTake+" Max: "+Math.max(take, notTake));
			
			curi = Math.max(take, notTake);
			
			prev2= prev;
			
			prev =curi;
			
		}
		
		return prev;
	}
	
				
	public static void main(String[] args) {
		
		
//		int[] arr = {1,2,3,5,4};
		
		
		int[] arr = {2,1,4,9};
//		int[] arr = {1,2,3,1,3,5,8,1,9};
		
		int[] dp = new int[arr.length];
		
		Arrays.fill(dp, -1);
		
		System.out.println(subSeqAlterElemSum(arr,0,arr.length-1,dp));
		
	}
}
