package com.demo.linear_ds.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/* PriorityQueue as a Priority Queue
 * PriorityQueue provides a priority-based queue where elements are ordered according
to their natural ordering or by a custom comparator
 * Elements are sorted in ascending order in Prority Queue
 * Sorted, No Capacity Limit
 */


public class PriorityQueue_Example {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Enqueue elements
        priorityQueue.add(10);
        priorityQueue.add(5777);
        priorityQueue.add(2000);

        // Elements are dequeued based on priority (natural ordering in this case)
        System.out.println("Removed: " + priorityQueue.poll());  // Outputs 10
        System.out.println("Peek: " + priorityQueue.peek());      // Outputs 2000
    }
}

