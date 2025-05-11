package com.demo.core.linear_ds.stack;

/*
* Thread-Safe, Blocking Stack
📌 Blocking version of a stack (waits when empty/full).
📌 Useful for producer-consumer problems in multi-threading.
*
✅ Best for: Multi-threaded applications needing controlled execution.
❌ Slower than ConcurrentLinkedDeque due to blocking behavior.
 */
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_Example {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> stack = new LinkedBlockingDeque<>(2);

        stack.putFirst(1);
        stack.putFirst(2);

        System.out.println(stack.takeFirst()); // Output: 2
    }
}
