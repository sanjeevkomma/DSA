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
            Node currentNode = headNode;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = newNode;
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

        Node currentNode = headNode;
        for (int i = 0; i < position - 1 && currentNode != null; i++) {
            currentNode = currentNode.nextNode;
        }

        if (currentNode == null) {
            System.out.println("Position out of bounds");
        } else {
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
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

        Node currentNode = headNode;
        while (currentNode.nextNode != null && currentNode.nextNode.val != val) {
            currentNode = currentNode.nextNode;
        }

        if (currentNode.nextNode == null) {
            System.out.println("Element not found");
        } else {
            currentNode.nextNode = currentNode.nextNode.nextNode;
        }
    }

    // Search for a node by value
    public boolean search(int val) {
        Node currentNode = headNode;
        while (currentNode != null) {
            if (currentNode.val == val) {
                return true;
            }
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    // Display the list
    public void display() {
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.print(currentNode.val + " -> ");
            currentNode = currentNode.nextNode;
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
