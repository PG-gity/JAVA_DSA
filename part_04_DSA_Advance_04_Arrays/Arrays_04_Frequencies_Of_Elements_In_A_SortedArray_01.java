package part_04_DSA_Advance_04_Arrays;


//this is for sorted array; for unsorted array their is different solution
public class Arrays_04_Frequencies_Of_Elements_In_A_SortedArray_01 {
	
	static void printFreq(int[] arr) {


		//In below code missing last element try to improve it
		int freq=1;
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]==arr[i-1]) {
				freq++;
			} else {
				System.out.println(arr[i-1]+" freq:"+freq);
				freq=1;
			}

			
		}
		
//## Mind below is the corner case that's why above code was not working properly	
		
		//Improved
		if(arr.length==1 || arr[arr.length-1] != arr[arr.length-2]) {
			System.out.println(arr[arr.length-1]+" freq:"+1);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[] array= {10,10,10,30,30,40};
		
		printFreq(array);
		
	}

}
