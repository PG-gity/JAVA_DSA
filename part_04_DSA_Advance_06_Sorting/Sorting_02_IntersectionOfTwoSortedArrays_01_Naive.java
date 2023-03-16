package part_04_DSA_Advance_06_Sorting;


//Time: O(a.length * b.length) 

// Following approach can be use for sorted as well as for unsorted also
public class Sorting_02_IntersectionOfTwoSortedArrays_01_Naive {

	static void intersectionOfTwoSortedArray(int a[],int b[]) {
		
		for(int i=1;i<a.length;i++) {
			
			if((a[i] == a[i-1]))
				continue;
			
			for(int j=0; j < b.length;j++) {
				
				if(a[i]==b[j]) {
					System.out.println(a[i]);
					break;
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		
		int[] arrA = {1,20,20,40,60};
		int[] arrB = {2,20,20,20};
		
		intersectionOfTwoSortedArray(arrA,arrB);
	}

}
