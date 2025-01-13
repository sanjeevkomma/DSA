package com.demo.algos.brute_force_algos;

/*
Input : String input = "ABC";
Output :
ABC
ACB
BAC
BCA
CAB
CBA
 */
public class BruteForce_Permutations {
    public static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, result + ch);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        permute(input, "");
    }
}

