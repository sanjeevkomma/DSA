package com.demo.nonlinear_ds.tree;

import java.util.Stack;

public class DepthFirstTraversal {
    TreeNode root;

    // Recursive Depth-First Traversal (Preorder)
    public void depthFirstTraversalRecursive(TreeNode node) {
        if (node == null) return;

        System.out.print(node.val + " "); // Visit node
        depthFirstTraversalRecursive(node.left);  // Visit left subtree
        depthFirstTraversalRecursive(node.right); // Visit right subtree
    }

    // Iterative Depth-First Traversal (Preorder using Stack)
    public void depthFirstTraversalIterative(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + " "); // Visit node

            // Push right child first so that left child is processed first
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    public static void main(String[] args) {

        DepthFirstTraversal dft = new DepthFirstTraversal();

        TreeNode tree = new TreeNode(1);

        // Creating a simple tree
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        System.out.println("Depth-First Traversal (Recursive - Preorder):");
        dft.depthFirstTraversalRecursive(tree);
        System.out.println();

        System.out.println("Depth-First Traversal (Iterative - Preorder):");
        dft.depthFirstTraversalIterative(tree);
    }
}
