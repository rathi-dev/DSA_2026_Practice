package com.practice.string;

public class CheckPalindrome {
	
	public static void checkPalindrome(String s) {
		
		char [] chars = s.toLowerCase().toCharArray();
		
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<chars.length; i++) {
			if(Character.isLetterOrDigit(chars[i])) {
				sb1.append(chars[i]);
			}
		}
		for(int i=chars.length -1 ; i >= 0; i--) {
			if(Character.isLetterOrDigit(chars[i])) {
				sb2.append(chars[i]);
			}
		}
		
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1.toString().equals(sb2.toString()));
		
	}

	public static void main(String[] args) {
		
		String word = "A man, a plan, a canal: Panama";
		
		checkPalindrome(word);

	}
}
