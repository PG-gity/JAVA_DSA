package part_04_DSA_Advance_03_Recursion;


public class Recursion_03_Print_All_Permutation_Of_A_String {
	
	
	
	static void permute(String str,int i) {
		
		if(i==str.length())
			
			System.out.println(str);
		
		else {
			
			for(int j=i;j<str.length();j++) {
				
				str = swap(str,i,j);
				
				permute(str,i+1);
				
				//mind below why i first then j
				str = swap(str, i, j);
				
			}
			
		}

	}
	
	static String swap(String a,int i,int j) {
		
		char temp;
		
		char[] charArr = a.toCharArray();
		
		temp=charArr[i];
		charArr[i]=charArr[j];
		charArr[j]=temp;
		
		return String.valueOf(charArr);
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "ABCD";
		
		permute(str,0);
		
	}

}
