package com.demo.core.linear_ds.deque;

import java.util.LinkedList;

class DequeUsingLinkedList {

    private LinkedList<Integer> deque;

    // Constructor to initialize the deque
    public DequeUsingLinkedList() {
        deque = new LinkedList<>();
    }

    // Add an element to the front of the deque
    public void addFirst(int item) {
        deque.addFirst(item);
        System.out.println("Added to front: " + item);
    }

    // Add an element to the rear of the deque
    public void addLast(int item) {
        deque.addLast(item);
        System.out.println("Added to rear: " + item);
    }

    // Remove an element from the front of the deque
    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot remove from the front.");
            return -1;
        }
        int item = deque.removeFirst();
        System.out.println("Removed from front: " + item);
        return item;
    }

    // Remove an element from the rear of the deque
    public int removeLast() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot remove from the rear.");
            return -1;
        }
        int item = deque.removeLast();
        System.out.println("Removed from rear: " + item);
        return item;
    }

    // Get the first element of the deque
    public int peekFirst() {
        if (isEmpty()) {
            System.out.println("Deque is empty. No element to peek from the front.");
            return -1;
        }
        return deque.peekFirst();
    }

    // Get the last element of the deque
    public int peekLast() {
        if (isEmpty()) {
            System.out.println("Deque is empty. No element to peek from the rear.");
            return -1;
        }
        return deque.peekLast();
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Get the current size of the deque
    public int getSize() {
        return deque.size();
    }
}

public class DequeUsingLinkedList_Example {
    public static void main(String[] args) {
        DequeUsingLinkedList deque = new DequeUsingLinkedList();

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
Deque is empty. Cannot remove from the front.

 */