/***

Approach = Recursion Approach

Time Complexity = O(logn)

Space Complexity = Auxiliary space + Input size = O(1)

**/
public class BinarySearch_Recursion_Sorted { 

	public static void main(String args[]) {  

		int arr[] = { -49 , -27 , 0 , 8, 10, 22, 37, 44, 55, 69 }; // sorted given array in Ascending Order 

		int val = -27; // value to be searched  

		int resultIndex = binarySearch_In_SortedArray(arr, 0, arr.length - 1, val); 

		if ( resultIndex == -1 )  

			System.out.println("Element is not present in the array");  

		else  

			System.out.println("Element is present at " + ( resultIndex + 1) + " position of array");  
	}  

	static int binarySearch_In_SortedArray( int arr[], int begIndex, int endIndex, int val ) {    

		int midIndex = ( begIndex + endIndex ) / 2;    

			if ( val == arr[midIndex] )  {    

				return midIndex ;  // if the item to be searched is present at middle  

			}    

			// if the item to be searched is smaller than middle, then it can only be in left sub array  
			else if ( val < arr[midIndex] )  {  

				return binarySearch_In_SortedArray(arr, begIndex, midIndex - 1, val); // Recursion   begIndex midIndex
			}    

			// if the item to be searched is greater than middle, then it can only be in right sub array  

			else  if ( val > arr[midIndex] ) {  
				
				return binarySearch_In_SortedArray(arr, midIndex + 1 , endIndex, val); // Recursion   
			}    

		return -1 ;    
	}   

}  
