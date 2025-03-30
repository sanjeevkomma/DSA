package com.demo.nonlinear_ds.hashmap;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphExample {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D"));
        graph.put("C", Arrays.asList("A", "D", "E"));
        graph.put("D", Arrays.asList("B", "C", "E"));
        graph.put("E", Arrays.asList("C", "D"));

        System.out.println("Neighbors of C: " + graph.get("C"));
    }
}

