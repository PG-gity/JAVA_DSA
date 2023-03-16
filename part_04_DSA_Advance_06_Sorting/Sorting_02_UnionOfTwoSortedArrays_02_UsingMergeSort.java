package part_04_DSA_Advance_06_Sorting;


//Time: O(m+n)
public class Sorting_02_UnionOfTwoSortedArrays_02_UsingMergeSort {

	static void printUnion(int a[],int b[]) {
		
		int i=0;int j=0;
		
		while(i< a.length && j<b.length) {
			
			if(i>0 && a[i] ==a[i-1]) {
				i++;
				continue;
			}
			if(j >0 && b[j] == b[j-1]) {
				
				j++;
				continue;
			}
			
			if(a[i] < b[j]) {
				
				System.out.println(a[i]);
				i++;
			}
			else if(b[j] < a[i]) {
				
				System.out.println(b[j]);
				j++;
			}
			else {
				
				System.out.println(a[i]);
				i++;
				j++;
			}
		}
		
		while(i<a.length) {
			
			if(i>0 && a[i] !=a[i-1]) {
				System.out.println(a[i]);
				i++;
			}
		}
		while(j<b.length) {
			
			if(j>0 && b[j] != b[j-1]) {
				System.out.println(b[j]);
				j++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int arrA[] = {10,20,20};
		int arrB[]= {5,20,40,40};
		
		
		printUnion(arrA,arrB);

	}

}
