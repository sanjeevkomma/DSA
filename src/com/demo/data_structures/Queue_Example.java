package com.demo.data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example {

    public static void main(String args[]){

        Queue<String> queue = new LinkedList<String>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        System.out.println("Queue1: " + queue);

        System.out.println("peek element: " + queue.peek());
        System.out.println("poll element: " + queue.poll());

        System.out.println("Queue2: " + queue);
    }
}
