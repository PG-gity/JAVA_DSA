package part_02_DSA_03_Recursion;

public class Recursion_01_PrintString_N_Times {
	
	public static void printN_Times(String string, int numb) {
		
		if(numb==0)
			return;
		
		
		System.out.println(string);
		printN_Times(string,(numb-1)); // Tail recursion
		
	}
	
	public static void main(String args[]) {
		
		String str= "Gyan";
		int nTimes=5;
		
		printN_Times(str, nTimes);
	}

}
