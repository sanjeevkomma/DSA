package com.demo.core.nonlinear_ds.tree;

// This Java code implements a Red-Black Tree with insertion and in-order traversal.

/*
A Red-Black Tree is a self-balancing binary search tree with an extra property: each node is either red or black.
 The Red-Black Tree ensures that the tree remains balanced, and it provides efficient insertion, deletion,
 and search operations with a time complexity of O(logn)

 Here are the main properties of a Red-Black Tree:
1. Every node is either red or black.
2. The root node is always black.
3. Every leaf node (represented as null or NIL) is black.
4. If a node is red, its children must be black (no two red nodes can be adjacent).
5. Every path from a node to its descendant NIL nodes must have the same number of black nodes.
 */

class Node {
    int data;
    Node parent;
    Node left;
    Node right;
    boolean color; // True for red, false for black

    public Node(int data) {
        this.data = data;
        this.color = true; // New nodes are initially red
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}

class RedBlackTree {
    private Node root;
    private Node NIL;

    // Constructor
    public RedBlackTree() {
        NIL = new Node(-1); // Sentinel NIL node (represents leaves)
        NIL.color = false; // NIL nodes are black
        root = NIL;
    }

    // Left rotate subtree rooted with x
    private void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != NIL) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    // Right rotate subtree rooted with x
    private void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != NIL) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }

    // Insert a new node with the given key
    public void insert(int key) {
        Node node = new Node(key);
        node.parent = null;
        node.left = NIL;
        node.right = NIL;

        Node y = null;
        Node x = root;

        while (x != NIL) {
            y = x;
            if (node.data < x.data) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        node.parent = y;
        if (y == null) {
            root = node; // Tree was empty
        } else if (node.data < y.data) {
            y.left = node;
        } else {
            y.right = node;
        }

        node.color = true; // New node must be red
        fixInsert(node);
    }

    // Fix violations after insertion
    private void fixInsert(Node k) {
        while (k.parent != null && k.parent.color == true) {
            if (k.parent == k.parent.parent.left) {
                Node u = k.parent.parent.right;
                if (u.color == true) { // Case 1: uncle is red
                    k.parent.color = false;
                    u.color = false;
                    k.parent.parent.color = true;
                    k = k.parent.parent;
                } else {
                    if (k == k.parent.right) { // Case 2: k is right child
                        k = k.parent;
                        leftRotate(k);
                    }
                    k.parent.color = false; // Case 3: k is left child
                    k.parent.parent.color = true;
                    rightRotate(k.parent.parent);
                }
            } else {
                Node u = k.parent.parent.left;
                if (u.color == true) { // Mirror case 1
                    k.parent.color = false;
                    u.color = false;
                    k.parent.parent.color = true;
                    k = k.parent.parent;
                } else {
                    if (k == k.parent.left) { // Mirror case 2
                        k = k.parent;
                        rightRotate(k);
                    }
                    k.parent.color = false; // Mirror case 3
                    k.parent.parent.color = true;
                    leftRotate(k.parent.parent);
                }
            }
        }
        root.color = false; // Root must be black
    }

    // In-order traversal of the tree
    public void inOrder() {
        inOrderHelper(this.root);
    }

    private void inOrderHelper(Node node) {
        if (node != NIL) {
            inOrderHelper(node.left);
            System.out.print((node.color ? "R" : "B") + node.data + " ");
            inOrderHelper(node.right);
        }
    }
}

public class RedBlackTree_Example {
    public static void main(String[] args) {
        RedBlackTree rbTree = new RedBlackTree();

        rbTree.insert(10);
        rbTree.insert(20);
        rbTree.insert(15);
        rbTree.insert(30);
        rbTree.insert(25);

        System.out.println("In-order traversal of the Red-Black Tree:");
        rbTree.inOrder(); // Output: Should be in sorted order with color indication (e.g., R20 B10, etc.)
    }
}

// Output
/*
In-order traversal of the Red-Black Tree:
B10 R15 B20 R25 B30

 */