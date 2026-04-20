package com.practice.string;

public class RunLengthEncoding {

    public static void countAndSay(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println("");
            return;
        }
        
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {
                sb.append(count).append(chars[i]);
                count = 1;
            }
        }
        
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String s = "3322251";
        System.out.println("**** Run Length Encoding - to compress the string ****");
        countAndSay(s);  // Outputs: 332251
    }
}