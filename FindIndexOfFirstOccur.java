package com.practice.string;

public class FindIndexOfFirstOccur {
	
	 public static int findIndexOfFirstOccur(String haystack, String needle) {
	    
		// return haystack.indexOf(needle);
		 
		 int result = -1;
		 
		 int n = haystack.length(); 
		 int m = needle.length();
		 
		 for(int i=0;i<n-m;i++) {
			
			 int j = 0;
			 while(j < m &&  haystack.charAt(i + j) == needle.charAt(j)) {
			
				 j++;
			 }
			 
			 if(j==m) {
				 result = i;
			 }
	                
		 }
		 return result;
	 }

	public static void main(String[] args) {

		System.out.println("Find the index of first occurence in a string");
		String haystack = "1haystac";
		String needle = "hay";
		
		
		System.out.println(findIndexOfFirstOccur(haystack,needle));
	}

}
