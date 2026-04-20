package com.practice.string;

public class ReverseString {
	
	  public static void reverseString(char[] s) {
	        
	        
	        for(int i=0;i<s.length/2;i++){
	            char temp = s[i];
	            s[i] = s[s.length-i-1];
	            s[s.length-i-1] = temp;
	        }
	        
	        for(char ch : s) {
	        	System.out.println(ch);
	        }
	    }
	  
	public static void main(String[] args) {

		System.out.println("*** Reverse a String****");
		char [] s = {'h','e','l','l','o'};
		reverseString(s);
	}

}
