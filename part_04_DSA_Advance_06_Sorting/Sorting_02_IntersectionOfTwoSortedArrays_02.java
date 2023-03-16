package part_04_DSA_Advance_06_Sorting;


//Time : O(m+n)
public class Sorting_02_IntersectionOfTwoSortedArrays_02 {

	static void intersectionOfTwoSortedArray(int a[],int b[]) {
		
		int i=0; //for a
		int j=0; //for b
		// If any of array reaches it's last index 
		//then no element will be their for common comparison 
		//SO  i<a.length && j< b.length
		while(i<a.length && j< b.length) {
			
			//i>0 since i-1 may give -1;
			if( i > 0 && a[i]== a[i-1])
				continue;
			
			if(a[i] < b[j])
				i++;
			else if(b[j] < a[i])
				j++;
			else {
				
				System.out.println(a[i]);
				
				i++;
				j++;
			}
			
		}
		
	}
	public static void main(String[] args) {

		int[] arrA = {1,20,20,40,60};
		int[] arrB = {2,20,20,20};
		
		intersectionOfTwoSortedArray(arrA,arrB);

		
	}

}
