package com.demo.problems;

import java.util.List;

public class Remove_Element_In_Array {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5 };
		
		arr = removeElment(arr,3);
		
		for ( int i = 0 ; i < arr.length ; i ++ ) {
			
			System.out.println(arr[i]);
		}
	}
	
	static int[] removeElment(int arr[],int index) {
		
		int result[] = arr;
		
		
		List<Integer> list = null;
		
		list.remove(index);
		
		return result;
	}

}
