package part_02_DSA_03_Recursion;

public class Recursion_09_SubsetOfString {
							//String, Current(to add subsets), index(to get charAt)
	private static void subSetStr(String s, String currStr,int i) {
		
		if(i==s.length()) {
			System.out.print(currStr+" ");
			return;
		}
		
		subSetStr(s,currStr,i+1);
		subSetStr(s,currStr+s.charAt(i),i+1);
		
	}
	public static void main(String[] args) {
		
		String s= "Gyan";
		String current = ""; // Initiating as empty string to add charAt to create subsets 
		
		subSetStr(s,current,0);	
		

	}

}
