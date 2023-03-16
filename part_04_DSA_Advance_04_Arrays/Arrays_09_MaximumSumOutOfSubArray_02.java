package part_04_DSA_Advance_04_Arrays;


// Kadane's algorithm
public class Arrays_09_MaximumSumOutOfSubArray_02 {
	
	static int maxSumOfSubArray(int arr[]) {
		
		int maxSum=arr[0];
		int maxEnding=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			
			maxSum=Math.max(maxEnding, maxSum);
			
		}
		return maxSum;
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,-2,3,-1,2};
		
		System.out.println(maxSumOfSubArray(arr));
		
	}

}
