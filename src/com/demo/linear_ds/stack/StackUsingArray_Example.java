package com.demo.linear_ds.stack;

/**
 A custom stack implementation can also be created using an array.
 Here, we manage the size and top pointer manually.
 This implementation is straightforward but has a fixed size,
 so resizing is necessary for larger stacks.
 **/
class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push operation
    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = data;
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
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

