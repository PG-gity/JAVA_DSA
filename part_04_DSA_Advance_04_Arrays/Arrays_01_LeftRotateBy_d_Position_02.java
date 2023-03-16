package part_04_DSA_Advance_04_Arrays;


// time : Theta(d+n-d+d)=theta(n+d)
public class Arrays_01_LeftRotateBy_d_Position_02 {

	static void leftrotateBy_d(int arr[],int d) {
		
		// If d > arr.length it will rotate by d - arr.length (where d < arr.length)
		if(d>arr.length)
			d%=arr.length;
		
		
		int[] tempArr=new int[d];
		
		for(int i=0;i<d;i++) {
			
			tempArr[i]=arr[i];
			
		}
		for(int i=d;i<arr.length;i++) {
			
			arr[i-d]=arr[i];
			
		}
		for(int i=(arr.length-d);i<arr.length;i++) {
			
			arr[i]=tempArr[i-(arr.length-d)];
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5};
		
		leftrotateBy_d(array,7);
		
		for(int i:array)
			System.out.println(i);
		
	}

}
