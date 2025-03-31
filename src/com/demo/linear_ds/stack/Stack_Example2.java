package com.demo.linear_ds.stack;

import java.util.Stack;

// A stack is a Last-In-First-Out (LIFO) data structure
// where elements are added and removed from the same end (top).
// Using Stack Class from Java's java.util Package
public class Stack_Example2 {
    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<>();

        stack.push(20);
        stack.push(2);
        stack.push(10);
        stack.push(7);
        stack.push(9);
        stack.push(25);
        stack.push(3);
        stack.push(11);
        stack.push(32);

        System.out.println("stack1: " + stack);

        System.out.println("peek: " + stack.pop()); // 32
        System.out.println("pop: " + stack.peek()); // 11
        //System.out.println("remove1: " + stack.remove());
        System.out.println("remove2: " + stack.remove(2)); // 10
        System.out.println("search: " + stack.search(3)); // 2  ( returns index of element in Stack )
        System.out.println("isEmpty: " + stack.isEmpty()); // false

        System.out.println("stack2: " + stack);
    }
}