package part_04_DSA_Advance_05_Searching;

public class Searching_02_IndexOfLastOccuranceInASortedArray_03_Iterative_BinarySearch {

	static int lastOcc(int arr[], int x) {
		
		int low=0;
		int high = arr.length-1;
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			
			if(arr[mid] < x)
				low = mid+1;
			else if(arr[mid] > x)
				high = mid-1;
			else {
				
				if(mid == arr.length-1 || arr[mid] != arr[mid+1])
					return mid;
				else
					low=mid+1;
			}
			
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		
		int arr[] = {5,10,10,10,10,20,20};
		
		System.out.println(lastOcc(arr,10));

	}

}
