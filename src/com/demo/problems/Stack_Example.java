package com.demo.problems;

import java.util.Stack;

/**
 *
 * Time Complexity =
 * Space Complexity =
 *
 */

public class Stack_Example {

    public static void main(String args[]) {

        Stack<String> stack = new Stack<String>();

        stack.push("Apple");
        stack.push("Mango");
        stack.push("Orange");
        stack.push("Banana");
        stack.push("Popagranate");
        stack.push("Tomato");
        stack.push("Egg");


        System.out.println("stack1: " + stack);

        System.out.println("peek: " + stack.peek());
        System.out.println("pop: " + stack.pop());
        System.out.println("remove1: " + stack.remove(3));
        System.out.println("remove2: " + stack.remove("Mango"));
        System.out.println("search: " + stack.search("Orange"));
        System.out.println("isEmpty: " + stack.isEmpty());

        System.out.println("stack2: " + stack);

    }
}
