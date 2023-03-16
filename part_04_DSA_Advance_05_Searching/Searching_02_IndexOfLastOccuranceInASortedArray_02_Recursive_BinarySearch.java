package part_04_DSA_Advance_05_Searching;

public class Searching_02_IndexOfLastOccuranceInASortedArray_02_Recursive_BinarySearch {

	static int lastOcc(int arr[], int low, int high, int x) {
		
		if(low>high)
			return -1;
		
		int mid=(low+high)/2;
		
		if(arr[mid]>x)
			return lastOcc(arr,low,mid-1,x);
		else if(arr[mid] <x)
			return lastOcc(arr,mid+1,high,x);
		else {
			
			if(mid == arr.length-1 || arr[mid] != arr[mid+1])
				return  mid;
			else
				return lastOcc(arr,mid+1,high,x);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,10,10,10,10,20,20};
		
		System.out.println(lastOcc(arr,0,arr.length-1,10));
	}

}
