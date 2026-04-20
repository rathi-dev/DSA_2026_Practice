package com.practice.array;

import java.util.Arrays;

public class ProductExceptSelf {
	
	public static void productExceptSelf(int [] nums) {
		
		int [] result = new int [nums.length];
		
		for(int i = 0; i < nums.length; i ++) {
			int prod = 1 ;
			int j = nums.length -1 ;
			
			while(j > 0) {
				if(j !=i ) {
					prod = prod * nums[j];
				}
				j--;
			}
			
			//System.out.println(prod);
			result[i] = prod;
		}
		
		Arrays.stream(result).forEach(a->System.out.print(a+" "));
		
	}

	public static void main(String[] args) {
		int [] nums = {1, 2, 4, 2};
		
		System.out.println(" product of all elements of array except self");
		productExceptSelf(nums);
		
		

	}

}
