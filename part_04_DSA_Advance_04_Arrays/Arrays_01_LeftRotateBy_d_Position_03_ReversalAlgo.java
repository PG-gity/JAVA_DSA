package part_04_DSA_Advance_04_Arrays;

public class Arrays_01_LeftRotateBy_d_Position_03_ReversalAlgo {

	static void leftRotatedBy_d(int arr[],int d) {
		
		if(d > arr.length)
			d%=arr.length;
		
		//first d elements
		reverse(arr,0,d-1);
		
		//d to last
		reverse(arr,d,arr.length-1);
		
		//Full array
		reverse(arr,0,arr.length-1);
		
	}
	
	static void reverse(int[] arr,int low, int high) {
		
		while(low<high) {
			
			//Swap low with high
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			
			low++;
			high--;
		}
		
	}
	
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5};
		
		int distanceOfrotation=7;
		
		leftRotatedBy_d(array,distanceOfrotation);
		
		for(int i:array)
			System.out.println(i);
		
	}
	
}
