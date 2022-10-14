package part_02_DSA_03_Recursion;

public class Recursion_07_SumOfDigitsOfANo {
	private static int digitSum(int n) {
		if(n<=0)
			return 0;		
		
		return n%10+digitSum(n/10);
		
	}

	public static void main(String[] args) {
		
		int num=891;
		System.out.println(digitSum(num));
		
	}

}
