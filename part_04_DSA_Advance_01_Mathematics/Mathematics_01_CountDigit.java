package part_04_DSA_Advance_01_Mathematics;

public class Mathematics_01_CountDigit {
	
	public static int countOfDigits(int n) {
		
		int noOfDigits=0;
		
		while(n !=0 ) {
			
			n/=10;
			
			noOfDigits++;
		}
		
		return noOfDigits;
	}
	
	public static void main(String[] args) {
		
		int num=8520;
		
		System.out.println(countOfDigits(num));
	}

}
