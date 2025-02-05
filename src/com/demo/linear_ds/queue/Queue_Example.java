package com.demo.linear_ds.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example {

    public static void main(String args[]){
        Queue<String> queue = new LinkedList<String>();

        queue.add("apple");
        queue.add("banana");
        queue.add("carrot");
        queue.add("tomato");
        queue.add("orange");

        System.out.println(queue.peek()); // Returns the head of the queue
        System.out.println(queue.element()); // Returns the head of the queue

        System.out.println(queue.poll());  // Removes & Returns the head of the queue
        System.out.println(queue.remove()); // Removes & Returns the head of the queue

        System.out.println(queue.isEmpty());

    }

}
