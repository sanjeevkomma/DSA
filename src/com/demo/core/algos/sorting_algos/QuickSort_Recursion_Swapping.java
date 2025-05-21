package com.demo.core.algos.sorting_algos;

/*
Approach = Divide and Conquer
Definition =
Time Complexity = O(n2)(worst case) or O(nlogn)(best case)
Space Complexity = Auxiliary space + Input size = O(logn)

Steps :
Choosing Pivot :
1) Pivot can be random, i.e. select the random pivot from the given array.
2) Pivot can either be the rightmost element or the leftmost element of the given array.
3) Select median as the pivot element
 */

public class QuickSort_Recursion_Swapping {

	public static void main(String[] args) {
		int arr[] = { 222, 0, -11, 30, 24, -7, 31, 16, 39 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("After sorting array elements are - ");
		printArray(arr); // -11 -7 0 16 24 30 31 39 222
	}


	static void quickSort(int arr[], int beginIndex, int endIndex) {
		if (beginIndex < endIndex) {
			int pivotIndex = getPivotIndexByPartition(arr, beginIndex, endIndex);
			quickSort(arr, beginIndex, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, endIndex);
		}
	}

	static int getPivotIndexByPartition(int arr[], int beginIndex, int endIndex){
		int pivotElement = arr[endIndex];
		int pivotIndex = beginIndex - 1 ;
		for(int i = beginIndex; i <= endIndex - 1; i ++){
			if (arr[i] < pivotElement){
				pivotIndex ++;
				swap(arr, pivotIndex, i);
			}
		}
		swap(arr, pivotIndex + 1, endIndex);
		return pivotIndex + 1 ;
	}

	static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void printArray(int arr[])  {
		for (int num : arr)
			System.out.print(num + " ");
	}
}