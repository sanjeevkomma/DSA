package com.demo.problems;

import java.util.HashMap;
import java.util.Map;

/*
Question : Longest Unique Substring
Approach: Sliding Window + HashMap
Input : String input = "abcabcbb";
Output : Longest unique substring: abc
Time Complexity : O(n)
Space Complexity : O(min(n, 256))
*/
public class LongestUniqueSubstring {

    public static String findLongestUniqueSubstring(String str) {

        Map<Character, Integer> map = new HashMap<>();
        int leftIndex = 0, maxLength = 0, startIndex = 0;

        for (int rightIndex = 0; rightIndex < str.length(); rightIndex ++) {
            char currentChar = str.charAt(rightIndex);
            if (map.containsKey(currentChar)) {
                leftIndex = Math.max(map.get(currentChar) + 1, leftIndex);
            }
            map.put(currentChar, rightIndex);

            if (rightIndex - leftIndex + 1 > maxLength) {
                maxLength = rightIndex - leftIndex + 1;
                startIndex = leftIndex;
            }
        }
        return str.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest unique substring: " + findLongestUniqueSubstring(input));
    }
}