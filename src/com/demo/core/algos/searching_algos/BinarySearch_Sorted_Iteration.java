package com.demo.core.algos.searching_algos;
/*
Time Complexity = O(log n)
Space Complexity = O(1)
*/

public class BinarySearch_Sorted_Iteration {

    // Method to perform binary search iteratively
    public static int binarySearch(int arr[], int target) {

        int beginIndex = 0;
        int endIndex = arr.length - 1;

        while (beginIndex <= endIndex) {

            int midIndex = (beginIndex + endIndex) / 2;

            if (arr[midIndex] == target) {
                return midIndex; // target found
            } else if (arr[midIndex] < target) {
                beginIndex = midIndex + 1; // search right half
            } else {
                endIndex = midIndex - 1; // search left half
            }
        }

        return -1; // target not found
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}