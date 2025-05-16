package com.demo.core.algos.sorting_algos;

/*
Approach = Swapping Approach
Time Complexity = O(n2)
Space Complexity = Auxiliary space + Input size = O(1) ( in-place sorting )
*/

public class BubbleSort_Swapping {

	public static void main(String[] args) {    

		int arr[] = { 35, 10, -31, -11, 26 };

		bubbleSort_With_Swapping(arr);  

		print(arr);  

	} 

	static void bubbleSort_With_Swapping ( int arr[] )  {   // function to implement bubble sort in ascending order with swapping approach

		for ( int i = 0; i < arr.length; i++ )  {  // n

			for ( int j = i + 1; j < arr.length; j++ )   {  // n

				if ( arr[i] > arr[j] )  {  

					int temp = arr[i];  

					arr[i] = arr[j];  

					arr[j] = temp;  
				}  
			}  
		}  
	}  
	
	static void print ( int arr[] ) {  // function to print array elements  

		for ( int i = 0; i < arr.length; i++ )  {  

			System.out.print( arr[i] + " " );  
		}         
	}  

}