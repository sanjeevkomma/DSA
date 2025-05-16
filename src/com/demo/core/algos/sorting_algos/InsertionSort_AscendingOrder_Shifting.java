package com.demo.core.algos.sorting_algos;

/*
Approach =
Time Complexity = O(n2)
Space Complexity = O(1)
*/

public class InsertionSort_AscendingOrder_Shifting {

    public static void main(String args[]) {
        int arr[] = {3, 16, 2, 11, 5};
        insertionSort(arr);
        for (int num : arr)
            System.out.print(num + " "); // 2 3 5 11 16
    }

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead.
            // For Shifting
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = temp;
        }
    }
}