package searching;

public class LinearSearch_EX {

	public static void main(String args[]) {  

		int arr[] = { 55, 29, 10, 40, 57, 41, 20, 24, 45 }; // given array  

		int val = 10; // value to be searched  

		int length = arr.length; // size of array  

		int res = linearSearch(arr, length, val); // Store result  

		System.out.println();  

		System.out.print("The elements of the array are - ");  

		for (int i = 0; i < length; i++)  
			System.out.print(" " + arr[i]);  

		System.out.println();  

		System.out.println("Element to be searched is - " + val);  

		if (res == -1)  
			System.out.println("Element is not present in the array");  
		else  
			System.out.println("Element is present at " + res +" position of array");  
	}  

	static int linearSearch(int arr[], int length, int val) {  

		// Going through array sequencially  
		for (int i = 0; i < length; i++)  {  

			if (arr[i] == val)  

				return i+1;  
		}  

		return -1;  
	}  

}  
