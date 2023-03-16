package part_04_DSA_Advance_04_Arrays;


public class Arrays_05_MaximusDifference_suchThat_j_is_greaterThan_i_02 {

	// int order max Diff or where j>i; i and j are index of element
	static int maxDiff(int arr[]) {
		
		int res = arr[1]-arr[0];
		
		int minVal = arr[0];
		
		
		//loop must start from 1 since their is 
		// of arr[1] being minVal
		for(int i=1;i<arr.length;i++) {
			
			res = Math.max(res, arr[i]-minVal);
			
			minVal = Math.min(minVal, arr[i]);
			
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		
		int array[] = {2,3,10,6,4,8,1};
		
		System.out.println(maxDiff(array));
		
	}
}
