package com.demo.core.linear_ds.stack;

import java.util.Stack;

/*
📌 Part of java.util (extends Vector<E> - thread-safe but slow).
📌 Uses synchronization (not efficient for high-performance apps).
📌 Provides push(), pop(), peek(), and search()

✅ Best for: Small-scale, single-threaded applications.
❌ Not recommended for high-performance tasks due to synchronization overhead.
 */
public class Stack_Example {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Mango");
        stack.push("Orange");
        stack.push("Banana");
        stack.push("Popagranate");
        stack.push("Tomato");
        stack.push("Egg");


        System.out.println("stack1: " + stack);

        System.out.println("peek: " + stack.peek()); // Returns the top element(LIFO)
        System.out.println("pop: " + stack.pop()); // Removes & Returns the top element
        System.out.println("remove1: " + stack.remove(3));
        System.out.println("remove2: " + stack.remove("Mango"));
        System.out.println("search: " + stack.search("Orange"));
        System.out.println("isEmpty: " + stack.isEmpty());



        System.out.println("stack2: " + stack);

    }
}

