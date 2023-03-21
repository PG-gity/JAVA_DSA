package dp;



public class Dp_02_Fibonacci_ClimbingStairs {
	
	
	public static int findWays(int n) {
		
		if(n<=2)
			return n;
		
		
		return findWays(n-1)+findWays(n-2);
		
	}
	public static void main(String[] args) {
		
		int n=4;
		
		int noOfStairs = n;
		
		System.out.println(findWays(noOfStairs));
		
	}

}

/*Another solutions:

//		 Solution 1: Brute-Force Approach
//		
//		Base cases:
//		if n == 0, then the number of ways should be zero.
//		if n == 1, then there is only one way to climb the stair.
//		if n == 2, then there are two ways to climb the stairs. One solution is one step by another; the other one is two steps at one time.
//		
//		We can reach ith step in one of the two ways:
//		Taking a single step from (i - 1)th step
//		Taking a step of two from (i - 2)th step.
//		So, the total number of ways to reach ith step is equal to sum of ways of reaching (i - 1)th step and ways of reaching (i - 2)th step.
//		Time complexity: O(2^n) - since size of recursion tree will be 2^n
//		Space Complexity: O(n) - space required for the recursive function call stack.
//		
//		class Solution
//		{
//		    public int climbStairs(int n)
//		    {
//		        if(n <= 2)
//		            return n;
//		        else
//		            return climbStairs(n - 1) + climbStairs(n - 2);
//		    }
//		}
//		Solution 2: Dynamic Programming
//		
//		This similar to Solution1, but here we cache the intermediate results in an array for the performance improvement.
//		Let dp[i] denotes the number of ways to reach on ith step, then
//		dp[i] = dp[i - 1] + dp[i - 2]
//		Time complexity: O(n)
//		Space Complexity: O(n)
//		
//		Top-Down Approach
//		
//		class Solution
//		{
//		    int[] cache = new int[46];
//		    
//		    public int climbStairs(int n)
//		    {
//		        if(n <= 2)
//		            return n;
//		        else if(cache[n] != 0)
//		            return cache[n];
//		        else
//		            return cache[n] = climbStairs(n - 1) + climbStairs(n - 2);
//		    }
//		}
//		Bottom-Up Approach
//		
//		class Solution
//		{
//		    public int climbStairs(int n)
//		    {
//		        if(n <= 2)
//		            return n;
//		
//		        int[] dp = new int[n + 1];
//		        dp[1] = 1;
//		        dp[2] = 2;
//		        
//		        for(int i = 3; i <= n; i++)
//		        {
//		            dp[i] = dp[i - 1] + dp[i - 2];
//		        }
//		        return dp[n];
//		    }
//		}
//		Solution 3: Fibonacci Number
//		
//		In the above approach of Solution2, we have used an array where dp[i] = dp[i - 1] + dp[i - 2]. It can be easily analyzed that dp[i] is nothing but ith Fibonacci number.
//		Fib(n) = Fib(n - 1) + Fib(n - 2)
//		So now we just have to find nth number of the Fibonacci series having 1 and 2 as their first and second term respectively,
//		i.e. Fib(1) = 1 and Fib(2) = 2.
//		Time complexity: O(n)
//		Space Complexity: O(1)
//		
//		class Solution
//		{
//		    public int climbStairs(int n)
//		    {
//		        if(n <= 2)
//		            return n;
//		
//		        int a = 1;
//		        int b = 2;
//		
//				for(int i = 3; i <= n; i++)
//				{
//		            int sum = a + b;
//		            a = b;
//		            b = sum;
//		        }
//		        return b;
//		    }
//		}

 */ 
