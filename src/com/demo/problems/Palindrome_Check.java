package com.demo.problems;

/**
 * Question : Palindrome Check
 * Approach : Two-Pointer Technique
 * Input : String str = "cabac";
 * Output : true
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */

public class Palindrome_Check {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "cabac";
        System.out.println(isPalindrome(str));
    }
}