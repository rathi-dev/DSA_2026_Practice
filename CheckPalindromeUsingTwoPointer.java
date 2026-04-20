package com.practice.string;

public class CheckPalindromeUsingTwoPointer {

    public static boolean checkPalindrome(String s) {
        s = s.toLowerCase();
        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            char c1 = s.charAt(leftIndex);
            char c2 = s.charAt(rightIndex);

            // skip non-alphanumeric from left
            if (!Character.isLetterOrDigit(c1)) {
                leftIndex++;
            }
            // skip non-alphanumeric from right
            else if (!Character.isLetterOrDigit(c2)) {
                rightIndex--;
            }
            // now both are alphanumeric, compare
            else if (c1 == c2) {
                leftIndex++;
                rightIndex--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(word)); // prints true
    }
}