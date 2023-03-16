package part_04_DSA_Advance_04_Arrays;


// Time: O(n)
public class Arrays_02_MoveAllZeroToEnd_02 {

	static void pushZeroToEnd(int arr[]) {
		
		int countNonZero=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] != 0) {
				
				int temp=arr[countNonZero];
				arr[countNonZero]=arr[i];
				arr[i]=temp;
				
				countNonZero++;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] array= {10,8,0,0,12,0};
		
		pushZeroToEnd(array);
		
		for(int i:array)
			System.out.println(i);
	}

}
