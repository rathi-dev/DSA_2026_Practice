package com.practice.string;

public class RotateString {
	
	public static void rotateString(String s1, String s2) {
		
		s1 = s1 + s1;
		
		System.out.println(s1);
		
		System.out.println(s1.indexOf(s2));
		
	}

	public static void main(String[] args) {
		
		rotateString("abcde","deae");
		
		// this is O(n) solutions

	}

}


