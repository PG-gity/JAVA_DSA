package part_04_DSA_Advance_09_Strings;

public class Strings_02_Palindrome_01_Naive {

	static boolean isPal(String s) {
		
		//Since String is an immutable so collect in a mutable
		StringBuilder  str= new StringBuilder(s);
		
		//make reverse using collections
		StringBuilder rev = str.reverse();
		
		if(s.equals(rev.toString()))
			return true;
		
		return false;
	}
	public static void main(String[] args) {
		
		String s = "ABC5A";
		
		System.out.println(isPal(s));
	}

}
