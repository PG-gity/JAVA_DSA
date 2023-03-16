package part_04_DSA_Advance_08_Hashing;

public class Hashing_01_NoOfElement_In_IntersectionOfTwoArray_01_Naive {

	static int noOfElementInIntersection(int a[], int b[]) {
		
		int noOfElem = 0;
		
		for(int i=0;i<a.length;i++) {
			
			boolean flag=false;
			for(int j=0; j <i-1; j++) {
				
				if(a[i]==a[j]) {
					
					flag =true;
					break;
				}
				if(flag == true)
			}
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {10,15,20,15,30,30,5};
		int b[] = {30,5,30,80};
		
		
	}

}
