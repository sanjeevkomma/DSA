package com.demo.sorting;

/***

Approach = Divide and Conquer

Definition = 

Time Complexity = O(n2)

Space Complexity = Auxiliary space + Input size = O(logn)

Steps :

Choosing Pivot :

1) Pivot can be random, i.e. select the random pivot from the given array.
2) Pivot can either be the rightmost element of the leftmost element of the given array.
3) Select median as the pivot element


 **/

public class QuickSort_Recursion_Swapping {

	public static void main(String[] args) {

		int arr[] = { 222, 0, -11, 30, 24, -7, 31, 16, 39 };  

		quickSort(arr, 0, arr.length - 1);  

		System.out.println("After sorting array elements are - ");  

		printArray(arr);
	}


	static void quickSort(int arr[], int beginIndex, int endIndex) {

		if ( beginIndex < endIndex ) { 

			int pivotIndex = partition(arr, beginIndex, endIndex);

			quickSort(arr, beginIndex, pivotIndex - 1);

			quickSort(arr, pivotIndex + 1, endIndex);

		}

	}

	static int partition(int arr[], int beginIndex, int endIndex){

		int pivot = arr[endIndex];
		
		int pivotIndex = beginIndex - 1 ;

		for( int i = beginIndex; i <= endIndex - 1; i ++ ){

			if ( arr[i] < pivot ){

				pivotIndex ++;

				swap(arr, pivotIndex, i);
			}
		}

		swap(arr, pivotIndex + 1, endIndex);
		
		return pivotIndex + 1 ;

	}

	static void swap(int[] arr, int i, int j){

		int temp = arr[i];

		arr[i] = arr[j];

		arr[j] = temp;

	}

	static void printArray(int arr[] )  {  

		for  ( int i = 0; i < arr.length; i ++ )  

			System.out.print(arr[i] + " ");  
	}  

}
