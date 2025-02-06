package com.demo.problems;

// Each character should occur odd number of times
public class Alphabets_With_Odd_Frequencies {

	public static void main(String[] args) {
		
		int n = 9;
		
		System.out.println(generateString(n));

	}
	
	public static String generateString(int n) {
	      String ans = "";
	     
	    // If n is odd
	    if (n % 2 != 0)
	    {
	 
	        // Add all characters from
	        // b-y
	        for(int i = 0;
	                i < Math.min(n, 24); i++)
	        {
	            ans += (char)('b' + i); 
	        }
	         
	        // Append a to fill the
	        // remaining length
	        if (n > 24)
	        {
	            for(int i = 0;
	                    i < (n - 24); i++)
	                ans += 'a';
	        }
	    }
	     
	    // If n is even
	    else
	    {
	         
	        // Add all characters from
	        // b-z
	        for(int i = 0;
	                i < Math.min(n, 25); i++)
	        {
	            ans += (char)('b' + i);
	        }
	 
	        // Append a to fill the
	        // remaining length
	        if (n > 25)
	        {
	            for(int i = 0;
	                    i < (n - 25); i++)
	                ans += 'a';
	        }
	    }
	    return ans;


	    }

}
