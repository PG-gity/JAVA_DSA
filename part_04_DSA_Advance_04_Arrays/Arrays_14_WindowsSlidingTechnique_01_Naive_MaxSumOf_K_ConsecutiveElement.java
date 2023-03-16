package part_04_DSA_Advance_04_Arrays;

//P4_L4: 1:40:20

//Time: O(n^2)
public class Arrays_14_WindowsSlidingTechnique_01_Naive_MaxSumOf_K_ConsecutiveElement {

	static int maxSumConsecutive_K_Element(int arr[],int k) {
		
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0;i+k-1<arr.length;i++) {
			
			int tempSum=0;
			for(int j=0;j<k;j++)
				
				tempSum += arr[i+j];
			
			maxSum = Math.max(maxSum, tempSum);
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,8,30,-5,20,7};
		int k=3;
		System.out.println(maxSumConsecutive_K_Element(arr,k));
	}
	
}
