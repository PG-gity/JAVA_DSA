package part_04_DSA_Advance_03_Recursion;


//Better solution exists in DP
public class Recursion_02_SubSetSum {
	
	static int countSubSet(int arr[],int n,int sum) {
		
		if(n==0)
			return (sum==0) ? 1 : 0;
		
		return countSubSet(arr, n-1, sum) 
			 + countSubSet(arr, n-1,sum-arr[n-1]);
		
	}
	
	public static void main(String[] args) {
		
		int subSet[] = {10,20,15,5};
		
		System.out.println(countSubSet(subSet, subSet.length,25));
		
	}

}
