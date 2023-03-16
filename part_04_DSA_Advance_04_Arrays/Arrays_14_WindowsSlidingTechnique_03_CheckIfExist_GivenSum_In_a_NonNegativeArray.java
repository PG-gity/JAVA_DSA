package part_04_DSA_Advance_04_Arrays;

public class Arrays_14_WindowsSlidingTechnique_03_CheckIfExist_GivenSum_In_a_NonNegativeArray {

	//Only works for array having non negative elements 
	
	//Not working for sum=15 with array {4,20,3,10,5}; test why 
	static boolean isSubSum(int arr[], int sum) {
		
		int curSum=arr[0];
		
		int start=0;
		
		for(int end=1;end<arr.length;end++) {
			
			while(curSum > sum && start < end-1) {
				
				curSum -= arr[start];
				start++;
			}
			
			if(curSum==sum)
				return true;
			if(end<arr.length)
				curSum +=arr[end];
		}
		
		return (curSum == sum);	
	}
	public static void main(String[] args) {
		
		int arr[]= {4,20,3,10,5};
		
		int sum = 13;
		
		System.out.println(isSubSum(arr,sum));
	}
	
}
