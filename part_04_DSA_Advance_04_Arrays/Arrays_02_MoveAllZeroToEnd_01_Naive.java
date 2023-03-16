package part_04_DSA_Advance_04_Arrays;


//time: O(n^2)
public class Arrays_02_MoveAllZeroToEnd_01_Naive {

	static void moveToEnd(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
				
			if(arr[i]==0) {
				
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[j]>0) {
						
						//swap with previous found zero
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] array= {10,5,0,0,8,0,9,0};
		
		moveToEnd(array);
		
		for(int i:array)
			System.out.println(i);
		
	}

}
