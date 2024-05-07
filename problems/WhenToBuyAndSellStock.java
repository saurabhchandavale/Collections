package com.problems;

public class WhenToBuyAndSellStock {
	
	public int maxProfit(int arr[]) {
		int buy_price = arr[0];
		int profit = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < buy_price) {
				buy_price =  arr[i];
			}else {
				int current_profite = arr[i] - buy_price;
				profit = Math.max(profit, current_profite);
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhenToBuyAndSellStock c = new WhenToBuyAndSellStock();
		int arr[] = {7,1,3,5,6,4,7,0,8};
		int maxProfit = c.maxProfit(arr);
		System.out.println(maxProfit);
		
	}

}
