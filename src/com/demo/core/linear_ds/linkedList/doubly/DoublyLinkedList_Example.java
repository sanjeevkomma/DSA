package com.demo.core.linear_ds.linkedList.doubly;

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

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add a node at a specific position
    public void addAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            addFirst(data);
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            add(data); // Add at the end if position is out of bounds
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    // Remove a node by value
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Element not found");
            return;
        }

        if (current == head) {
            head = current.next;
            if (head != null) head.prev = null;
        } else if (current == tail) {
            tail = current.prev;
            if (tail != null) tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Search for a node by value
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Display the list from head to tail
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Display the list from tail to head
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}
public class DoublyLinkedList_Example {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

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

        // Adding an element at position 2
        list.addAtPosition(15, 2);
        System.out.print("List after adding 15 at position 2: ");
        list.displayForward();

        // Display list backward
        System.out.print("List displayed backward: ");
        list.displayBackward();

        // Removing an element
        list.remove(20);
        System.out.print("List after removing 20: ");
        list.displayForward();

        // Searching for an element
        int searchValue = 15;
        if (list.search(searchValue)) {
            System.out.println(searchValue + " found in the list.");
        } else {
            System.out.println(searchValue + " not found in the list.");
        }
    }
}

