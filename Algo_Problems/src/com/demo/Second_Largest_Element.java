package com.demo.algos;

/** Complexity Analysis :
 
Approach : Swapping  
 
Space Complexity = Auxiliary Space + Space taken by input size

1) Time Complexity = O(n log n) 
2) Auxiliary Space =  O(1)
3) Space Complexity = 

*/

public class Second_Largest_Element {

	public static void main(String[] args) {

		int arr[] = { 12, 435, -1, 15, -84, 10 }; // 15

		secondLargestElement_In_UnSortedArray(arr);

	}

	public static void secondLargestElement_In_UnSortedArray( int arr[]  ) {

		int firstElement = 0 , secondElement = 0 ;
		
		for ( int i = 0; i < arr.length; i++ ) {

			if ( firstElement < arr[i] ) {

				secondElement = firstElement; // Swapping

				firstElement = arr[i];  // second = 0,  first = 12
				                        // second = 12, first = 435
				                        // second = 15, first = 435
				                        // second = 84, first = 435
			}

			else if ( firstElement !=  arr[i] && secondElement < arr[i] )   

				secondElement = arr[i];
		}

		if ( secondElement == 0 )

			System.out.print( "There is no second largest" );

		else   System.out.print( "The second largest element ::  " + secondElement );
	}

}