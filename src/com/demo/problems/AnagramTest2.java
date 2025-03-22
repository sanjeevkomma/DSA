package com.demo.problems;

public class AnagramTest2 {

    public static void main(String args[]) {
        String str1 = "teb", str2 = "eat";
        System.out.println("isAnagram :: " + isAnagram(str1, str2));
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        int counter = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str2.indexOf(str1.charAt(i)) != -1) {
                counter ++;
            }
        }
        if (counter == str1.length()) {
            return true;
        }
        return false;
    }
}