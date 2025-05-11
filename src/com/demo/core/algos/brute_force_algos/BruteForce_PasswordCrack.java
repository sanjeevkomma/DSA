package com.demo.core.algos.brute_force_algos;

/*
Input : String password = "abc";
Output : Password found: abc
 */
public class BruteForce_PasswordCrack {

    public static void crackPassword(String target) {
        char[] charset = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int length = 1; length <= 5; length++) {
            if (generate("", target, charset, length)) {
                return;
            }
        }
    }

    private static boolean generate(String prefix, String target, char[] charset, int length) {
        if (length == 0) {
            if (prefix.equals(target)) {
                System.out.println("Password found: " + prefix);
                return true;
            }
            return false;
        }
        for (char c : charset) {
            if (generate(prefix + c, target, charset, length - 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String password = "abc";
        crackPassword(password);
    }
}

