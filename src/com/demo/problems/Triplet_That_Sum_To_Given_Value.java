package com.demo.problems;

import java.util.HashSet;
import java.util.Set;

public class Triplet_That_Sum_To_Given_Value {


	// Method 1: This is the naive approach towards solving the above problem.
	/**
	 * Time Complexity: O(n3)
	 * Space Complexity: O(1)
	 * 
	 */
	static boolean find3Numbers_Native_Approach(int arr[], int arr_size, int sum) {

		// Fix the first element as A[i]
		for (int i = 0; i < arr_size - 2; i++) {

			// Fix the second element as A[j]
			for (int j = i + 1; j < arr_size - 1; j++) {

				// Now look for the third number
				for (int k = j + 1; k < arr_size; k++) {

					if ( arr[i] + arr[j] + arr[k] == sum ) {

						System.out.print("Triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k]);

						return true;
					}
				}
			}
		}

		return false;
	}

	// Method 2: This is a Hashing-based solution
	/**
	 Time complexity: O(N^2) 
     Auxiliary Space: O(N)
	 */
	static boolean find3Numbers_Hashbased_Approach(int arr[], int arr_size, int sum) {

		for ( int i = 0; i < arr_size - 2; i++ ) {

			Set<Integer> s = new HashSet<Integer>();

			int curr_sum = sum - arr[i];

			for ( int j = i + 1; j < arr_size; j++ ) {

				if ( s.contains(curr_sum - arr[j]) ) {

					System.out.printf("Triplet is %d, %d, %d", arr[i],arr[j], curr_sum - arr[j]);

					return true;
				}

				s.add(arr[j]);
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 4, 45, 6, 10, 8 };

		int sum = 22;

		int arr_size = arr.length;

		find3Numbers_Hashbased_Approach(arr, arr_size, sum);
	}
}
