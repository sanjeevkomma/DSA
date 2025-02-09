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

            Map<Object, Integer> map = new HashMap<Object, Integer>();

            for (int i = 0; i < words.length; i++) {
                char ch = pattern.charAt(i);
                String word = words[i];
                // Check if both character and word have the same last index
                Integer charIndex = map.put(ch, i);
                Integer wordIndex = map.put(word, i);
                if (charIndex != null && !charIndex.equals(wordIndex)) {
                    return false;
                }
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