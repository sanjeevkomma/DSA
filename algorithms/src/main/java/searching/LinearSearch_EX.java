package searching;

public class LinearSearch_EX {

	public static void main(String args[]) {  

		int arr[] = { 55, 29, 10, 40, 57, 41, 20, 24, 45 }; // given array  

		int val = 10; // value to be searched  

		int resultIndex = linearSearch( arr, arr.length, val ); // Store result  

		if (resultIndex == -1)  
			System.out.println("Element is not present in the array");  
		else  
			System.out.println("Element is present at " + resultIndex +" position of array");  
	}  

	static int linearSearch( int arr[], int arrLength, int val) {  

		for ( int i = 0; i < arrLength; i++ )  {  

			if ( arr[i] == val )  

				return i + 1 ;  
		}  

		return -1;  
	}  

}  
