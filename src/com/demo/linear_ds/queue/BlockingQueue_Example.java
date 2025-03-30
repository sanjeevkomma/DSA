package com.demo.linear_ds.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/*
* LinkedBlockingQueue as a Blocking Queue
* LinkedBlockingQueue is a thread-safe queue that supports blocking operations.
* It’s often used in producer-consumer scenarios.
* Supports blocking operations (waits when empty/full)
* It will block producer thread to insert element when queue is full
* It will block consumer thread to consume element when queue is empty

 */


public class BlockingQueue_Example {
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
