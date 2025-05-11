package com.demo.core.nonlinear_ds.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DictionaryExample {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("Java", "A high-level programming language.");
        dictionary.put("HashMap", "A data structure that stores key-value pairs.");
        dictionary.put("Thread", "A lightweight process for concurrent execution.");

        System.out.println("Definition of Java: " + dictionary.get("Java"));

        // Iterating over HashMap
        for (String key : dictionary.keySet()) {
            System.out.println(key + ": " + dictionary.get(key));
        }
    }
}

