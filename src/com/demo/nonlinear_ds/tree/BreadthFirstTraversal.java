package com.demo.nonlinear_ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {

    public void breadthFirstTraversal(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public static void main(String args[]){

        BreadthFirstTraversal bft = new BreadthFirstTraversal();
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(8);
        treeNode.right.right = new TreeNode(9);
        bft.breadthFirstTraversal(treeNode);
    }

}


