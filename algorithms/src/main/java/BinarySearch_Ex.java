public class BinarySearch_Ex { 

	public static void main(String args[]) {  

		int arr[] = { 8, 10, 22, 27, 37, 44, 49, 55, 69 }; // sorted given array  

		int val = 37; // value to be searched  

		int n = arr.length; // size of array  

		int res = binarySearch(arr, 0, n-1, val); // Store result  

		System.out.print("The elements of the array are: ");  

		for (int i = 0; i < n; i++)  {  

			System.out.print(arr[i] + " ");  
		}  

		System.out.println();  

		System.out.println("Element to be searched is: " + val);  

		if (res == -1)  
			System.out.println("Element is not present in the array");  
		else  
			System.out.println("Element is present at " + res + " position of array");  
	}  

	static int binarySearch(int arr[], int beg, int end, int val) {    

		int mid;    

		if( end >= beg ) {  

			mid = (beg + end)/2;    

			if( arr[mid] == val )  {    

				return mid + 1;  // if the item to be searched is present at middle  

			}    

			// if the item to be searched is smaller than middle, then it can only be in left sub array  
			else if( arr[mid] < val )  {  

				return binarySearch(arr, mid + 1, end, val);    
			}    

			// if the item to be searched is greater than middle, then it can only be in right sub array  

			else  {  
				return binarySearch(arr, beg, mid-1, val);    
			}    
		}    

		return -1;    
	}   

}  
