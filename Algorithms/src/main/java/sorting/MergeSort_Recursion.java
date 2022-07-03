package sorting;

public class MergeSort_Recursion { // Function to merge the sub arrays of arr[]  

	public static void main( String args[])  {  

		int arr[] = { 222, 0, -11, 30, 24, -7, 31, 16, 39 };  

		mergeSort(arr, 0, arr.length - 1);  

		System.out.println("After sorting array elements are - ");  

		printArray(arr);  

	}  

	static void mergeSort( int arr[], int begIndex, int endIndex ) {  

		if ( begIndex < endIndex )   {  

			int midIndex = ( begIndex + endIndex ) / 2;  

			mergeSort(arr, begIndex, midIndex);  

			mergeSort(arr, midIndex + 1, endIndex);  

			merge(arr, begIndex, midIndex, endIndex);  
		}  
	}

	static void  merge( int arr[], int begIndex, int midIndex, int endIndex )   {    

		int i, j, k;  

		int n1 = midIndex - begIndex + 1;    

		int n2 = endIndex - midIndex;    

		/* temporary Arrays */  

		int leftArray[] = new int[n1];  

		int rightArray[] = new int[n2];  

		/* copy data to temp arrays */  
		for ( i = 0; i < n1; i ++ ) {   

			leftArray[i] = arr[begIndex + i];   } 

		for ( j = 0; j < n2; j++ )  {  

			rightArray[j] = arr[midIndex + 1 + j];  }  

		i = 0; /* initial index of first sub-array */  

		j = 0; /* initial index of second sub-array */   

		k = begIndex;  /* initial index of merged sub-array */  

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



	static void printArray(int arr[] )  {  

		for  ( int i = 0; i < arr.length; i++ )  

			System.out.print(arr[i] + " ");  
	}  

}  