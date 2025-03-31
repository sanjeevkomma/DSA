package com.demo.linear_ds.stack;

/*
📌 Implements Deque<E> (acts as both Stack & Queue).
📌 Uses a doubly linked list, consuming more memory than ArrayDeque.
📌 Allows null values (unlike ArrayDeque)
*
✅ Best for: Cases where null elements are required.
❌ Slower than ArrayDeque due to linked list overhead.
 */
import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDeque_Example {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Output: 3
    }
}
