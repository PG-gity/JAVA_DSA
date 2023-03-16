package part_04_DSA_Advance_06_Sorting;


/* Inversion means:-
 *  a pair( arr[i],arr[j])
 *  where i < j and arr[i] > arr[j]
 * Note: * If Array is sorted in increasing order then 0 (zero) inversion
 * 		 * 						 decreasing order then (n*(n-1)/2) inversions
 * 					:- since for i=0 --> n-1 inversion
 * 								 i=1 --> n-2 inversion
 * 								so on...
 */

//Time: O(n^2)
public class Sorting_03_Count_Inversion_InAnArray_01_Naive {

	static int countInversion(int arr[]) {
		
		int noOfInv=0;
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j] < arr[i]) {
					noOfInv++;
				}
			}
		}
		
		return noOfInv;
	}
	public static void main(String[] args) {

		int arr[] = {2,4,1,3,5};
		
		System.out.println(countInversion(arr));
	}

}
