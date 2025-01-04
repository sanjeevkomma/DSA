package com.demo.nonlinear_ds.tree;

/*
1. A binary tree is a tree data structure where each node has at most two children,
referred to as the left child and the right child.
2. This structure is commonly used as a foundation for more specific types of trees
  like binary search trees (BST) and binary heaps.
3. Binary Tree Traversal involves visiting all the nodes in a binary tree in a specific order.
       * PreOrder: root -> left -> right
       * InOrder: left -> root -> right
       * PostOrder: left -> right -> root
4. Use Recursion or Stack to traverse the tree in order
 */

class BinaryTree {
    TreeNode root;

    // Traversal methods for the binary tree
    public void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.val + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.val + " ");
        }
    }
}
public class BinaryTreeTraversal_Example {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.print("In-order traversal: ");
        tree.inOrder(tree.root);
        System.out.print("\nPre-order traversal: ");
        tree.preOrder(tree.root);
        System.out.print("\nPost-order traversal: ");
        tree.postOrder(tree.root);
    }
}

