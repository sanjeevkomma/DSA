package com.demo.core.linear_ds.stack;

/**
 * A custom stack implementation can also be created using an array.
 * Here, we manage the size and top pointer manually.
 * This implementation is straightforward but has a fixed size,
 * so resizing is necessary for larger stacks.
 **/
class StackUsingArray {

    private int arr[];
    private int topIndex;

    public StackUsingArray(int size) {
        arr = new int[size];
        topIndex = -1;
    }

    // Push operation
    public void push(int data) {
        if (topIndex == arr.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        topIndex ++;
        arr[topIndex] = data;
    }

    // Pop operation
    public int pop() {
        if (topIndex == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[topIndex--];
    }

    // Peek operation
    public int peek() {
        if (topIndex == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[topIndex];
    }
}

public class StackUsingArray_Example {

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 30
    }
}