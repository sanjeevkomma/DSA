package com.demo.nonlinear_ds.heap;

import java.util.PriorityQueue;

/*
     * Min Heap – The parent node has a smaller value than its children (smallest element at the root)
     * Sort the elements in the ascending order
     * Remove the elements in the ascending order
 */

public class Min_Heap_Example {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(3);

        System.out.println("Min Element (Root): " + minHeap.peek()); // Should be 3

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // Prints elements in ascending order
        }
    }
}

