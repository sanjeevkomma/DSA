package com.demo.linear_ds.linkedList.circular;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Points back to the head to make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Last node points back to the head
        }
    }

    // Add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail's next to the new head to maintain circularity
        }
    }

    // Remove a node by value
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        Node previous = tail;

        // Special case if the node to remove is the head
        if (head.data == data) {
            if (head == tail) { // Only one element in the list
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        do {
            if (current.data == data) {
                previous.next = current.next;
                if (current == tail) { // Removing the tail
                    tail = previous;
                }
                return;
            }
            previous = current;
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

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }
}

public class CircularLinkedList_Example {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.print("List after adding elements: ");
        list.display();

        // Adding an element at the beginning
        list.addFirst(5);
        System.out.print("List after adding 5 at the beginning: ");
        list.display();

        // Removing an element
        list.remove(20);
        System.out.print("List after removing 20: ");
        list.display();

        // Searching for an element
        int searchValue = 10;
        if (list.search(searchValue)) {
            System.out.println(searchValue + " found in the list.");
        } else {
            System.out.println(searchValue + " not found in the list.");
        }
    }
}
