package com.demo.linear_ds.queue;

import java.util.PriorityQueue;

// PriorityQueue as a Priority Queue
// PriorityQueue provides a priority-based queue where elements are ordered according to their natural ordering or by a custom comparator.

public class PriorityQueue_Example {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        // Enqueue elements
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);

        // Elements are dequeued based on priority (natural ordering in this case)
        System.out.println("Removed: " + priorityQueue.poll());  // Outputs 5
        System.out.println("Peek: " + priorityQueue.peek());      // Outputs 10
    }
}

