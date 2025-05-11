package com.demo.core.algos.manacher_algos;

/*
    * Time-Complexity : O(n)
 */
public class Longest_Palindrome_Substring {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        // Transform the string: insert '#' between each character and at the ends
        StringBuilder t = new StringBuilder("^");
        for (char c : s.toCharArray()) {
            t.append("#").append(c);
        }
        t.append("#$");

        char[] transformed = t.toString().toCharArray();
        int[] p = new int[transformed.length];
        int center = 0, right = 0;

        for (int i = 1; i < transformed.length - 1; i++) {
            int mirror = 2 * center - i;  // Mirror of i around center

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Try to expand palindrome centered at i
            while (transformed[i + (1 + p[i])] == transformed[i - (1 + p[i])]) {
                p[i]++;
            }

            // Update center and right boundary if expanded past it
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }

        // Find the max palindrome length
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < p.length - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        String input = "babad";
        String result = longestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}

