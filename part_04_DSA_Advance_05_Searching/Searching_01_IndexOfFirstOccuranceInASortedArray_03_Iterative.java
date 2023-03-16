package part_04_DSA_Advance_05_Searching;

public class Searching_01_IndexOfFirstOccuranceInASortedArray_03_Iterative {

	static int firstOcc(int arr[], int x) {
		
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			
			int mid=(low+high)/2;
			
			if(arr[mid]<x)
				low=mid+1;
			else if(arr[mid]>x)
				high=mid-1;
			else {
				if(mid==0 || arr[mid-1] != arr[mid])
					return mid;
				else
					high=mid-1;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {

		int arr[] = {5,10,10,15,20,20,20};
		int x=20;
		
		System.out.println(firstOcc(arr,x));
		
	}

}
