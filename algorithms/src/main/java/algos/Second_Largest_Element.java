package algos;

/** Complexity Analysis :

Space Complexity = Auxiliary Space + Space taken by input size

1) Time Complexity = O(n log n) 
2) Auxiliary Space =  O(1)
3) Space Complexity = 

*/

public class Second_Largest_Element {

	public static void main(String[] args) {

		int arr[] = { 12, 435, 1, 15, 84, 10 };

		secondLargestElement_InUnSortedArray(arr);

	}

	public static void secondLargestElement_InUnSortedArray( int arr[]  ) {

		int firstElement, secondElement ;
		
		firstElement = secondElement = 0 ;

		if ( arr.length < 2 ) {

			System.out.print(" Invalid Input ");

			return ;
		}

		for ( int i = 0; i < arr.length; i++ ) {

			if ( arr[i] > firstElement ) {

				secondElement = firstElement;

				firstElement = arr[i];
			}

			else if ( arr[i] > secondElement && arr[i] != firstElement )

				secondElement = arr[i];
		}

		if ( secondElement == 0 )

			System.out.print( "There is no second largest" );

		else   System.out.print( "The second largest element ::  " + secondElement );
	}

}