package part_04_DSA_Advance_04_Arrays;

public class Arrays_14_WindowsSlidingTechnique_02_MaxSumOf_K_ConsecutiveElement {

	static int maxSumConsecutive_K_Element(int arr[], int k) {
		
		int curSum=0;
		
		for(int i=0;i<k;i++)
			curSum += arr[i];
		
		int maxSum=curSum;
		
		for(int i=k;i<arr.length;i++) {
			
			curSum += (arr[i]-arr[i-k]);
			
			maxSum= Math.max(maxSum, curSum);
		}
		
		
		return maxSum;
	}
	public static void main(String[] args) {
		
		
		int arr[]= {1,8,30,-5,20,7};
		int k=3;
		System.out.println(maxSumConsecutive_K_Element(arr,k));
	}
}
