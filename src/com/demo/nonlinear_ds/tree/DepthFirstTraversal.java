package com.demo.nonlinear_ds.tree;

import java.util.Stack;

public class DepthFirstTraversal {

    // Recursive Depth-First Traversal (Preorder)
    public void depthFirstTraversalRecursive_Preorder(TreeNode node) {
        if (node == null) return;

        System.out.print(node.val + " "); // Visit node
        depthFirstTraversalRecursive_Preorder(node.left);  // Visit left subtree
        depthFirstTraversalRecursive_Preorder(node.right); // Visit right subtree
    }

    // Recursive Depth-First Traversal (Postorder)
    public void depthFirstTraversalRecursive_Postorder(TreeNode node) {
        if (node == null) return;

        depthFirstTraversalRecursive_Postorder(node.left);  // Visit left subtree
        depthFirstTraversalRecursive_Postorder(node.right); // Visit right subtree
        System.out.print(node.val + " "); // Visit node
    }

    // Iterative Depth-First Traversal (Preorder using Stack)
    public void depthFirstTraversalIterative_Preorder(TreeNode root) {
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
    // Iterative Depth-First Traversal (Postorder using Stack)
    public void depthFirstTraversalIterative_Postorder(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);

            if (node.left != null) stack1.push(node.left);
            if (node.right != null) stack1.push(node.right);
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().val + " ");
        }
    }

    public static void main(String[] args) {

        DepthFirstTraversal dft = new DepthFirstTraversal();

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        System.out.println("Depth-First Traversal (Recursive - Preorder):");
        dft.depthFirstTraversalRecursive_Preorder(tree);
        System.out.println();

        System.out.println("Depth-First Traversal (Iterative - Preorder):");
        dft.depthFirstTraversalIterative_Preorder(tree);
        System.out.println();

        System.out.println("Depth-First Traversal (Recursive - Postorder):");
        dft.depthFirstTraversalRecursive_Postorder(tree);
        System.out.println();

        System.out.println("Depth-First Traversal (Iterative - Postorder):");
        dft.depthFirstTraversalIterative_Postorder(tree);
    }
}
