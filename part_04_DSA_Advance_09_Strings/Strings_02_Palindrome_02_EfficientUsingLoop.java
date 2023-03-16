package part_04_DSA_Advance_09_Strings;

/* Palindrome check using Loop
 * 
 */
public class Strings_02_Palindrome_02_EfficientUsingLoop {

	static boolean isPal(String str) {
		
		int start=0;
		int end=str.length()-1;
		
		while(start<=end) {
			
			if(str.charAt(start) != str.charAt(end))
				return false;
			
			start++;
			end--;
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		String s = "ABD5A";
		
		System.out.println(isPal(s));
	}
}
