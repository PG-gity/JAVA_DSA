package part_04_DSA_Advance_04_Arrays;

//time:: theta(n)
public class Arrays_07_TrappingRainWater_02 {
	
	static int getWaterValue(int arr[]) {
		
		
		int result=0; 
		
		int lMax[] = new int[arr.length];
		int rMax[]= new int[arr.length];
		
		
		rMax[rMax.length-1]= arr[arr.length-1];
		
		//For Left max array
		lMax[0]=arr[0];
		for(int i=1; i<arr.length;i++) {
			
			lMax[i] = Math.max(lMax[i-1], arr[i]);
			
		}
		//For right max array
		rMax[rMax.length-1]=arr[arr.length-1];
		for(int i = arr.length-2; i >=0;i-- ) {
			
			rMax[i]= Math.max(rMax[i+1], arr[i]);
			
		}
		//For calculation
		for(int i=1; i<arr.length-1;i++) {
			
			result = result + (Math.min(lMax[i], rMax[i])-arr[i]);

		}
		
/*		//Print lmax and rmax
		for(int i: arr)
			System.out.print(i+" ");
		
		System.out.println();
		
		for(int i:lMax)
			System.out.print(i+" ");
		
		System.out.println();
		
		for(int i:rMax)
			System.out.print(i+" ");
		
		System.out.println();
*/		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,0,6,2,3};
		
		System.out.println(getWaterValue(arr));
	}
}