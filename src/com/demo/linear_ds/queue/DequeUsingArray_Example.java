package com.demo.linear_ds.queue;

class DequeUsingArray {
    private int[] deque;
    private int front, rear, size, capacity;

    // Constructor to initialize the deque
    public DequeUsingArray(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Add an element to the front of the deque
    public void addFirst(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot add to the front.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity; // Circular increment
        }
        deque[front] = item;
        size++;
        System.out.println("Added to front: " + item);
    }

    // Add an element to the rear of the deque
    public void addLast(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot add to the rear.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity; // Circular increment
        }
        deque[rear] = item;
        size++;
        System.out.println("Added to rear: " + item);
    }

    // Remove an element from the front of the deque
    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot remove from the front.");
            return -1;
        }
        int item = deque[front];
        if (front == rear) {
            front = rear = -1; // Only one element, reset deque
        } else {
            front = (front + 1) % capacity; // Circular increment
        }
        size--;
        System.out.println("Removed from front: " + item);
        return item;
    }

    // Remove an element from the rear of the deque
    public int removeLast() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot remove from the rear.");
            return -1;
        }
        int item = deque[rear];
        if (front == rear) {
            front = rear = -1; // Only one element, reset deque
        } else {
            rear = (rear - 1 + capacity) % capacity; // Circular decrement
        }
        size--;
        System.out.println("Removed from rear: " + item);
        return item;
    }

    // Get the first element of the deque
    public int peekFirst() {
        if (isEmpty()) {
            System.out.println("Deque is empty. No element to peek from the front.");
            return -1;
        }
        return deque[front];
    }

    // Get the last element of the deque
    public int peekLast() {
        if (isEmpty()) {
            System.out.println("Deque is empty. No element to peek from the rear.");
            return -1;
        }
        return deque[rear];
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the deque is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get the current size of the deque
    public int getSize() {
        return size;
    }
}

public class DequeUsingArray_Example {
    public static void main(String[] args) {
        DequeUsingArray deque = new DequeUsingArray(5);

        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);

        System.out.println("First element is: " + deque.peekFirst());
        System.out.println("Last element is: " + deque.peekLast());

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque size is: " + deque.getSize());

        deque.addFirst(40);
        deque.addLast(50);

        while (!deque.isEmpty()) {
            System.out.println("Removing from front: " + deque.removeFirst());
        }
    }
}

// Output
/*
Added to front: 10
Added to rear: 20
Added to front: 5
Added to rear: 30
First element is: 5
Last element is: 30
Removed from front: 5
Removed from rear: 30
Deque size is: 2
Added to front: 40
Added to rear: 50
Removing from front: 10
Removing from front: 20

 */