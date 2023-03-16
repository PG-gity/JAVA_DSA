package part_04_DSA_Advance_19_DynamicPrograming;

//bottom up approach
public class DynamicProgramming_01_Tabulation_FibonacciSeries {

	static int fib(int n) {
		
		int fibArr[] = new int[n+1];
		
		fibArr[0]=0;
		fibArr[1]=1;
		
		for(int i=2;i<fibArr.length;i++) {
			
			fibArr[i]=fibArr[i-1]+fibArr[i-2];
		}
		return fibArr[n];
	}
	public static void main(String[] args) {
		
		
		System.out.println(fib(6));
	}
}
