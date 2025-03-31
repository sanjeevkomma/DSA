package com.demo.linear_ds.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/* ArrayDeque as a Double-Ended Queue (Deque)
 ArrayDeque implements the Deque interface and allows insertion and deletion at both ends.
 Fastest Non-Blocking Queue
 */

public class ArrayDeque_Example {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        
        // Add elements to both ends
        deque.addFirst("First");
        deque.addLast("Last");

        System.out.println("Deque: " + deque);            // Outputs [First, Last]

        // Remove elements from both ends
        System.out.println("Removed: " + deque.removeFirst()); // Outputs First
        System.out.println("Removed: " + deque.removeLast());  // Outputs Last
    }
}
