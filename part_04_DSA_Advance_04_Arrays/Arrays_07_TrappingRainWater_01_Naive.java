package part_04_DSA_Advance_04_Arrays;


//Time:: Theta(n^2)
public class Arrays_07_TrappingRainWater_01_Naive {

	 static int getWaterValue(int arr[]) {
		 
		 int res= 0;
		 
		 for(int i=1; i< arr.length-1;i++) {
			 
			 int lMax=arr[0];
			 
			 for(int j=0;j<i;j++) {
				
				 lMax=Math.max(lMax, arr[j]);
				 
			 }
			 
			 int rMax= arr[arr.length-1];
			 
			 for(int j=i+1;j<arr.length;j++) {
				 
				 rMax=Math.max(rMax, arr[j]);
				 
			 }
			 
			 res= res + Math.min(lMax, rMax) - arr[i];
		 }
		 
		 return res;
	 }
	
	public static void main(String[] args) {
		
		int []trapWater = {3,0,1,2,5};
		
		System.out.println(getWaterValue(trapWater));
	}

}
