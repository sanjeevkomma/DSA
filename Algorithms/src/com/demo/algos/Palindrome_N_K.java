package com.demo.algos;


public class Palindrome_N_K {
	
	
	// https://youvcode.com/minimum-deletion-cost-to-avoid-repeating-letters/

	public static void main(String args[]) {

		Palindrome_N_K obj = new Palindrome_N_K();

		String result = obj.findPalindrome_N_K(3, 4);

		System.out.println(result);
	}



	private String findPalindrome_N_K(int N, int K) {

		// N is length of Palindrome string

		// K is number of distinct chars in Palindrome string    

		char array[] = new char[N];

		int ascii = 96;

		int x = 1;

		int limit = 0;

		if( N % 2 == 1 ) limit = N/2;

		else limit = N/2 - 1;

		for( int i = 0 ; i <= limit; i++ ) {

			if ( x != K ) {

				char ch = (char) ( ascii + x );

				array[i] = ch;

				array[N-1-i] = ch;

				x ++ ;

			}

			else if( x == K ) {

				char ch = (char) ( ascii + x );

				array[i] = ch;

				array[N-1-i] = ch;

			}

		}

		return String.valueOf(array);
	}

}
