package com.demo.nonlinear_ds.tree;

import java.util.LinkedList;
import java.util.Queue;
/**
 1. level-order traversal / level-order approach implementation
 2. level by level approach OR breadth by breadth approach
 3. Breadth-First Traversal is the process of visiting all the nodes in a tree or graph level by level
 or breadth by breadth, typically starting from a root node
 4. It uses a queue data structure to achieve this

 BFS (Queue):
 ------------
 1
 / \
 2   3
 / \    \
 4   5    6

 Traversal: [1, 2, 3, 4, 5, 6]

 Enqueue: Start with 1 → [2, 3] → [4, 5, 6]...

 */
public class BreadthFirstSearch {

    public static void breadthFirstSearch(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        System.out.println("Initial Queue: " + queueToString(queue)); // Debug: Initial queue state

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.println("Visited: " + current.val);

            // Add children to the queue
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);

            // Debug: Print current state of the queue
            System.out.println("Current Queue: " + queueToString(queue));
        }
    }

    // Helper method to represent the queue as a string
    public static String queueToString(Queue<TreeNode> queue) {
        StringBuilder sb = new StringBuilder();
        for (TreeNode node : queue) {
            sb.append(node.val).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        // Create the tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(9);

        // Perform BFS
        breadthFirstSearch(root);
    }
}
