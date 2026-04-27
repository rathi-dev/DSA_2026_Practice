package com.practice.array;

import java.util.Arrays;

public class RotateArray1 {
	
	public static void rotateArray(int[] nums,int k) {
		while(k>0) {
		
		for(int i=0;i<nums.length-1;i++) {
		int temp = nums[i];
		nums[i] = nums[i+1];
		nums[i+1] = temp;
		}
		k--;
		}
		
		Arrays.stream(nums).forEach(System.out::println); 
		
	}

	public static void main(String[] args) {

		System.out.println("**** Rotate the array for k steps ****");
		int nums[] = {2,1,3,4};
		rotateArray(nums,4);
	}

}
