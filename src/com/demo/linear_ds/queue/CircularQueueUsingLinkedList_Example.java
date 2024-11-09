package com.demo.linear_ds.queue;
class CircularQueueUsingLinkedList {
    private Node front, rear;
    private int size;

    public CircularQueueUsingLinkedList() {
        this.front = this.rear = null;
        this.size = 0;
    }

    // Add an element to the queue
    public void enqueue(int item) {
        Node newNode = new Node(item);

        // If the queue is empty, both front and rear will point to the new node
        if (isEmpty()) {
            front = rear = newNode;
            newNode.next = front; // Circular linkage
        } else {
            rear.next = newNode;  // Link current rear to the new node
            rear = newNode;       // Update the rear to the new node
            rear.next = front;    // Circular linkage
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

        // If there is only one element in the queue
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next; // Move front to the next node
            rear.next = front;  // Maintain circular linkage
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
public class CircularQueueUsingLinkedList_Example {
    public static void main(String[] args) {
        CircularQueueUsingLinkedList queue = new CircularQueueUsingLinkedList();

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
