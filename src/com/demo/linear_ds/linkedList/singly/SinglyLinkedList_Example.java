package com.demo.linear_ds.linkedList.singly;
class Node {
    int val;
    Node nextNode;

    public Node(int val) {
        this.val = val;
        this.nextNode = null;
    }
}
class SinglyLinkedList {

    private Node headNode = null;

    // Add a node at the end of the list
    public void add(int val) {
        Node newNode = new  Node(val);
        if (headNode == null) {
            headNode = newNode;
        } else {
            Node current = headNode;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = newNode;
        }
    }

    // Add a node at the beginning of the list
    public void addFirst(int val) {
        Node newNode = new  Node(val);
        newNode.nextNode = headNode;
        headNode = newNode;
    }

    // Add a node at a specific position
    public void addAtPosition(int val, int position) {
        Node newNode = new  Node(val);
        if (position == 0) {
            addFirst(val);
            return;
        }

        Node current = headNode;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.nextNode;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
        } else {
            newNode.nextNode = current.nextNode;
            current.nextNode = newNode;
        }
    }

    // Remove a node by value
    public void remove(int val) {
        if (headNode == null) {
            System.out.println("List is empty");
            return;
        }

        if (headNode.val == val) {
            headNode = headNode.nextNode;
            return;
        }

        Node current = headNode;
        while (current.nextNode != null && current.nextNode.val != val) {
            current = current.nextNode;
        }

        if (current.nextNode == null) {
            System.out.println("Element not found");
        } else {
            current.nextNode = current.nextNode.nextNode;
        }
    }

    // Search for a node by value
    public boolean search(int val) {
        Node current = headNode;
        while (current != null) {
            if (current.val == val) {
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }

    // Display the list
    public void display() {
        Node current = headNode;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.nextNode;
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
