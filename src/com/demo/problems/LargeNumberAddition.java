package com.demo.problems;

/*
Input :
-------
String str1 = "342343434343434343552352634665375375463465656";
String str2 = "52323749374237402374023740235705757";
Output :
-------
Sum: 342343434395758092926590037039399115699171413

 */
public class LargeNumberAddition {
    public static void main(String[] args) {
        String str1 = "342343434343434343552352634665375375463465656";
        String str2 = "52323749374237402374023740235705757";

        System.out.println("Sum: " + addLargeNumbers(str1, str2));
    }

    public static String addLargeNumbers(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        // Process both strings from the rightmost digit to the left
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;  // Extract carry
            result.append(sum % 10); // Extract the last digit

            i--;
            j--;
        }

        // Reverse the result since we were adding digits from right to left
        return result.reverse().toString();
    }
}