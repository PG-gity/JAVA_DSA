package part_02_DSA_03_Recursion;

public class Recursion_03_SumOf_N_NaturalNo {
	public static int sum(int num) {
		if(num==0)
			return 0;		
		return num+sum(num-1);
	}
	public static void main(String[] args) {
		
		int num=5;
		
		System.out.println(sum(num));

	}

}
