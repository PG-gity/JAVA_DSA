package part_04_DSA_Advance_04_Arrays;

//Adv_Arrays_1:10:00
//Time: O(n^2)
public class Arrays_11_MaximumSumOutOf_Circular_SubArray_01_Naive {

	
	static int maxSumOfCircularSubArray(int arr[]) {
		
		int maxSum=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			int curSum=arr[i];
			int curMax=arr[i];
			
			for(int j=1;j<arr.length;j++) {
				
				int index = (i+j) % arr.length;
				
				curSum = curSum + arr[index];
				
				curMax=Math.max(curMax, curSum);
			}
			
			maxSum=Math.max(maxSum, curMax);
		}
		
		return maxSum;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {5,-2,3,4};
		
		System.out.println(maxSumOfCircularSubArray(arr));
		
	}
}
