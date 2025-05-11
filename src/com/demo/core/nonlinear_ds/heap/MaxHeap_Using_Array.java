package com.demo.core.nonlinear_ds.heap;

import java.util.ArrayList;

class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    // Swap helper method
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Insert element into the heap
    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        // Heapify up
        while (current > 0) {
            int parent = (current - 1) / 2;
            if (heap.get(current) > heap.get(parent)) {
                swap(current, parent);
                current = parent;
            } else {
                break;
            }
        }
    }

    // Remove and return the max element (root)
    public int extractMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1)); // Move last element to root
        heap.remove(heap.size() - 1);
        heapifyDown(0);

        return max;
    }

    // Heapify down after removing root
    private void heapifyDown(int index) {
        int leftChild, rightChild, largest;
        while (index < heap.size()) {
            leftChild = 2 * index + 1;
            rightChild = 2 * index + 2;
            largest = index;

            if (leftChild < heap.size() && heap.get(leftChild) > heap.get(largest)) {
                largest = leftChild;
            }
            if (rightChild < heap.size() && heap.get(rightChild) > heap.get(largest)) {
                largest = rightChild;
            }
            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    // Print heap
    public void printHeap() {
        System.out.println(heap);
    }
}

public class MaxHeap_Using_Array {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(30);

        System.out.println("Max Heap: ");
        maxHeap.printHeap(); // Shows heap structure

        System.out.println("Extracted Max: " + maxHeap.extractMax()); // 30
        maxHeap.printHeap();
    }
}
