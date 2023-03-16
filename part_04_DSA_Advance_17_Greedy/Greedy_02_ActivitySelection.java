package part_04_DSA_Advance_17_Greedy;


import java.util.*;

class Activity{
	int start;
	int finish;
	
	Activity(int s,int f){
		this.start=s;
		this.finish=f;
	}
}

//Put Below code Or remove MyComp class and put as 
//lambda function where ever sorting req.: (point p1, point p2)-> (p1.y-p2.y)
class MyComp implements Comparator<Activity>{
	public int compare(Activity a1, Activity a2) {
		return a1.finish-a2.finish;
	}
}
public class Greedy_02_ActivitySelection {
	
	public static int maxActivity(Activity arr[]) {
		
//Use MyComp class by implements Comparator interface as:
		
		//Arrays.sort(arr, new MyComp());
		
		//OR:
		Arrays.sort(arr,(a1,a2)->(a1.finish-a2.finish));
		
		
		// Just to print sorted Activity[]
//		for(int i=0;i<arr.length;i++) {
//			
//				System.out.println(arr[i].start+", "+arr[i].finish);
//		}

		
		int res=1;
		int prev=0;
		
		for(int curr=1;curr<arr.length;curr++) {
			
			if(arr[curr].start >= arr[prev].finish) {
				res++;
				prev=curr;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		Activity arr[] = {new Activity(12,25),
						  new Activity(10,20),
						  new Activity(20,30)
				
						  };
		
		System.out.println(maxActivity(arr));
	}

}
