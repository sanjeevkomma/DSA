package com.demo.core.linear_ds.queue;

// time complexity = O(1) for enqueue and dequeue operations

class QueueUsingLinkedList {
    private Node front, rear;
    private int size;

    public QueueUsingLinkedList() {
        this.front = this.rear = null;
        this.size = 0;
    }

    // Add an element to the queue
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Enqueued: " + item);
    }

    // Remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = front.data;
        front = front.next;
        if (front == null) { // If the queue is now empty
            rear = null;
        }
        size--;
        System.out.println("Dequeued: " + item);
        return item;
    }

    // Get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            return -1;
        }
        return front.data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Get the current size of the queue
    public int getSize() {
        return size;
    }
}

public class QueueUsingLinkedList_Example {
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Front element is: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Queue size is: " + queue.getSize());

        queue.enqueue(50);

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
Dequeueing element: 30
Dequeueing element: 40
Dequeueing element: 50
Queue is empty. Cannot dequeue.

 */