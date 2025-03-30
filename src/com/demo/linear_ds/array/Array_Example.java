package com.demo.linear_ds.array;

// An array is a collection of elements of the same type stored in contiguous memory locations.
// Each element can be accessed by its index.
public class Array_Example {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int brr[] = {1,3, 5, 6, 8};

        // Accessing elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}
