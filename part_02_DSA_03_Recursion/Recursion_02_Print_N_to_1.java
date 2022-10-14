package part_02_DSA_03_Recursion;

public class Recursion_02_Print_N_to_1 {
	
	private static void printUpToN(int numb) {
		if(numb>0) {
			
			System.out.println(numb);
			printUpToN(numb-1);
			
		}

	}

	public static void main(String[] args) {
		int n=5;
		
		printUpToN(n);

	}

}

