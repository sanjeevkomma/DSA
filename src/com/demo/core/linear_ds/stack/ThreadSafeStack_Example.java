package com.demo.core.linear_ds.stack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Thread-Safe Stack Using Collections.synchronizedList

/**
 For a thread-safe stack in multi-threaded applications,
 you can use Collections.synchronizedList with a LinkedList to create synchronized operations,
 or ConcurrentLinkedDeque for higher performance.
 */

public class ThreadSafeStack_Example {
    public static void main(String[] args) {
        List<Integer> stack = Collections.synchronizedList(new LinkedList<>());

        // Push elements
        stack.add(10);
        stack.add(20);
        stack.add(30);

        // Accessing the top element
        synchronized (stack) {
            System.out.println("Top element: " + stack.get(stack.size() - 1));
            System.out.println("Popped element: " + stack.remove(stack.size() - 1));
        }
    }
}

