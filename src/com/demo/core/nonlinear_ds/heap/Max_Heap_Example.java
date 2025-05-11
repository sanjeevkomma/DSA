package com.demo.core.nonlinear_ds.heap;
/*
    * Max Heap – The parent node has a larger value than its children (largest element at the root)
    * Sort the elements in the descending order
    * Remove the elements in the descending order
 */
import java.util.PriorityQueue;
import java.util.Collections;

public class Max_Heap_Example {
    public static void main(String[] args) {
        // Max Heap using PriorityQueue with a custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Insert elements
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(3);

        // Peek the maximum element
        System.out.println("Max Element (Root): " + maxHeap.peek()); // 20

        // Remove elements in descending order
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll()); // 20, 10, 5, 3
        }
    }
}
