package part_02_DSA_05_Sorting;

public class Sorting_01_BubbleSort_02_Optimized {
	
	// Starting :: To find time of execution
	private static long startTime = System.nanoTime();
	//****************************************//
	
	//code:	
	
	//Optimized
	public static void bubbleSort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			//Optimization: j<(arr.length-i-1) --> reducing i every time 
			//because for i'th traversal i No. of element will sorted from last 
			
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}else {
					continue;
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
