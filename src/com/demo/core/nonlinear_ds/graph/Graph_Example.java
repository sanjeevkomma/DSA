package com.demo.core.nonlinear_ds.graph;

import java.util.LinkedList;
import java.util.List;

class Graph {
    private int vertices;  // Number of vertices
    private List<Integer> adjList[];  // Adjacency list

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph (undirected)
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);  // For undirected graph
    }

    // Display the graph
    public void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer neighbor : adjList[i]) {
                System.out.print(" -> " + neighbor);
            }
            System.out.println();
        }
    }
}


public class Graph_Example {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Displaying the adjacency list of the graph
        graph.display();
    }
}
