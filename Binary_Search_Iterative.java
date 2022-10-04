package part_02_DSA_05_Searching;

// Create a method or Function taking an Array and an element as argument. 
// If Element is present: Return index 
// If not present : Return -1
// If repeating : Return any of the index


public class Binary_Search_Iterative {
	// Starting :: To find time of execution
	private static long startTime = System.nanoTime();
	//****************************************//
	
	//code: 

	public static int search(int arr[], int n) {
		
		int low=0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid]==n) {
				return mid;
			}else if(arr[mid]>n) {
				high=mid-1;
			}
			else
				low=mid+1;		
		
		}		

		return -1;
	}
	
	
	public static void main(String []args) {
		

		
		int array[] = {10,20,30,40,50,60};
		int numb=60;
		
		
		System.out.println(search(array,numb));
		
		//*****************************************//
		// To find time of execution

        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime) + " ns"); 
	}

}
