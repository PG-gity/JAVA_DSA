package part_02_DSA_03_Recursion;


public class Recursion_05_PalindromeCheck {
	
	public static boolean palindromeCheck(String str,int start,int end) {
		/******Mind It:: It's Case Sensitivity check******/
		// To make it Case Insensitive check convert string to Upper or Lower case; 
		//Include below line
		// str=str.toUpperCase();
		
		
		if(start>=end)
			return true;
		
		return ((str.charAt(start)==str.charAt(end)) && palindromeCheck(str,start+1,end-1));
	}

	public static void main(String[] args) {
		
		String str="abcBa";
		
		
		int start=0;
		int end= str.length()-1;
		System.out.println(palindromeCheck(str,start,end));
		
		

	}

}
//*****Other Ideas:
//1. reverse the no. or String and check both are equal:
/*
class Solution
{
    // Complete the function
    // N: input element
    public static int isPalinUtil(int n,int rev) {
        if(n==0)
            return rev;
        return isPalinUtil(n/10,rev*10+n%10);
    }
    static boolean isPalin(int n)
    {
        return isPalinUtil(n,0)==n;
    }
}
 * 
 * 
 * 2.
 * */
