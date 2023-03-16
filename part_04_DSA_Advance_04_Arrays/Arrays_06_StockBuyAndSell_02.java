package part_04_DSA_Advance_04_Arrays;

public class Arrays_06_StockBuyAndSell_02 { // Efficient

	static int maxProfit(int[] price) {
		
		int profit=0;
		
		for(int i=1;i<price.length;i++) {
			
			if(price[i]>price[i-1]) {
				
				profit+=(price[i]-price[i-1]);
				
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		
		int price[] = {1,5,3,8,12};
		
		System.out.println(maxProfit(price));
		
		
	}

}
