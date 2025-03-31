package com.demo.linear_ds.stack;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

/*
* ConcurrentLinkedDeque<E> (Thread-Safe, Non-Blocking Stack)
📌 Thread-safe, lock-free stack for multi-threading.
📌 Non-blocking, uses CAS (Compare-And-Swap) for concurrency.
📌 Used in concurrent programming for high performance
*
✅ Best for: Multi-threaded applications requiring high performance.
❌ Non-blocking, may not be suitable for producer-consumer models.
 */
public class ConcurrentLinkedDeque_Example {
    public static void main(String[] args) {
        Deque<Integer> stack = new ConcurrentLinkedDeque<>();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println(stack.pop()); // Output: 300
    }
}
