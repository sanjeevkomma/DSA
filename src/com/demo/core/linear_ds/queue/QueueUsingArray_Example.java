package com.demo.core.linear_ds.queue;

// time complexity = O(1) for enqueue and dequeue operations

class QueueUsingArray {
    private int arr[];
    private int frontIndex;
    private int rearIndex;
    private int capacity;
    private int size;

    // Constructor to initialize the queue
    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        frontIndex = 0;
        rearIndex = -1;
        size = 0;
    }

    // Add an element to the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        rearIndex = (rearIndex + 1) % capacity; // Circular increment
        arr[rearIndex] = data;
        size ++;
        System.out.println("Enqueued: " + data);
    }

    // Remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int data = arr[frontIndex];
        frontIndex = (frontIndex + 1) % capacity; // Circular increment
        size --;
        System.out.println("Dequeued: " + data);
        return data;
    }

    // Get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            return -1;
        }
        return arr[frontIndex];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get the current size of the queue
    public int getSize() {
        return size;
    }
}

public class QueueUsingArray_Example {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Front element is: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Queue size is: " + queue.getSize());

        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        while (!queue.isEmpty()) {
            System.out.println("Dequeueing element: " + queue.dequeue());
        }
    }
}

// Output
/*
Enqueued: 10
Enqueued: 20
Enqueued: 30
Enqueued: 40
Front element is: 10
Dequeued: 10
Dequeued: 20
Queue size is: 2
Enqueued: 50
Enqueued: 60
Queue is full. Cannot enqueue 70
Dequeueing element: 30
Dequeueing element: 40
Dequeueing element: 50
Dequeueing element: 60
Queue is empty. Cannot dequeue.

 */