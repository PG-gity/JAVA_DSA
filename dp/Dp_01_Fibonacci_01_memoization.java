package dp;

import java.util.*;

public class Dp_01_Fibonacci_01_memoization {

	//Not running properly for 0 ,1 using array list check why 
//	public static int dpFib(int n,ArrayList<Integer> dpMemo) {
//		
//		if(dpMemo.get(n) != -1)
//			return dpMemo.get(n);
//		
//		if(n<2)
//			dpMemo.add(n, n);
//		
//		
//		if(dpMemo.get(n) == -1)
//			dpMemo.add(n,dpFib(n-1,dpMemo)+dpFib(n-2,dpMemo));
//		
//		System.out.println(dpMemo);
//		
//		return dpMemo.get(n);
//		
//	}
	
	public static int dpFib(int n,int[] dpMemo) {
		
		if(dpMemo[n] != -1)
			return dpMemo[n];
		
		if(n<2)
			dpMemo[n]= n;
		
		if(dpMemo[n] == -1)
			dpMemo[n] = dpFib(n-1,dpMemo)+dpFib(n-2,dpMemo);
		
//		for(int i=0;i<dpMemo.length;i++)
//			System.out.print(dpMemo[i]+" ");
//		System.out.println();
		
		
		return dpMemo[n];
	}
	
	
	public static void main(String[] args) {
		
		int n=15;
		
		int[] dpMemoization = new int[n+1];
		
		Arrays.fill(dpMemoization, -1);
		
//		ArrayList<Integer> dpMemoization = new ArrayList<Integer>(n+1);
//		
//		for(int i=0;i<=n;i++)
//			dpMemoization.add(-1);
		
		
		System.out.println(dpFib(n,dpMemoization));
	}
}
