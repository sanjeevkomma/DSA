package com.demo.nonlinear_ds.tree;

import java.util.ArrayList;
import java.util.Collections;

/*
A B+ Tree is an extension of a B-Tree where all keys are stored in the leaf nodes,
 and internal nodes only store the keys necessary for traversal,
 making the search and range query operations efficient.
 In B+ Trees, leaf nodes are linked, allowing for fast sequential access,
  which is beneficial for database indexing.
 */

// Order t: Defines the minimum degree (the maximum number of children each node can have).
// Node structure: Internal nodes only store keys, and leaf nodes store keys and pointers to other leaf nodes for quick sequential access.

class BPlusTreeNode {
    ArrayList<Integer> keys; // Node keys
    int t;                   // Minimum degree
    ArrayList<BPlusTreeNode> children; // Pointers to child nodes
    BPlusTreeNode next;      // Pointer to the next leaf node (used in leaf nodes only)
    boolean isLeaf;

    public BPlusTreeNode(int t, boolean isLeaf) {
        this.t = t;
        this.isLeaf = isLeaf;
        this.keys = new ArrayList<>();
        this.children = new ArrayList<>();
        this.next = null;
    }

    // Insert a new key into this node
    void insertNonFull(int key) {
        if (isLeaf) {
            keys.add(key);
            Collections.sort(keys);  // Keep keys sorted
        } else {
            int i = 0;
            while (i < keys.size() && key > keys.get(i)) {
                i++;
            }

            if (children.get(i).keys.size() == 2 * t - 1) {
                splitChild(i);
                if (key > keys.get(i)) {
                    i++;
                }
            }
            children.get(i).insertNonFull(key);
        }
    }

    // Split the child node at index i
    void splitChild(int i) {
        BPlusTreeNode y = children.get(i);
        BPlusTreeNode z = new BPlusTreeNode(y.t, y.isLeaf);
        int mid = t - 1;

        if (y.isLeaf) {
            z.keys.addAll(y.keys.subList(mid, y.keys.size()));
            y.keys.subList(mid, y.keys.size()).clear();
            z.next = y.next;
            y.next = z;
        } else {
            keys.add(i, y.keys.get(mid));
            z.keys.addAll(y.keys.subList(mid + 1, y.keys.size()));
            y.keys.subList(mid, y.keys.size()).clear();
            z.children.addAll(y.children.subList(mid + 1, y.children.size()));
            y.children.subList(mid + 1, y.children.size()).clear();
        }
        children.add(i + 1, z);
    }

    // Traverse the tree and print keys in sorted order
    void traverse() {
        if (isLeaf) {
            for (int key : keys) {
                System.out.print(key + " ");
            }
        } else {
            for (int i = 0; i < keys.size(); i++) {
                children.get(i).traverse();
                System.out.print(keys.get(i) + " ");
            }
            children.get(keys.size()).traverse();
        }
    }

    // Search for a key in the tree
    BPlusTreeNode search(int key) {
        if (isLeaf) {
            return keys.contains(key) ? this : null;
        }
        int i = 0;
        while (i < keys.size() && key > keys.get(i)) {
            i++;
        }
        return children.get(i).search(key);
    }
}

class BPlusTree {
    BPlusTreeNode root;
    int t; // Minimum degree

    public BPlusTree(int t) {
        this.root = null;
        this.t = t;
    }

    // Function to insert a key in this B+ Tree
    void insert(int key) {
        if (root == null) {
            root = new BPlusTreeNode(t, true);
            root.keys.add(key);
        } else {
            if (root.keys.size() == 2 * t - 1) {
                BPlusTreeNode newRoot = new BPlusTreeNode(t, false);
                newRoot.children.add(root);
                newRoot.splitChild(0);
                int i = 0;
                if (newRoot.keys.get(0) < key) {
                    i++;
                }
                newRoot.children.get(i).insertNonFull(key);
                root = newRoot;
            } else {
                root.insertNonFull(key);
            }
        }
    }

    // Traverse the tree
    void traverse() {
        if (root != null) {
            root.traverse();
            System.out.println();
        }
    }

    // Search for a key in the B+ Tree
    BPlusTreeNode search(int key) {
        return root == null ? null : root.search(key);
    }
}

public class BPlusTree_Example {
    public static void main(String[] args) {
        BPlusTree tree = new BPlusTree(3); // B+ Tree of order 3

        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(6);
        tree.insert(12);
        tree.insert(30);
        tree.insert(7);
        tree.insert(17);

        System.out.println("Traversal of the B+ tree:");
        tree.traverse(); // Output: 5 6 7 10 12 17 20 30

        int key = 6;
        System.out.println("\nSearching for key " + key + ":");
        System.out.println(tree.search(key) != null ? "Found" : "Not Found");

        key = 15;
        System.out.println("Searching for key " + key + ":");
        System.out.println(tree.search(key) != null ? "Found" : "Not Found");
    }
}

// Output
/*
Traversal of the B+ tree:
5 6 7 10 12 17 20 30

Searching for key 6:
Found
Searching for key 15:
Not Found

 */