package part_02_DSA_06_Sorting;

public class Sorting_03_InsertionSort_01_NormalOrNaive {
	
	private static void insertionSort(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			
			int key=arr[i];
			int j=i-1;
			
			//here   arr[j] > key  : will throw Index -1 out of bounds
			// since 1st statement(while(arr[j]>key && ..)) will be checked 
			//firstly and j-- from previous iteration will provide j=-1
			
			// Solution:: either put like--> while( j>=0 && arr[j]>key)
			// Or change j variable initialization to int j=i; and change loop also
			while(j>=0 && arr[j]>key) {
				
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
 
	}
	public static void main(String args[]) {
		
		int array[]= {20,5,40,60,10,30};
		
		insertionSort(array);
		
		for(int item:array)
			System.out.println(item);
	
	}

}
