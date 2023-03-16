package part_04_DSA_Advance_05_Searching;

public class Searching_01_IndexOfFirstOccuranceInASortedArray_02_Recursive {

	static int firstOcc(int arr[], int low, int high, int x) {
		
		if(low>high)
			return -1;
		
		int mid=(low+high)/2;
		
		if(arr[mid]<x)
			return firstOcc(arr,mid+1,high,x);
		else if(arr[mid]>x)
			return firstOcc(arr,low,mid-1,x);
		
		else {
			// mind below if condition & think why
			if(mid == 0 || arr[mid-1] != arr[mid])
				return mid;
			else
				return firstOcc(arr,low,mid-1,x);
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,10,10,15,20,20,20};
		int x=20;
		
		int low=0;
		int high=arr.length-1;
		
		System.out.println(firstOcc(arr,low,high,x));
		
	}
	
}
