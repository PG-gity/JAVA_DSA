package part_04_DSA_Advance_04_Arrays;

public class Arrays_09_MaximumSumOutOfSubArray_01_Naive {

	static int maxSumOfSubArray(int arr[]) {
		
		int maxSum=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			
			int curSum=0;
			
			for(int j=i;j<arr.length;j++) {
				
				curSum+=arr[j];
				
				maxSum=Math.max(maxSum, curSum);
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,-2,3,-1,2};
		
		System.out.println(maxSumOfSubArray(arr));
	}

}
