package part_04_DSA_Advance_04_Arrays;

public class Arrays_10_MaxLengthOfAlternatingOddEvenArray_01_Naive {

	static int maxLengthOddEven(int[] arr) {
		
		int len=1;
		
		for(int i=0;i<arr.length;i++) {
			
			int curLen=1;
			
			for(int j=i+1; j<arr.length;j++) {
				
				if( (arr[i] %2 == 0 && arr[j] %2 != 0)
						
				 || (arr[j] %2 == 0 && arr[j-1]%2!=0)) {
					
					curLen++;
					
				}
				else
					break;

			}
			
			len = Math.max(len, curLen);
		}
		
		return len;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {5,10,20,6,3,8};
		
		System.out.println(maxLengthOddEven(arr));
		
	}	
	
}
