package part_02_DSA_05_Searching;

public class Binary_Search_Recursive {
	// Starting :: To find time of execution
		private static long startTime = System.nanoTime();
		//****************************************//

	
	
			//		(Array, Number, LowerIndex, HigherIndex)
	public static int bSearch(int arr[],int n, int low, int high) {

		int mid=(low+high)/2;
		
		//If not found then:
		if(low>high)
			return -1;
		// To find:
		if(arr[mid]==n) {
			return mid;
		}else if(arr[mid]<n) {
			
			return bSearch(arr,n,mid+1,high);
		}else {
			
			return bSearch(arr,n,low,mid-1);
		}
		
	}
	public static void main(String []args) {
		int array[] = {10,20,30,40,50,60};
		int numb=60;
		
		int low=0;
		int high=array.length-1;
		
		System.out.println(bSearch(array,numb,low,high));
		
		//*****************************************//
		// To find time of execution

        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime) + " ns"); 
	}

}
