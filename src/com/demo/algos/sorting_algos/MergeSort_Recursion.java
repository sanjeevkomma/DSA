package com.demo.algos.sorting_algos;

/***

Approach = Divide and Conquer

Definition = The merge sort algorithm is based on the principle of divide and conquer algorithm where a problem is divided into multiple sub-problems. 

Each sub-problem is solved individually and finally, sub-problems are combined to form the final solutions

Time Complexity = O(nlogn)

Space Complexity = Auxiliary space + Input size = O(n) , as we're creating temporary arrays in every recursive call

Steps :

step 1: start
step 2: declare array and left, right, mid variable 
step 3: perform merge function.
        mergesort(array,begIndex,endIndex)
        mergesort(array, begIndex, endIndex)
        if begIndex > endIndex
        return
        midIndex=(begIndex+endIndex)/2
        mergesort(array, begIndex, midIndex)
        mergesort(array, midIndex+1, endIndex)
        merge(array, begIndex, midIndex, endIndex)
step 4: Stop

**/

public class MergeSort_Recursion { // Function to merge the sub arrays of arr[]  

	public static void main( String args[])  {  

		int arr[] = { 222, 0, -11, 30, 24, -7, 31, 16, 39 };  

		mergeSort(arr, 0, arr.length - 1);  

		System.out.println("After sorting array elements are - ");  

		printArray(arr);  

	}  

	static void mergeSort( int arr[], int begIndex, int endIndex ) {  

		if ( begIndex < endIndex )   {  

			int midIndex = ( begIndex + endIndex ) / 2;  

			mergeSort(arr, begIndex, midIndex);  

			mergeSort(arr, midIndex + 1, endIndex);  

			merge(arr, begIndex, midIndex, endIndex);  
		}  
	}

	static void  merge( int arr[], int begIndex, int midIndex, int endIndex )   {    

		int i, j, k;  

		int leftArrayLength = midIndex - begIndex + 1;    

		int rightArrayLength = endIndex - midIndex;    

		/* temporary Arrays */  

		int leftArray[] = new int[leftArrayLength];  

		int rightArray[] = new int[rightArrayLength];  

		/* copy data to temp arrays */  
		for ( i = 0; i < leftArrayLength; i ++ ) {   

			leftArray[i] = arr[begIndex + i];   
			
		} 

		for ( j = 0; j < rightArrayLength; j ++ )  {  

			rightArray[j] = arr[midIndex + 1 + j];  
			
		}  

		i = 0; /* initial index of first sub-array */  

		j = 0; /* initial index of second sub-array */   

		k = begIndex;  /* initial index of merged sub-array */  

		while ( i < leftArrayLength && j < rightArrayLength )  {    

			if( leftArray[i] <= rightArray[j] ) {    

				arr[k] = leftArray[i];    

				i ++;    
			}    

			else {    

				arr[k] = rightArray[j];    

				j ++;    
			}    

			k ++;    
		}    

		while ( i < leftArrayLength )  {    

			arr[k] = leftArray[i];    

			i ++;    

			k ++;    
		}    

		while (j < rightArrayLength)  {    

			arr[k] = rightArray[j];    

			j ++;    

			k ++;    
		}    
	}    

	static void printArray(int arr[] )  {  

		for  ( int i = 0; i < arr.length; i ++ )  

			System.out.print(arr[i] + " ");  
	}  

}  