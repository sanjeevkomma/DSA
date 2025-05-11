package com.demo.core.algos.brute_force_algos;

/*
Input : int number = 29;
Output : 29 is prime? true
 */
public class BruteForce_PrimeCheck {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 29;
        System.out.println(number + " is prime? " + isPrime(number));
    }
}

