package com.demo.core.algos.dynamic_programming_algos;

import java.util.HashMap;
import java.util.Map;

/*

* Approach : Dynamic Programming (Memoization)
* Time Complexity : O(n)

* Output: The 6-th Fibonacci number is: 8

 */
public class NthFibonacciNumber_Memoization {

    private Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, fib(n - 1) + fib(n - 2));
        }
        return memo.get(n);
    }
    public static void main(String[] args) {
        NthFibonacciNumber_Memoization fibCalc = new NthFibonacciNumber_Memoization();
        int n = 6;
        System.out.println("The " + n + "-th Fibonacci number is: " + fibCalc.fib(n));
    }
}
