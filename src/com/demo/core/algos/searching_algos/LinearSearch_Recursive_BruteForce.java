package com.demo.core.algos.searching_algos;

public class LinearSearch_Recursive_BruteForce {

    // Recursive method to search for a key in the array
    public static int linearSearch(int[] arr, int index, int key) {
        // Base case: if index reaches array length, element not found
        if (index == arr.length) {
            return -1;
        }
        // If element is found at the current index
        if (arr[index] == key) {
            return index;
        }
        // Recursive call to check the next element
        return linearSearch(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        int result = linearSearch(arr, 0, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
