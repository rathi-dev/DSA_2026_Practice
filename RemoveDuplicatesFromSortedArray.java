package com.practice.array;

import java.util.Arrays;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class RemoveDuplicatesFromSortedArray {
	
	// use a two pointer solution
	
	
	
	
	public static void removeDuplicatesSortedArray1(int [] nums) {
		
		int insertPos = 1;
		for(int i=1;i<nums.length;i++) {
			
			if(nums[i]!=nums[insertPos-1]) {
				nums[insertPos] = nums[i];
				insertPos++;
			}
		}
		
		System.out.println(insertPos);
	}
	
	public static void removeDuplicatesSortedArray2(int [] nums) {
		
		for(int i=0;i<nums.length-1;i++) {
		    
			if(nums[i]==nums[i+1]) {
			nums[i] = nums[i];
			}
		}
	}

	public static void main(String[] args) {

		System.out.print("*** Remove duplicates from sorted array");
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		
		//Arrays.sort(nums);
		
		removeDuplicatesSortedArray1(nums);
		
		Arrays.stream(nums).forEach(System.out::print);
		
		
		
	}

}
