package part_04_DSA_Advance_04_Arrays;

public class Arrays_01_LeftRotateBy_d_Position_01_Naive {

	// time: O(n*d)
	
	//Main rotation Fun
	static void leftRotateOne(int arr[]) {
		
		int temp=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			arr[i-1]=arr[i];
			
		}
		
		arr[arr.length-1]=temp;
		
	}
	
	//D times rotation support fun
	static void dTimesLeftRotation(int arr[],int d) {
		
		// Improved using below code if d>n
		if(d > arr.length)
			d %= arr.length;
		
		for(int i=0;i<d;i++) {
			
			leftRotateOne(arr);
			
		}
	}
	
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5};
		
		int distanceOfrotation=7;
		
		dTimesLeftRotation(array,distanceOfrotation);
		
		for(int i:array)
			System.out.println(i);
		
	}

}
