package part_04_DSA_Advance_04_Arrays;


//Time: theta(n)
public class Arrays_03_LeaderInAnArray_02 {
	
	static void leader(int arr[]) {
		
		int cur_lead= arr[arr.length-1];
		
		System.out.println(cur_lead);
		
		for(int i = arr.length-2; i >= 0; i--) {
			
			if(arr[i]>cur_lead) {
				
				cur_lead=arr[i];
				System.out.println(cur_lead);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] array= {7,10,4,10,6,5,2};
		
		leader(array);
	}

}
