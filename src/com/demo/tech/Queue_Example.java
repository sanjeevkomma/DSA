package com.demo.tech;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example {

    public static void main(String args[]) {

        Queue<String> queue = new LinkedList<String>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        queue.add("Tomato");
        queue.add("Popagranate");
        queue.add("Carrot");

        System.out.println("Queue1: " + queue);

        System.out.println("peek : " + queue.peek());
        System.out.println("poll : " + queue.poll());
        System.out.println("remove1 : " + queue.remove());
        System.out.println("remove2 : " + queue.remove("Popagranate"));
        System.out.println("front element : " + queue.element());
        System.out.println("isEmpty : " + queue.isEmpty());
        System.out.println("contains : " + queue.contains("Carrot"));
        System.out.println("size : " + queue.size());
        System.out.println("toArray element : " + queue.toArray()[1]);

        System.out.println("Queue2: " + queue);
    }
}
