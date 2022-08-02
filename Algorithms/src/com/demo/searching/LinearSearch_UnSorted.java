package com.demo.searching;
/***

Approach = Iterative Approach

Time Complexity = O(n)

Space Complexity = Auxiliary space + Input size = O(1)

**/
public class LinearSearch_UnSorted {

	public static void main(String args[]) {  

		int arr[] = { 55, 29, -10, 40, 57, -41, 20, 24, 45 };  

		int val = -10; // value to be searched  

		int resultIndex = linearSearch_In_UnSortedArray( arr,  val );   

		if ( resultIndex == -1 )  

			System.out.println("Element is not present in the array");  

		else  

			System.out.println("Element is present at " + resultIndex +" position of array");  
	}  

	static int linearSearch_In_UnSortedArray( int arr[],  int val ) {  

		for ( int i = 0; i < arr.length ; i++ )  {  

			if ( arr[i] == val )  

				return i  ;  
		}  

		return -1;  
	}  

}  
