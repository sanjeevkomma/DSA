package com.demo.core.algos.searching_algos;

public class LinearSearch_Sorted_BruteForce {
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the first match
            }
            // Optimization: stop if current element is greater (ascending order only)
            if (arr[i] > target) {
                break;
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int sortedArr[] = {1, 3, 5, 7, 9, 11}; // Sorted array
        int target = 7;

        int result = linearSearch(sortedArr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
