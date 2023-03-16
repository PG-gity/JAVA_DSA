package part_04_DSA_Advance_04_Arrays;



public class Arrays_06_StockBuyAndSell_01_Naive {

	static int maxProfit(int price[],int start, int end) {
		
		if(end<=start)
			return 0;
		
		int profit=0;
		
		for(int i = start; i < end; i++) {
			
			for(int j = i + 1; j <= end;j++) {
				
				if(price[j] > price[i]) {
					
									//profit from j and i
					int cur_profit =   price[j] - price[i] 
									//profit left of range(i,j)
								   + maxProfit(price,start,i-1)
								   //profit right of range(i,j)
								   + maxProfit(price,j+1,end);
					
					profit= Math.max(profit, cur_profit);
					
				}
				
			}
			
		}
		
		return profit;
		
	}
	
	public static void main(String[] args) {
		
		int price[] = {1,5,3,8,12};
		
		System.out.println(maxProfit(price,0,price.length-1));
		
	}

}
