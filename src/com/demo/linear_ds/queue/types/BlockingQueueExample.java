package com.demo.linear_ds.queue.types;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// LinkedBlockingQueue as a Blocking Queue
// LinkedBlockingQueue is a thread-safe queue that supports blocking operations. It’s often used in producer-consumer scenarios.

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>(3);

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                blockingQueue.put("Task 1");
                blockingQueue.put("Task 2");
                blockingQueue.put("Task 3");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumed: " + blockingQueue.take());
                System.out.println("Consumed: " + blockingQueue.take());
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
