package part_04_DSA_Advance_17_Greedy;


import java.util.*;


// Let's define Item class and sort It as per w/v:
class Item implements Comparable<Item>{
	int weight,value;
	public Item(int w,int v) {
		this.weight=w;
		this.value=v;
		
	}
	public int compareTo(Item i) {
		
		return ((i.value*this.weight)-(this.value*i.weight));
		
//		Acutely for above line: (i.value/i.weight)-(this.value/this.weight) >= 0
//		solve it then we shall get above return value		
	}
 
}

public class Greedy_03_Fractional_Knapsack {
	
	public static double fracKnapsack(Item items[],int w) {
		
		Arrays.sort(items);
		
		//To verify items(if sorted):
//		for(int i=0;i<items.length;i++) {
//			System.out.println(items[i].weight+", "+items[i].value);
//		}
		
		
		double res=0.0;//for value
		
		for(int i=0;i<items.length-1;i++) {
			if(items[i].weight<=w) {
				
				res+=items[i].value;
				
				w=w-items[i].weight;
			}
			else if(items[i].weight>w) {
					  // (remaining w) * (item's value per weight)
				res+=(w*(items[i].value/items[i].weight));
			}
		}
		
		return res;
	}
	
	
	public static void main(String []args) {

		int n=4;
		Item arr[] = { new Item(10,60),
					   new Item(40,40),
					   new Item(20,100),
					   new Item(30,120)
				
					};
		
/*		
		int[] wt = {1,2,3,4};
		
		int[] v = {4,3,2,1};
		
		Item[] arr= new Item[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i] =new Item(wt[i],v[i]);
			
		}
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i].weight+", "+arr[i].value);
	}
*/		
		
		int knapsackWeight=50;
		System.out.println(fracKnapsack(arr,knapsackWeight));


		
		
	}

}
