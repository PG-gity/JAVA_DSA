package part_04_DSA_Advance_04_Arrays;


//Time:: O(n)
public class Arrays_10_MaxLengthOfAlternatingOddEvenArray_02 {

	static int maxLengthOddEven(int arr[]) {
		
		int len=1;
		int curLen=1;
		
		for(int i=1;i<arr.length;i++) {
			
			if(   (arr[i] %2 == 0 && arr[i-1] %2 != 0)
			   || (arr[i] %2 != 0 && arr[i-1] %2 == 0)) {
				
				curLen++;
				
				len = Math.max(curLen, len);
			} 
			else 
				curLen=1;

		}
		return len;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {5,10,20,6,3,8};
		
		System.out.println(maxLengthOddEven(arr));
	}
}
