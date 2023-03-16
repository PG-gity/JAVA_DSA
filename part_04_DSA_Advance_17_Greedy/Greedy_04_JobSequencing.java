package part_04_DSA_Advance_17_Greedy;


import java.util.*;

class Job{
	//due date: dd
	int dd,profit;
	char JobId;
	public Job(char id,int dd,int p) {
		this.JobId=id;
		this.dd=dd;
		this.profit=p;
	}
	
}
class MyCom implements Comparator<Job>{
	
	public int compare(Job j1,Job j2) {
		return j1.profit-j2.profit;
	}
	
}

public class Greedy_04_JobSequencing {
	
	public static void printJobSequencing(ArrayList<Job> jobs) {
		
		
		Collections.sort(jobs, (j1, j2)->{
			return j1.profit-j2.profit;
		});
		
		Collections.reverse(jobs);
		
		ArrayList<Job> res= new ArrayList<>();
		
		int resProf=0;
		
		boolean[] vis = new boolean[jobs.size()];
		
		for(int i=0;i<jobs.size();i++) {
			
			if(vis[jobs.get(i).dd]==false) {
				
				resProf += jobs.get(i).profit;
				vis[jobs.get(i).dd]=true;
				
				res.add(jobs.get(i));
				
			}
		}
		
		System.out.println(resProf);
		
//		result.add(i, new Job(jobs.get(i).JobId, jobs.get(i).dd,jobs.get(i).profit));
		
		for(Job j: res)
			System.out.println((char)j.JobId+" "+j.dd+" "+j.profit);
		
	}

	public static void main(String[] args) {
		
		ArrayList<Job> jobs = new ArrayList<Job>();
		
		jobs.add(new Job('a',2,100));
		jobs.add(new Job('b',1,19));
		jobs.add(new Job('c',2,27));
		jobs.add(new Job('d',1,25));
		jobs.add(new Job('e',3,15));
		
		
		printJobSequencing(jobs);

	}


}

/*
// Java implementation of above approach

// Program to find the maximum profit
// job sequence from a given array
// of jobs with deadlines and profits
import java.util.*;

class GFG {

	// a class to represent job
	static class Job {
		char job_id;
		int deadline;
		int profit;
		Job(char job_id, int deadline, int profit)
		{
			this.deadline = deadline;
			this.job_id = job_id;
			this.profit = profit;
		}
	}

	static void printJobScheduling(ArrayList<Job> arr)
	{
		int n = arr.size();

		// sorting the array on the
		// basis of their deadlines
		Collections.sort(arr, (a, b) -> {
			return a.deadline - b.deadline;
		});

		// initialise the result array and maxHeap
		ArrayList<Job> result = new ArrayList<>();
		PriorityQueue<Job> maxHeap = new PriorityQueue<>(
			(a, b) -> { return b.profit - a.profit; });

		// starting the iteration from the end
		for (int i = n - 1; i > -1; i--) {
			int slot_available;
		
			// calculate slots between two deadlines
			if (i == 0) {
				slot_available = arr.get(i).deadline;
			}
			else {
				slot_available = arr.get(i).deadline
								- arr.get(i - 1).deadline;
			}

			// include the profit of job(as priority),
			// deadline and job_id in maxHeap
			maxHeap.add(arr.get(i));

			while (slot_available > 0
				&& maxHeap.size() > 0) {

				// get the job with max_profit
				Job job = maxHeap.remove();

				// reduce the slots
				slot_available--;

				// include the job in the result array
				result.add(job);
			}
		}

		// jobs included might be shuffled
		// sort the result array by their deadlines
		Collections.sort(result, (a, b) -> {
			return a.deadline - b.deadline;
		});
	
		for (Job job : result) {
			System.out.print(job.job_id + " ");
		}
	
		System.out.println();
	}

	// Driver's Code
	public static void main(String[] args)
	{
		ArrayList<Job> arr = new ArrayList<Job>();

		arr.add(new Job('a', 2, 100));
		arr.add(new Job('b', 1, 19));
		arr.add(new Job('c', 2, 27));
		arr.add(new Job('d', 1, 25));
		arr.add(new Job('e', 3, 15));
	
		System.out.println("Following is maximum "
						+ "profit sequence of jobs");

		// Function call
		printJobScheduling(arr);
	}
}

// This code is contributed by Karandeep Singh

 */
