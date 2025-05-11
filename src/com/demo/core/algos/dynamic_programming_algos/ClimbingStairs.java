package com.demo.core.algos.dynamic_programming_algos;

/*

Approach: Fibonacci-based dynamic programming approach
---------
* The problem can be broken into sub problems:
     1. To reach step n, you must have arrived either from step n-1 (by climbing 1 step)
            or from step n-2 (by climbing 2 steps).
     2. This leads to the recurrence relation : dp[n] = dp[n−1] + dp[n−2]
     3. Base cases:
           i) dp[0] = 1 (1 way to be on the ground without climbing).
           ii) dp[1] = 1 (1 way to climb the first step)

Output: Number of ways to climb 5 stairs: 8


 */
public class ClimbingStairs {

    public static int climbStairs(int n) {

        if (n <= 1) return 1;

        int dp[] = new int[n + 1];
        dp[0] = 1; // Base case
        dp[1] = 1; // Base case

        for (int i = 2; i <= n; i ++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // Recurrence relation
        }
        return dp[n];
    }

    public static void main(String[] args) {

        int n = 5; // No of stairs

        System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n)); // Output: 8
    }
}

