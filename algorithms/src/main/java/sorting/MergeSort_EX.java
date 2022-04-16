package sorting;

public class MergeSort_EX { // Function to merge the sub arrays of arr[]  

	public static void main( String args[])  {  

		int arr[] = { 222, 0, 11, 30, 24, 7, 31, 16, 39 };  

		mergeSort(arr, 0, arr.length - 1);  

		System.out.println("After sorting array elements are - ");  

		printArray(arr, arr.length);  

	}  

	static void mergeSort( int arr[], int beg, int end ) {  

		if ( beg < end )   {  

			int mid = ( beg + end ) / 2;  

			mergeSort(arr, beg, mid);  

			mergeSort(arr, mid + 1, end);  

			merge(arr, beg, mid, end);  
		}  
	}

	static void  merge( int arr[], int beg, int mid, int end )   {    

		int i, j, k;  

		int n1 = mid - beg + 1;    

		int n2 = end - mid;    

		/* temporary Arrays */  

		int leftArray[] = new int[n1];  

		int rightArray[] = new int[n2];  

		/* copy data to temp arrays */  
		for ( i = 0; i < n1; i ++ ) {   

			leftArray[i] = arr[beg + i];   } 

		for ( j = 0; j < n2; j++ )  {  

			rightArray[j] = arr[mid + 1 + j];  }  

		i = 0; /* initial index of first sub-array */  

		j = 0; /* initial index of second sub-array */   

		k = beg;  /* initial index of merged sub-array */  

		while ( i < n1 && j < n2 )  {    

			if( leftArray[i] <= rightArray[j] ) {    

				arr[k] = leftArray[i];    

				i++;    
			}    

			else {    

				arr[k] = rightArray[j];    

				j++;    
			}    

			k++;    
		}    

		while ( i < n1 )  {    

			arr[k] = leftArray[i];    

			i++;    

			k++;    
		}    

		while (j < n2)  {    

			arr[k] = rightArray[j];    

			j++;    

			k++;    
		}    
	}    



	static void printArray(int arr[], int length)  {  

		for  ( int i = 0; i < length; i++ )  

			System.out.print(arr[i] + " ");  
	}  

}  