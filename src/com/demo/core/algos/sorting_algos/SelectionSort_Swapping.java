package com.demo.core.algos.sorting_algos;

/*
Approach =
Time Complexity = O(n2)
Space Complexity = O(1)
*/

public class SelectionSort_Swapping {

    public static void main(String args[]){
        int arr[] = {6,3,2,11,7,1};
        int resultArr[] = selectionSort(arr);
        for(int num : resultArr ) {
            System.out.print(num + " "); // 1 2 3 6 7 11
        }
    }

    static int[] selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // INNER LOOP to find min index ( minimum value )
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}