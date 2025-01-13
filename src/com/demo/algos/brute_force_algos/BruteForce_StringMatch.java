package com.demo.algos.brute_force_algos;

/*
Input : String text = "abracadabra"; String pattern = "cad";
Output : Pattern found at index: 4
 */
public class BruteForce_StringMatch {

    public static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i; // Pattern found at index i
            }
        }
        return -1; // Pattern not found
    }

    public static void main(String[] args) {
        String text = "abracadabra";
        String pattern = "cad";
        int index = search(text, pattern);

        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found.");
        }
    }
}

