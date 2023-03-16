package part_04_DSA_Advance_04_Arrays;

public class Arrays_08_MaximumConsecutive_1_in_A_BinaryArray_01_Naive {
	
static int maxConsecutiveOnes(int arr[]) {
		
		int res=0;
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=i ;j<arr.length;j++) {
				
				if(arr[j]==1)
					count++;
				else
					break;
				
			}
			
			res= Math.max(count, res);
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		int arr[]= {0,1,1,1,0,1,1,1,1};
		
		System.out.println(maxConsecutiveOnes(arr));
	}

}
