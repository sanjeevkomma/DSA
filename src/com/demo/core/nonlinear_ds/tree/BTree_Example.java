package com.demo.core.nonlinear_ds.tree;

/*
A B-Tree is a self-balancing tree data structure that maintains sorted data and allows search,
sequential access, insertion, and deletion in logarithmic time. Unlike binary trees,
each node in a B-Tree can have multiple children and keys, which makes B-Trees suitable for database
 and file systems, where data is often stored on disk.
 */

/*
Order t: Defines the minimum number of children each node should have.
Node structure: Each node contains multiple keys and children pointers.
Insertion: This example includes insertion, which splits nodes when necessary.
 */
class BTreeNode {
    int[] keys;  // Array of keys
    int t;       // Minimum degree (defines the range for number of keys)
    BTreeNode[] children; // Array of child pointers
    int n;       // Current number of keys
    boolean isLeaf; // True if leaf node

    // Constructor
    BTreeNode(int t, boolean isLeaf) {
        this.t = t;
        this.isLeaf = isLeaf;
        this.keys = new int[2 * t - 1];  // Max number of keys in a node
        this.children = new BTreeNode[2 * t]; // Max number of children
        this.n = 0;  // Initially no keys in this node
    }

    // Insert a new key in this node
    void insertNonFull(int key) {
        int i = n - 1;

        if (isLeaf) {
            // Find location of new key to be inserted and move all greater keys one space ahead
            while (i >= 0 && keys[i] > key) {
                keys[i + 1] = keys[i];
                i--;
            }

            keys[i + 1] = key;
            n++;
        } else {
            // Find the child to insert the new key
            while (i >= 0 && keys[i] > key) {
                i--;
            }
            if (children[i + 1].n == 2 * t - 1) {
                splitChild(i + 1, children[i + 1]);

                if (keys[i + 1] < key) {
                    i++;
                }
            }
            children[i + 1].insertNonFull(key);
        }
    }

    // Split the child y of this node
    void splitChild(int i, BTreeNode y) {
        BTreeNode z = new BTreeNode(y.t, y.isLeaf);
        z.n = t - 1;

        for (int j = 0; j < t - 1; j++) {
            z.keys[j] = y.keys[j + t];
        }
        if (!y.isLeaf) {
            for (int j = 0; j < t; j++) {
                z.children[j] = y.children[j + t];
            }
        }

        y.n = t - 1;
        for (int j = n; j >= i + 1; j--) {
            children[j + 1] = children[j];
        }
        children[i + 1] = z;

        for (int j = n - 1; j >= i; j--) {
            keys[j + 1] = keys[j];
        }
        keys[i] = y.keys[t - 1];
        n++;
    }

    // A function to traverse all nodes in a subtree rooted with this node
    void traverse() {
        int i;
        for (i = 0; i < n; i++) {
            if (!isLeaf) {
                children[i].traverse();
            }
            System.out.print(keys[i] + " ");
        }
        if (!isLeaf) {
            children[i].traverse();
        }
    }

    // A function to search a key in this subtree
    BTreeNode search(int key) {
        int i = 0;
        while (i < n && key > keys[i]) {
            i++;
        }
        if (keys[i] == key) {
            return this;
        }
        if (isLeaf) {
            return null;
        }
        return children[i].search(key);
    }
}

class BTree {
    BTreeNode root;
    int t;  // Minimum degree

    // Constructor
    BTree(int t) {
        this.root = null;
        this.t = t;
    }

    // Function to insert a key in this B-tree
    void insert(int key) {
        if (root == null) {
            root = new BTreeNode(t, true);
            root.keys[0] = key;
            root.n = 1;
        } else {
            if (root.n == 2 * t - 1) {
                BTreeNode s = new BTreeNode(t, false);
                s.children[0] = root;
                s.splitChild(0, root);

                int i = 0;
                if (s.keys[0] < key) {
                    i++;
                }
                s.children[i].insertNonFull(key);
                root = s;
            } else {
                root.insertNonFull(key);
            }
        }
    }

    // Function to traverse the tree
    void traverse() {
        if (root != null) {
            root.traverse();
        }
    }

    // Function to search a key in this B-tree
    BTreeNode search(int key) {
        return root == null ? null : root.search(key);
    }
}

public class BTree_Example {
    public static void main(String[] args) {
        BTree t = new BTree(3); // A B-Tree with minimum degree 3

        t.insert(10);
        t.insert(20);
        t.insert(5);
        t.insert(6);
        t.insert(12);
        t.insert(30);
        t.insert(7);
        t.insert(17);

        System.out.println("Traversal of the B-tree is:");
        t.traverse();  // Output: 5 6 7 10 12 17 20 30

        int key = 6;
        System.out.println("\n\nSearching for key " + key + ":");
        System.out.println(t.search(key) != null ? "Found" : "Not Found");

        key = 15;
        System.out.println("Searching for key " + key + ":");
        System.out.println(t.search(key) != null ? "Found" : "Not Found");
    }
}

//Output
/*
Traversal of the B-tree is:
5 6 7 10 12 17 20 30

Searching for key 6:
Found
Searching for key 15:
Not Found

 */