package com.demo.linear_ds.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// ArrayBlockingQueue as a Fixed-Size Blocking Queue
// ArrayBlockingQueue is a bounded blocking queue backed by an array. It’s useful when you need a queue with a fixed capacity that supports thread-safe blocking operations.

public class ArrayBlockingQueue_Example {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(2);

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                arrayBlockingQueue.put(1);
                arrayBlockingQueue.put(2);
                System.out.println("Queue full, waiting to put: " + arrayBlockingQueue.offer(3)); // Returns false since the queue is full
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumed: " + arrayBlockingQueue.take()); // Outputs 1
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}
