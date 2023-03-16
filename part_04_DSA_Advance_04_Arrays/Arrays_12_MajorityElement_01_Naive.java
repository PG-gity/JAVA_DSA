package part_04_DSA_Advance_04_Arrays;

//Time : O(n^2)
public class Arrays_12_MajorityElement_01_Naive {

	// Majority Element means if it appears more than arr.length/2 times
	static int findMajority(int[] arr) {
		
		
		for(int i=0;i<arr.length;i++) {
			
			int count=1;
			for(int j=i+1;j<arr.length;j++) 
				
				if(arr[j] == arr[i]) 
					
					count++;
			if(count > arr.length/2)
				return i;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[] = {8,7,6,8,6,6,6,6};
		
		System.out.println(findMajority(arr));
	}

}
