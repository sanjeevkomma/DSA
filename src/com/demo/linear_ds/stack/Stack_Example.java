package com.demo.linear_ds.stack;

import java.util.Stack;

// A stack is a Last-In-First-Out (LIFO) data structure
// where elements are added and removed from the same end (top).
// Using Stack Class from Java's java.util Package
public class Stack_Example {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping element
        System.out.println("Popped element: " + stack.pop());

        // Displaying top element
        System.out.println("Top element: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

