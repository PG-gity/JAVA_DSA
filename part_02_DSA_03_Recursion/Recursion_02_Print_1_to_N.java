package part_02_DSA_03_Recursion;

public class Recursion_02_Print_1_to_N {
	
				

	private static void printUpToN(int numb) {
		if(numb>0) {
			
			printUpToN(numb-1);
			System.out.println(numb);
		}

	}
	
	public static void main(String[] args) {
		
		int n=5;
		
		printUpToN(n);

	}

}
