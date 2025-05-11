package com.demo.core.linear_ds.linkedList.circulardoubly;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class CircularDoublyLinkedList {
    private Node head;
    private Node tail;

    public CircularDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }

    // Add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }

    // Remove a node by value
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            if (current.data == data) {
                if (current == head && current == tail) { // Only one node in the list
                    head = null;
                    tail = null;
                } else if (current == head) { // Removing the head
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                } else if (current == tail) { // Removing the tail
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                } else { // Removing a node in the middle
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        } while (current != head);

        System.out.println("Element not found");
    }

    // Search for a node by value
    public boolean search(int data) {
        if (head == null) {
            return false;
        }

        Node current = head;
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    // Display the list from head to tail
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    // Display the list from tail to head
    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail;
        do {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        } while (current != tail);
        System.out.println("(tail)");
    }
}

public class CircularDoublyLinkedList_Example {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.print("List after adding elements: ");
        list.displayForward();

        // Adding an element at the beginning
        list.addFirst(5);
        System.out.print("List after adding 5 at the beginning: ");
        list.displayForward();

        // Removing an element
        list.remove(20);
        System.out.print("List after removing 20: ");
        list.displayForward();

        // Display the list in reverse
        System.out.print("List displayed backward: ");
        list.displayBackward();

        // Searching for an element
        int searchValue = 10;
        if (list.search(searchValue)) {
            System.out.println(searchValue + " found in the list.");
        } else {
            System.out.println(searchValue + " not found in the list.");
        }
    }
}
