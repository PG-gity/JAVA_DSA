package part_04_DSA_Advance_06_Sorting;

import java.util.Arrays;

//Time : O(n log n)
public class Sorting_01_minimumDiff_In_an_Array_02 {

	static int getMinDiff(int arr[]) {
		
		Arrays.sort(arr);
		
		int minDiff = Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			
			minDiff = Math.min(minDiff,arr[i]-arr[i-1]);
			
		}
		
		return minDiff;
	}
	
	public static void main(String arg[]) {
		
		int arr[] = {5,3,8};
		
		System.out.println(getMinDiff(arr));

		
	}
	
}
