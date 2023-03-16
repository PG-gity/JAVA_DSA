package part_04_DSA_Advance_04_Arrays;

//Adv_Arrays_1:13:20
//Time: O(n)


public class Arrays_11_MaximumSumOutOf_Circular_SubArray_02 {

	// Kadare's Algorithm
	static int maxSumNormalSubArray(int arr[]) {
		
		int maxSum=arr[0];
		int maxEnding =arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			
			maxSum = Math.max(maxEnding, maxSum);
			
			
		}
		
		return maxSum;
	}
	
	static int overallMaxSum(int arr[]) {
		
		//max sum out of normal subarray (i.e. not circular one)
		int maxSumOfNormalSubArray=maxSumNormalSubArray(arr);
		
		// If all elements are -ve
		if(maxSumOfNormalSubArray < 0 )
			return maxSumOfNormalSubArray;
		
		//Now for Circular sum
		
		//Actually here we are trying to get minimum sub array 
		//by alternating sign of all elements and 
		//passing to same fun which provide max but now it will 
		//provide min sum sine we have alternated sign
		int OverAllArrSum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			//to find overall sum
			OverAllArrSum += arr[i];
			//to alternate sign
			arr[i] = -arr[i];
			
		}
									//OverAllArrSum -(-maxSumNormalSubArray)
													//mind it arr has all element inverted
		int maxSumCircularSubarray = OverAllArrSum+maxSumNormalSubArray(arr);
		
		return Math.max(maxSumOfNormalSubArray, maxSumCircularSubarray);
	}										
	
	public static void main(String[] args) {
		
		int arr[] = {8,-4,3,-5,4};
		
		System.out.println(overallMaxSum(arr));
	}

}
