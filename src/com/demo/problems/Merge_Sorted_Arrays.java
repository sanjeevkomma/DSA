package com.demo.problems;

import java.util.Arrays;

/*
Question : Merge Sorted Arrays
Approach: Two-Pointer Technique
Input : int[] a = {4, 8, 12};
        int[] b = {1, 3,56, 78, 99, 100};
Output : Merged Sorted Array: [1, 3, 3, 4, 8, 12, 56, 78, 99, 100]
Time Complexity : O(m + n)
Space Complexity : O(m + n)
*/
public class Merge_Sorted_Arrays {

    public static int[] mergeSortedArraysKeepDuplicates(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge both arrays using two-pointer approach
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        // Copy remaining elements from a (if any)
        while (i < m) {
            result[k++] = a[i++];
        }

        // Copy remaining elements from b (if any)
        while (j < n) {
            result[k++] = b[j++];
        }

        return result;
    }

    public static int[] mergeSortedArraysRemoveDuplicates(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int result[] = new int[m + n]; // Temporary array
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                if (k == 0 || result[k - 1] != a[i]) {
                    result[k++] = a[i];
                }
                i++;
            } else if (b[j] < a[i]) {
                if (k == 0 || result[k - 1] != b[j]) {
                    result[k++] = b[j];
                }
                j++;
            } else { // a[i] == b[j], add only one copy
                if (k == 0 || result[k - 1] != a[i]) {
                    result[k++] = a[i];
                }
                i++;
                j++;
            }
        }

        while (i < m) { // Remaining elements in a[]
            if (k == 0 || result[k - 1] != a[i]) {
                result[k++] = a[i];
            }
            i++;
        }

        while (j < n) { // Remaining elements in b[]
            if (k == 0 || result[k - 1] != b[j]) {
                result[k++] = b[j];
            }
            j++;
        }

        return Arrays.copyOf(result, k); // Resize to final size
    }

    public static void main(String[] args) {
        int[] a = {4, 8, 12};
        int[] b = {1, 3, 56, 56, 78, 99, 100};
        int[] mergedArray = mergeSortedArraysKeepDuplicates(a, b);
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }
}
