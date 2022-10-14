package part_02_DSA_06_Sorting;

public class Sorting_01_BubbleSort_03_FurtherOptimizating {
	
	// Starting :: To find time of execution
	private static long startTime = System.nanoTime();
	//****************************************//
	
	//code:	
	
	//Further Optimized
	public static void bubbleSort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			//Optimization: Using Swapped variable to 
			//check Sorted or partial sorted array	
			
			for(int j=0;j<arr.length-i-1;j++) {
				
				boolean swapped; //It means:swapped=false;Default value is : False
				if(arr[j]>arr[j+1]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}else {
					continue;
				}
				if(swapped==false) {
					break;
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
