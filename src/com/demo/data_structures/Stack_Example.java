package com.demo.data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack_Example {

    public static void main(String args[]){

        Stack<String> stack = new Stack<String>();

        stack.push("Apple");
        stack.push("Mango");
        stack.push("Orange");
        stack.push("Banana");
        stack.push("Popagranate");

        //stack.remove(2);

        System.out.println("peek::" +stack.peek());

        System.out.println(stack);

        System.out.println("pop::"+stack.pop());

        System.out.println(stack);

       // obj.

        List<String> list = new ArrayList();

        list.add("abc");

       // list.remove(2);

       // list.g


    }
}
