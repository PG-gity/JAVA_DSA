package part_02_DSA_06_Sorting;

public class Sorting_01_BubbleSort_01_NormalNotOptimized {
	
	// Starting :: To find time of execution
	private static long startTime = System.nanoTime();
	//****************************************//
	
	//code:	
	
	//Not Optimized
	private static void bubbleSort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
					// Mind > sign below: It makes Stable Sorting
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];				
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String []args) {
		
		int array[]= {10,8,20,5};
		
		bubbleSort(array);
		
		for(int i: array)
			System.out.println(i);
		
		
		//*****************************************//
		// To find time of execution

        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime) + " ns"); 
	}

}
