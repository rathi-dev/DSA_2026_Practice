package com.practice.string;

import java.util.Arrays;
import java.util.HashMap;

public class CheckAnagram {
	
	public static void checkAnagramUsingHashSet(String s1, String s2) {
		
		char[] s1Chars = s1.toLowerCase().toCharArray();
		char[] s2Chars = s2.toLowerCase().toCharArray();
		
		HashMap<Character,Integer> hm1 = new HashMap<>();
		for(char c : s1Chars) {
			hm1.put(c, hm1.getOrDefault(hm1, 0)+1);
		}
		
		HashMap<Character,Integer> hm2 = new HashMap<>();
		for(char c : s2Chars) {
			hm2.put(c, hm2.getOrDefault(hm2, 0)+1);
		}
		
		System.out.println(hm1.equals(hm2));
	}
	
    public static void checkAnagram(String s1, String s2) {
	
    	char[] s1Chars = s1.toLowerCase().toCharArray();
		char[] s2Chars = s2.toLowerCase().toCharArray();
		
		Arrays.sort(s1Chars);
		Arrays.sort(s2Chars);
		
		System.out.println(Arrays.equals(s1Chars, s2Chars));
	}
    
    // s.charAt(i) - 'a' gives the count.. 

	public static void main(String[] args) {

		
		String s1 = "anagram";
		String s2 = "nagaram";
		
		checkAnagram(s1, s2);
		
	}

}
