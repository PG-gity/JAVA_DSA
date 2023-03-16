package part_04_DSA_Advance_19_DynamicPrograming;

import java.util.Arrays;

//Top bottom approach
public class DynamicProgramming_01_Memoization_FibonacciSeries {


	static int memo[];
/*//Another approach:

	static int fib(int n)
	{
	    if(memo[n]==-1)
	    {
	        int res;
	        
	        if(n==0 || n==1)
	            return n;
	        
	        else
	           { res = fib(n-1)+fib(n-2);
	           
	            
	           }
	           
	           memo[n]=res;
	            
	        
	    }
	    
	    return memo[n];
	}
 * 
 */
	static int fib(int n) {
		
		int res;
		if(memo[n] > -1)
			return memo[n];
		
		if(n==0) {
			memo[0]=0;
			return 0;
		}
		if(n==1 || n==2) {
			memo[1]=1;
			memo[2]=1;
			return 1;
		}	
		else {
			
			res = fib(n-1)+fib(n-2);
			memo[n]=res;
		}
		
		
		return memo[n];
	}
	public static void main(String[] args) {
		
		int n =6;
		
		memo =  new int[n+1];
		
		Arrays.fill(memo, -1);
		
		System.out.println(fib(n));
		
//		for(int i: memo)
//			System.out.println(i);
	}
}
