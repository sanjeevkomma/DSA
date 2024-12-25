package com.demo.nonlinear_ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 Definition
 ----------
 * DFS explores as far as possible along each branch before backtracking.
 * It uses a stack (or recursion) to achieve this.

 Characteristics
 ---------------
 * Goes deep along a branch until it can’t go further, then backtracks.
 * Can use recursive or iterative (stack-based) implementation.
 * Explores paths in depth order.

 Algorithm
 ---------
 1. Push the root/start node to the stack
 2. While the stack is not empty
       i) Pop the top node.
       ii) Process it.
       iii) Push its neighbors/children

 DFS (Stack):
 Example (Preorder in Trees):
 ----------------------------
 Tree:
  7
 / \
 2   5
 / \    \
 9   6    3

 DFS Output (Preorder): [7, 2, 9, 6, 5, 3]

 Push/Pop: Start with 7 → Push 2 → Push 9 → Pop 9 → Push 6 → Pop 6...
 */
public class DepthFirstSearch {

    public List<Integer> depthFirstSearch(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            result.add(currentNode.data); // Process the node

            // Push right and then left child to the stack
            // Right first ensures that left is processed first
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Build the tree: [7, 2, 5, 9, 6, null, 3]
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(3);

        DepthFirstSearch dfs = new DepthFirstSearch();
        List<Integer> result = dfs.depthFirstSearch(root);

        System.out.println(result); // Output: [7, 2, 9, 6, 5, 3]
    }
}