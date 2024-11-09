package com.demo.nonlinear_ds.tree;

// Binary Search Tree (BST) Example

/**
 A binary search tree is a binary tree with an ordering constraint:
 for each node, all values in the left subtree are smaller,
 and all values in the right subtree are larger.
 BSTs allow efficient searching, insertion, and deletion.
 */

class BinarySearchTree {
    TreeNode root;

    // Insert a new node with given data
    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // In-order traversal of the tree (left-root-right)
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
}

public class BinarySearchTree_Example{

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        // Displaying in-order traversal
        bst.inOrder(bst.root);  // Output: 20 30 40 50 60 70 80
    }
}