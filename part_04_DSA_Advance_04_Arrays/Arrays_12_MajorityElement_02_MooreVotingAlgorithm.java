package part_04_DSA_Advance_04_Arrays;

//Time: O(n)

//Moore's voting algorithm
public class Arrays_12_MajorityElement_02_MooreVotingAlgorithm {

	//It Works in two phase:
			//1. Find an element(it ensures that if their is any majority element then this will be)
			//2. Check if the element is actually majority or not
	
	static int findMajority(int arr[]) {
		
		int indexMaj=0;
		
		//1.
		int count =1;
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[indexMaj] == arr[i])
				count++;
			else
				count--;
			
			if(count==0) {
				indexMaj=i;
				count=1;
			}
			
		}
		
		//2.
		count=0;
		for(int i=0;i<arr.length;i++)
			if(arr[indexMaj] == arr[i])
				count++;
		if(count <= arr.length/2)
			indexMaj= -1;
		
		
		return indexMaj;
	}
	public static void main(String[] args) {
		
		int arr[] = {8,8,6,6,6,4,6};
		
		System.out.println(findMajority(arr));
		
	}

}
