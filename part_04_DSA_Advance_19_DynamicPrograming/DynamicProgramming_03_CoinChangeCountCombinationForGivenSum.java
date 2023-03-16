package part_04_DSA_Advance_19_DynamicPrograming;

/*Problem statement:
 * Given a value N, if we want to make change for N cents, 
 * and we have infinite supply of each of S = { S1, S2, .. , Sm} 
 * valued coins, how many ways can we make the change? 
 * The order of coins doesn't matter.
For example: for N = 4 and S = {1,2,3}, 
 * there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. 
 * So output should be 4. For N = 10 and S = {2, 5, 3, 6}, 
 * there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. 
 * So the output should be 5.
 */
public class DynamicProgramming_03_CoinChangeCountCombinationForGivenSum {

/*
	//find: no of ways can we make the change
									// n = coins.length
	static int getCount(int[] coins,int n,int sum) {
		
		// sum =0 their is a way to select no coins
		if(sum==0)
			return 1;
		
	    // If n is less than 0 then
	    // no solution exists
		if(n == 0)
			return 0;
		
		
	    // If there are no coins and 
	    // n is greater than 0, then
	    // no solution exist
		
		
		int res = getCount(coins, n-1,sum);
		if(sum>= coins[n-1])
			res +=getCount(coins,n,sum - coins[n-1]);
		
		return res;
	}
*/
	
	static int getCount(int[] coins,int n,int sum) {
	    int dp[][]= new int[sum+1][n+1];
	    
	    for(int i=0;i<=n;i++)
	    {
	        dp[0][i]=1;
	    }
	    
	    
	    for(int i=1;i<=sum;i++)
	    {
	        for(int j=1;j<=n;j++)
	        {
	            dp[i][j] = dp[i][j-1];
	            
	            if(coins[j-1]<=i)
	            dp[i][j]+=dp[i-coins[j-1]][j];
	        }
	    }
	    
	    return dp[sum][n];
	    
	}
	
	public static void main(String[] args) {
		
		int coins[] = {1,2,5};
		
		int n= coins.length;
		int sum =4;
		System.out.println(getCount(coins,n,sum));
	}
}
