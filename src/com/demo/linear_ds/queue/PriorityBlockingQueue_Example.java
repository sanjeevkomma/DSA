package com.demo.linear_ds.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/*
* Sorted, Blocking
* Thread-safe PriorityQueue
* Stores elements in sorted order but does not block on retrieval
*/
public class PriorityBlockingQueue_Example {

    public static void main(String args[]){

        BlockingQueue<Integer> blockingQueue = new PriorityBlockingQueue<>();

        try {
            blockingQueue.put(23);
            blockingQueue.put(5);
            blockingQueue.put(100);

            System.out.println(blockingQueue.take()); // Prints 5

        }
        catch(InterruptedException exception){

        }
    }
}