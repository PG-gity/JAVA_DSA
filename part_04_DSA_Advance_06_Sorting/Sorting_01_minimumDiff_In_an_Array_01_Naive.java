package part_04_DSA_Advance_06_Sorting;

//Time : O(n^2)
public class Sorting_01_minimumDiff_In_an_Array_01_Naive {

	static int getMinDiff(int arr[]) {
		
		int minDiff = Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			
			for(int j=0; j < i;j++) {
				
				minDiff = Math.min(minDiff, Math.abs(arr[j]-arr[i]));
			}
		}
		
		return minDiff;
	}
	public static void main(String[] args) {
		
		int arr[] = {5,3,8};
		
		System.out.println(getMinDiff(arr));
		
	}

}
