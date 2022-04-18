package searching;

// Binary search for sorted array with recursion

public class BinarySearch_Ex { 

	public static void main(String args[]) {  

		int arr[] = { 8, 10, 22, 27, 37, 44, 49, 55, 69 }; // sorted given array  

		int val = 37; // value to be searched  

		// int n = arr.length; // size of array  

		int resultIndex = binarySearch(arr, 0, arr.length - 1, val); // Store result  

		if (resultIndex == -1)  
			System.out.println("Element is not present in the array");  
		else  
			System.out.println("Element is present at " + resultIndex + " position of array");  
	}  

	static int binarySearch( int arr[], int begIndex, int endIndex, int val ) {    

		int midIndex;    

		if( endIndex >= begIndex ) {  

			midIndex = ( begIndex + endIndex ) / 2;    

			if( arr[midIndex] == val )  {    

				return midIndex + 1;  // if the item to be searched is present at middle  

			}    

			// if the item to be searched is smaller than middle, then it can only be in left sub array  
			else if( arr[midIndex] < val )  {  

				return binarySearch(arr, midIndex + 1, endIndex, val);    
			}    

			// if the item to be searched is greater than middle, then it can only be in right sub array  

			else  {  
				return binarySearch(arr, begIndex, midIndex-1, val);    
			}    
		}    

		return -1;    
	}   

}  
