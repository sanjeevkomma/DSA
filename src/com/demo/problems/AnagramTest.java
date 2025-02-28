package com.demo.problems;

import java.util.HashMap;
import java.util.Map;

/*
Question : check if two strings are anagrams
Approach: Using Frequency Count
Input : String str1 = "listen", str2 = "silent";
Output : true
Time Complexity : O(n)
Space Complexity : O(1)
*/
public class AnagramTest {

    public static void main(String args[]) {
        String str1 = "listen", str2 = "silent";
        System.out.println(areAnagrams(str1, str2));
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str2.toCharArray()) {
            if (!frequencyMap.containsKey(ch) || frequencyMap.get(ch) == 0) {
                return false;
            }
            frequencyMap.put(ch, frequencyMap.get(ch) - 1);
        }
        return true;
    }
}