package scaler.day31.additionalproblems;

public class BuySellStocks {

	/*Say you have an array, A, for which the ith element is the price of a given stock on day i.
	If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
	Return the maximum possible profit.*/


	//brute force
	public static int getMaxProfit(int[] a){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int profit=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min = a[i];
			}
			if(a[i]>max){
				max = a[i];
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==min){
				for(int j=i+1;j<a.length;j++){
					if (a[j] == max) {
						profit = max - min;
						break;
					}
				}
			}
		}
		return  profit;
	}


	//improve approach
	public static int getMaxProfit1(int[] a){
		int max = a[a.length-1];
		int profit = 0;
		for(int i= a.length-2;i>=0;i--){
			if(a[i]>max){
				max = a[i];
			}
			profit = Math.max(profit,(max-a[i]));
		}
		return  profit;
	}


	public static int getMaxProfit2(int[] a){
		int min = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i=0;i<a.length;i++){
			 min = Math.min(min,a[i]);
			 maxProfit = Math.max(maxProfit,(a[i]-min));
		}
		return  maxProfit;
	}

	public static void main(String[] args) {
		int[]a = {1, 4, 5, 2, 4};

		System.out.println("brute force");
		int profit = getMaxProfit(a);
		System.out.println(profit);

		System.out.println("approach 1");
		int profit1 = getMaxProfit1(a);
		System.out.println(profit1);

		System.out.println("approach 2");
		int profit2 = getMaxProfit2(a);
		System.out.println(profit2);
	}
}


