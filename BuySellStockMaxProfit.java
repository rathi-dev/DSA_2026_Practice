package com.practice.array;

public class BuySellStockMaxProfit {
	
	public static void buySellStockMaxProfit(int[] nums) {
		
	    int maxProfit = 0;

        // Try every pair of buy and sell days
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int profit = nums[j] - nums[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }

      //  return maxProfit;
		
		System.out.println(maxProfit);
		
	}

	public static void main(String[] args) {
		int[] nums = {7,1,5,3,6,4};
		
		// this solution solves in O(n^2) 

		buySellStockMaxProfit(nums);
	}

}
