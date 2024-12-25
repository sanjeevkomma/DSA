package com.demo.nonlinear_ds.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 1. Breadth-First Search is a goal-oriented algorithm that explores all possible nodes level by level
 * in search of a specific node or path
 * 2. It uses the same level-order approach / level-order traversal as BFT but includes additional logic
 * to determine if the desired node or condition is found
 * <p>
 * Purpose
 * ------
 * 1. To search for a specific target node, value, or path in a graph or tree.
 * 2. Stops when the target is found
 * <p>
 * Use Cases
 * ----------
 * 1. Finding the shortest path in an unweighted graph.
 * 2. Searching for a specific value in a tree or graph.
 */

public class BreadthFirstSearch {

    public static void breadthFirstSearch(GraphNode startNode) {
        Queue<GraphNode> queue = new LinkedList<>();
        Set<GraphNode> visited = new HashSet<>();

        // Start with the given node
        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();
            System.out.println("Visited node: " + current.value);

            for (GraphNode neighbor : current.neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create graph nodes
        GraphNode nodeA = new GraphNode(6);
        GraphNode nodeB = new GraphNode(2);
        GraphNode nodeC = new GraphNode(4);
        GraphNode nodeD = new GraphNode(23);

        // Connect the nodes
        nodeA.addNeighbor(nodeB);
        nodeA.addNeighbor(nodeC);
        nodeB.addNeighbor(nodeD);

        // Perform BFS
        breadthFirstSearch(nodeA);
    }
}
