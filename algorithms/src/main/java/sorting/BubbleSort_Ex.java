package sorting;

// Sorting in Ascending order using swapping approach

public class BubbleSort_Ex {

	public static void main(String[] args) {    

		int arr[] = { 35, 10, 31, 11, 26 };    

		bubbleSort(arr);  

		print(arr);  

	} 

	static void bubbleSort ( int arr[] )  {   // function to implement bubble sort in ascending order with swapping approach

		for ( int i = 0; i < arr.length; i++ )  {  

			for ( int j = i + 1; j < arr.length; j++ )   {  

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
