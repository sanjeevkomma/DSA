package com.demo.core.linear_ds.stack;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueuePushCostly  {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        // Add new element to q1
        q1.add(x);

        // Move all elements back from q2 to q1
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    public int pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.poll();
    }

    public int top() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
class StackUsingQueuePopCostly {
    private Queue<Integer> q1 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");

        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q1.add(q1.poll()); // Move front elements to the back
        }
        return q1.poll(); // Remove last element
    }

    public int top() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");

        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q1.add(q1.poll()); // Move front elements to the back
        }
        int topElement = q1.peek();
        q1.add(q1.poll()); // Restore the top element
        return topElement;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
public class StackUsingQueue_Example {
    public static void main(String[] args) {
        StackUsingQueuePushCostly  stack = new StackUsingQueuePushCostly();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.top()); // Output: 20
        System.out.println(stack.isEmpty()); // Output: false
    }
}
