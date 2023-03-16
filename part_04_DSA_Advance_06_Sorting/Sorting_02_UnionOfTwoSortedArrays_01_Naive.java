package part_04_DSA_Advance_06_Sorting;

import java.util.Arrays;

//Time:: O(m+n) * log(m+n)
public class Sorting_02_UnionOfTwoSortedArrays_01_Naive {

	static void printUnion(int a[],int b[]) {
		
		int tempArr[]= new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
			tempArr[i]=a[i];
		
		for(int i=0;i<b.length;i++)
			tempArr[a.length+i]=b[i];

		
		Arrays.sort(tempArr);
		
		for(int i=0; i<tempArr.length;i++) {
			
			if(i==0 || tempArr[i] !=tempArr[i-1])
				System.out.println(tempArr[i]);
		}
		
	}
	
	public static void main(String[] args) {

		int arrA[] = {10,20,20};
		int arrB[]= {5,20,40,40};
		
		
		printUnion(arrA,arrB);
	}

}
