package part_04_DSA_Advance_01_Mathematics;

public class Mathematics_02_PalindromeNumber {
	
	// Below is one of solution, we can convert given number to 
	// a String then we can easily find reverse using Collections or by reverse traversing
	static boolean isPalindrome(int n) {
		 
		
		int revOfNum=0;
		int tempNum=n;
		
		while(tempNum!=0) {
			
			revOfNum=10*revOfNum+(tempNum%10);
			
			tempNum/=10;
			
			//directly replace last return with directly(n==revOfNum)
//			if(n==revOfNum)
//				return true;
		}
		
	
		return (n==revOfNum);
	}
	
	
	public static void main(String[] args) {
		
		int num=89698;
		
		System.out.println(isPalindrome(num));
		
		
		
	}

}
