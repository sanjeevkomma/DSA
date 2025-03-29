package com.demo.patterns.TopKElements;

import java.util.Arrays;

/*

Time Complexity: O(NlogN) for sorting
Space Complexity: O(1) if sorting is done in-place

 */

public class TopKElements_Sorting {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array
        return nums[nums.length - k]; // k-th largest element
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 4;

        TopKElements_Sorting solution = new TopKElements_Sorting();
        int result = solution.findKthLargest(nums, k);

        System.out.println("The " + k + "-th largest element is: " + result);
        // Output: The 2-th largest element is: 5
    }
}
