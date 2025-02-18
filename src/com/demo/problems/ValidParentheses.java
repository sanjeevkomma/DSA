package com.demo.problems;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String args[]) {

        String str1 = "([([([])])])"; // "([]{})";

        System.out.println(isValid(str1));

    }

    private static boolean isValid(String str) {
        // Stack to store left symbols
        Stack<Character> leftSymbols = new Stack<Character>();
        // Loop for each character of the string
        for (char ch : str.toCharArray()) {
            // If left symbol is encountered
            if (ch == '(' || ch == '{' || ch == '[') {
                leftSymbols.push(ch);
            }
            // If right symbol is encountered
            else if (ch == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (ch == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (ch == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            // If none of the valid symbols is encountered
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }

}
