package com.practice.array;

import java.util.Arrays;

public class FindMajorityElement {

	public static void findMajorityElement(int[] nums) {

		int maxFreq = 0;
		
		int currMax = 1;
		
		Arrays.sort(nums);
		
		
		
		for(int i = 0; i < nums.length - 1 ; i++) {
		  if(nums[i+1]== nums[i]) {
			  currMax++;
			  maxFreq = Math.max(maxFreq, currMax); 
		  }
		  else {
			  currMax = 1;
		  }
		}
		
		
		System.out.println(maxFreq);

	}

	public static void main(String[] args) {

		System.out.println("**** Find the majority element in the array using different ways ***** ");
		int[] nums = { 2, 2, 1, 2, 1,0,2,3,3 };// 2 is 3 times, 1 is 2  times, 0 is 1 times
		findMajorityElement(nums);
	}
}

