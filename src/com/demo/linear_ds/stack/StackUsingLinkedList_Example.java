package com.demo.linear_ds.stack;

/** Stacks can also be implemented using a linked list,
  where each node represents an element in the stack.
  This implementation allows dynamic resizing and is especially useful
  if you need to avoid the memory limitations of an array.
 **/

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackUsingLinkedList {
    private Node top;

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Peek operation
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
}

public class StackUsingLinkedList_Example {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 30
    }
}
