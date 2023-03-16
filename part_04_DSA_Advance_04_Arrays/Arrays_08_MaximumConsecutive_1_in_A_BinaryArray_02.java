package part_04_DSA_Advance_04_Arrays;



public class Arrays_08_MaximumConsecutive_1_in_A_BinaryArray_02 {

	static int maxConsecutiveOnes(int arr[]) {
		
		int res=0;
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0)
				count=0;
			else {
				
				count++;
				res=Math.max(res,count);
			}
				
			
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {0,1,1,1,0,1,1,1,1};
		
		System.out.println(maxConsecutiveOnes(arr));
		
	}
	
}
