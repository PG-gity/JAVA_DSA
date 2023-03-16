package part_04_DSA_Advance_09_Strings;

/*Check if String 1 contains subsequence of String2
 * Subsequence means: str1		str2		Contains subSeq
 * 					ABCDEF	  ACF			YES
 * 					ABCDEF		  AEC			NO		
 */
public class Strings_03_String1_has_SubsequanceOf_String2_02_EfficientUsingLoop {

	static boolean subSeq(String str1, String str2) {
		
		//for corner case
		if(str1.length() < str2.length())
			return false;
		
		int indxStr2=0;
		
		for(int i=0;i<str1.length();i++) {
			
			if(str1.charAt(i)==str2.charAt(indxStr2)) {
				indxStr2++;
				
				if(indxStr2==(str2.length()-1))
					return true;
			}
		}
			
		return false;	
	}
	public static void main(String[] args) {
		
		String str1= "ABCDE";
		String str2= "ABE";
		System.out.println(subSeq(str1,str2));
	}
}
