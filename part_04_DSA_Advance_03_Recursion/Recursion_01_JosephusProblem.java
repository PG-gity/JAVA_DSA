package part_04_DSA_Advance_03_Recursion;


public class Recursion_01_JosephusProblem {
	//Valid if no of elem starts from 0 ; i.e. for 0-num
	static int josFun(int num,int k) {
		
		if(num==1)
			return 0;
		else
			return (josFun(num-1, k) + k) % num;
	}
	
	//If no of elements starts from 1 then add below code
	
//	static int myJos(int num , int k) {
//		
//		return josFun(num , k ) + 1;
//	}
	
	
	public static void main(String[] args) {
		
		int n=5;
		int k=3;
		
		System.out.println(josFun(n,k));
		
	}

}
