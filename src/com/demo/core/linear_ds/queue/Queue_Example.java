package com.demo.core.linear_ds.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example {

    public static void main(String args[]){

        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        queue.add("Tomato");
        queue.add("Popagranate");
        queue.add("Carrot");

        System.out.println("Queue1: " + queue);

        System.out.println("peek : " + queue.peek()); // Returns the head of the Queue(FIFO)
        System.out.println("poll : " + queue.poll()); // Removes & Returns the head of the Queue(FIFO)
        System.out.println("remove1 : " + queue.remove()); // Remove the head of the Queue
        System.out.println("remove2 : " + queue.remove("Popagranate"));
        System.out.println("front element : " + queue.element()); // Returns the head of the Queue
        System.out.println("isEmpty : " + queue.isEmpty());
        System.out.println("contains : " + queue.contains("Carrot"));
        System.out.println("size : " + queue.size());
        System.out.println("toArray : " + queue.toArray()); // convert Queue to Array
        System.out.println("toArray element : " + queue.toArray()[1]);

        System.out.println("Queue2: " + queue);
    }

}
