package part_04_DSA_Advance_04_Arrays;

//Time:O(n)
Learn it agian properly
/*Idea: If we count group of 0 and 1 difference b/w these groups will be 1 or 0
		//1. if Array starts and ends with same element then difference of no of group will be 1
					// e.g.(1) 1 1 0 0 0 1 1 1 0 0 1
					 		 * no of grp of 1:3
							 * no of grp of 0 :2
							 * Diff: 1
		*****	//So we will flip second group always for min group flip  
			 
		//2. If Array starts and ends with same element then difference of no of group will be 0
		 * 			//e.g (1). 0 1 1 0 1					 
 
 ***** It Means we need to start flipping for second group it will cover both types of array
 */
public class Arrays_13_MinimumGroupFlipsToMakeSame_02 {
	
	static void printGroup(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] != arr[i-1]) {
				
				if(arr[i] != arr[0]) {
					
					System.out.print("From "+i+" to ");
				}
				else {
					
					System.out.println(i-1);
				}
			}
			if(arr[arr.length-1] !=arr[0])
				System.out.println(arr.length-1);
				
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {0,1,1,0,0,1,1,0};
		
		printGroup(arr);
	}

}
