package com.demo.core.linear_ds.stack;
import java.util.ArrayDeque;

/**
The ArrayDeque class, part of Java’s java.util package,
 provides a more efficient and flexible stack implementation.
 Unlike Stack, ArrayDeque is non-synchronized and generally faster,
 making it a good choice for single-threaded applications.
**/


public class StackUsingArrayDeque_Example {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek the top element
        System.out.println("Top element: " + stack.peek()); // Output: 30

        // Pop an element from the stack
        System.out.println("Popped element: " + stack.pop()); // Output: 30

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}

