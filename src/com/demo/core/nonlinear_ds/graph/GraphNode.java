package com.demo.core.nonlinear_ds.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    int value; // The value of the node
    List<GraphNode> neighbors; // List of neighboring nodes

    // Constructor
    public GraphNode(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    // Method to add a neighbor
    public void addNeighbor(GraphNode neighbor) {
        this.neighbors.add(neighbor);
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "value=" + value +
                '}';
    }
}

