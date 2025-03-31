package com.demo.linear_ds.stack;

/*
📌 Array-based stack implementation (better than Stack<E>).
📌 Does NOT allow null values.
📌 Faster than Stack<E> because it avoids synchronization overhead
 *
✅ Best for: High-performance, single-threaded applications.
❌ Not thread-safe, avoid in multi-threaded environments.
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_Example {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());  // Output: C
        System.out.println(stack.peek()); // Output: B
    }
}
