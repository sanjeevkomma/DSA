package com.demo.algos.brute_force_algos;

/*
Input : int[] nums = {2, 7, 11, 15} , int target = 9;
Output : Pair found: (2, 7)
 */

public class BruteForce_TwoSum {

    public static void findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Pair found: (" + nums[i] + ", " + nums[j] + ")");
                    return;
                }
            }
        }
        System.out.println("No pair found.");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        findTwoSum(nums, target);
    }
}
