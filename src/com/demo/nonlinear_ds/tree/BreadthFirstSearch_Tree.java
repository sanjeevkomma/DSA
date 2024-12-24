package com.demo.nonlinear_ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch_Tree {

    public static void breadthFirstSearch(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        System.out.println("Initial Queue: " + queueToString(queue)); // Debug: Initial queue state

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.println("Visited: " + current.data);

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
            sb.append(node.data).append(" ");
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
