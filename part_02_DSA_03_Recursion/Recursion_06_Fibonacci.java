package part_02_DSA_03_Recursion;

public class Recursion_06_Fibonacci {
//Position:	0 1 2 3 4 5 6   7  8  
	//      0 1 1 2 3 5 8  13  21
	private static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1 || n==2) // n= 1 and 2 must be handled: bcz n=1-->fib(n-2)=-ve
			return 1;
		
		
		return fib(n-1)+fib(n-2);
		
	}
	public static void main(String[] args) {
		
		int n=7;
		System.out.println(fib(n));;
		
	}

}
