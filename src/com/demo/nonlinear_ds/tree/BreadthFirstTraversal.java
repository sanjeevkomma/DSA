package com.demo.nonlinear_ds.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 1. level-order traversal / level-order approach implementation
 2. level by level approach OR breadth by breadth approach
 3. Breadth-First Traversal is the process of visiting all the nodes in a tree or graph level by level
 or breadth by breadth, typically starting from a root node
 4. It uses a queue data structure to achieve this
 */

public class BreadthFirstTraversal {

    public static void breadthFirstTraversal(TreeNode rootNode) {
        if (rootNode == null) return;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(rootNode);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll(); // Remove & Return element
            System.out.print(currentNode.val + " ");

            if (currentNode.left != null){
                queue.add(currentNode.left);
            }
            if (currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
    }

    public static void main(String args[]){

        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(8);
        treeNode.right.right = new TreeNode(9);
        breadthFirstTraversal(treeNode);
    }

}


