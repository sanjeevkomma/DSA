package com.demo.linear_ds.queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
* ConcurrentLinkedQueue as a Concurrent Queue
* ConcurrentLinkedQueue is a thread-safe, non-blocking queue suitable for high-throughput
* applications where multiple threads may access the queue concurrently
* ConcurrentLinkedQueue (Non-Blocking, Lock-Free)
 */

public class ConcurrentQueue_Example {
    public static void main(String[] args) {
        Queue<String> concurrentQueue = new ConcurrentLinkedQueue<>();

        // Producer thread
        Thread producer = new Thread(() -> {
            concurrentQueue.add("Task 1");
            concurrentQueue.add("Task 2");
        });

       // Runnable producer = () -> { concurrentQueue.add("Task 1");concurrentQueue.add("Task 2");};

        // Consumer thread
        Thread consumer = new Thread(() -> {
            System.out.println("Consumed: " + concurrentQueue.poll());  // Outputs Task 1
            System.out.println("Consumed: " + concurrentQueue.poll());  // Outputs Task 2
        });

        producer.start();
        consumer.start();
    }
}
