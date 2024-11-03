package com.demo.linear_ds.linkedList.singly;
class Node {
    int data;
      Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new  Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new  Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add a node at a specific position
    public void addAtPosition(int data, int position) {
        Node newNode = new  Node(data);
        if (position == 0) {
            addFirst(data);
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Remove a node by value
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Element not found");
        } else {
            current.next = current.next.next;
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

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class SinglyLinkedList_Example {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

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

        // Adding an element at position 2
        list.addAtPosition(15, 2);
        System.out.print("List after adding 15 at position 2: ");
        list.display();

        // Removing an element
        list.remove(20);
        System.out.print("List after removing 20: ");
        list.display();

        // Searching for an element
        int searchValue = 15;
        if (list.search(searchValue)) {
            System.out.println(searchValue + " found in the list.");
        } else {
            System.out.println(searchValue + " not found in the list.");
        }
    }
}
