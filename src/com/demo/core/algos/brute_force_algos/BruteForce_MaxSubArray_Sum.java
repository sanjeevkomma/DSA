package com.demo.core.algos.brute_force_algos;

/*
Input : int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
Output : Maximum SubArray Sum: 6
 */
public class BruteForce_MaxSubArray_Sum {

    public static int maxSubArraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum = currentSum + nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(nums));
    }
}
