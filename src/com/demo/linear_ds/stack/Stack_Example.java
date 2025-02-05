package com.demo.linear_ds.stack;

import java.util.Stack;

// A stack is a Last-In-First-Out (LIFO) data structure
// where elements are added and removed from the same end (top).
// Using Stack Class from Java's java.util Package
public class Stack_Example {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack.pop()); // Removes & Returns the top of the Stack
        System.out.println(stack.peek()); // Returns the top of the Stack

        System.out.println(stack.isEmpty());
    }
}

