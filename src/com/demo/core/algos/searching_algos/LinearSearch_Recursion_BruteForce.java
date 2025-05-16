package com.demo.core.algos.searching_algos;

public class LinearSearch_Recursion_BruteForce {

    // Recursive method to search for a key in the array
    public static int linearSearch(int arr[], int index, int input) {
        // Base case: if index reaches array length, element not found
        if (index == arr.length) {
            return -1;
        }
        // If element is found at the current index
        if (arr[index] == input) {
            return index;
        }
        // Recursive call to check the next element
        return linearSearch(arr, index + 1, input);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int input = 30;

        int result = linearSearch(arr, 0, input);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
