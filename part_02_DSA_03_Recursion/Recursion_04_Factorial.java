package part_02_DSA_03_Recursion;

public class Recursion_04_Factorial {
	
	private static int facto(int num) {
		if(num==0 || num==1) {
			return 1;
		}
		return num*facto(num-1);
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println(facto(n));;

	}

}
