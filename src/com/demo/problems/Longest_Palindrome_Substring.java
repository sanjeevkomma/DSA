package com.demo.problems;

// palindroms : aa , aca , cabac

// Longest is : cabac

// Using Two Pointers (Expand Around Center) technique

/*
  Time-Complexity : O(n2)
  Space-Complexity : O(1)
 */

/*  Why “Expand Around Center”?
      * A palindrome mirrors around its center.
      * There are 2n - 1 centers to consider (n odd + n-1 even)
      * From each center, expand outward to find the longest palindrome
 */

public class Longest_Palindrome_Substring {

    public static void main(String[] args) {

        String str = "aacabac";

        System.out.println("longest palindrome is: " + longestPalSubstr(str));
    }

    static String longestPalSubstr(String str) {
        if (str == null || str.length() < 1) {
            return "";
        }

        int startIndex = 0, endIndex = 0; // Variables to track the start and end of the longest palindrome

        for (int i = 0; i < str.length(); i++) {
            // Check odd-length palindromes (single character center)
            int len1 = expandAroundCenter(str, i, i); // length of the odd-length palindrome

            // Check even-length palindromes (two character center)
            int len2 = expandAroundCenter(str, i, i + 1); // length of the even-length palindrome

            int len = Math.max(len1, len2); // Maximum of both lengths

            // Update start and end if a longer palindrome is found
            if (len > endIndex - startIndex) {
                startIndex = i - (len - 1) / 2;
                endIndex = i + len / 2;
            }
        }

        return str.substring(startIndex, endIndex + 1); // Return the longest palindrome substring
    }

    // Helper method to expand around the center and find the length of the palindrome
    static int expandAroundCenter(String str, int leftIndex, int rightIndex) {
        while (leftIndex >= 0 && rightIndex < str.length() && str.charAt(leftIndex) == str.charAt(rightIndex)) {
            leftIndex --;
            rightIndex ++;
        }
        return rightIndex - leftIndex - 1; // Return the length of the palindrome
    }

    // Optional method to find only the length of the longest palindrome
    static int longestPalSubstrLength(String str) {
        String longestPalindrome = longestPalSubstr(str);
        return longestPalindrome.length();
    }
}
