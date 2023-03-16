package part_04_DSA_Advance_17_Greedy;



import java.util.*;
public class Greedy_01_minNoOfCoins {
										//v=value of amount
	public static int minCoins(int coins[], int v) {
		
		
		Arrays.sort(coins);
		int res=0;
		for(int i=coins.length-1;i>=0;i--) {
			if(coins[i]<=v) {
				int c=(int)Math.floor(v/coins[i]);
				
				res=res+c;
				v=v-(coins[i]*c);
				
			}
			if(v==0)
				break;
		}
		
	
		
		return res;
	}

	public static void main(String[] args) {
		
		int coins[]= {5,10,2,1};
		int amount=57;
		System.out.println(minCoins(coins,amount));

	}

}
