package com.practice.array;

public class BuySellStockMaxProfitOnePass {
	
	public static void buySellStockMaxProfit(int[] nums) {
		
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i]<minPrice) {
				minPrice = nums[i];
			}
			maxProfit = Math.max(nums[i]-minPrice, maxProfit);
			
			
		}
		
		System.out.println(maxProfit);
	}

	public static void main(String[] args) {
		
	int[] nums = {7,1,5,3,6,4}; 
		
	// this solution solves in O(n)

	buySellStockMaxProfit(nums);

	}

}
