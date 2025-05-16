package com.demo.core.algos.searching_algos;
/*
Time Complexity : O(log n)
Space Complexity : O(1)
*/  

public class BinarySearch_Sorted_Iteration {
  
// Method to perform binary search iteratively
    public static int binarySearch(int[] arr, int target) {
       
      int low = 0;
      int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoids overflow

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
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
