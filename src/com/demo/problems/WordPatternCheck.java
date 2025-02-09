package com.demo.problems;

/*
Question : Word Pattern Check
Approach: HashMap
Input : String pattern = "abba" ; String str = "dog cat cat dog";
Output : true
Time Complexity : O(n)
Space Complexity :
*/

import java.util.HashMap;
import java.util.Map;

public class WordPatternCheck {

    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (!map1.getOrDefault(ch, word).equals(word) || !map2.getOrDefault(word, ch).equals(ch)) {
                return false;
            }
            map1.put(ch, word);
            map2.put(word, ch);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(wordPattern("abba", "dog dog dog dog")); // false
    }
}