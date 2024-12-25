package com.demo.nonlinear_ds.tree;

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

 Example (Preorder in Trees):
 ----------------------------
 Tree:
  1
 / \
 2   3
 / \    \
 4   5    6

 DFS Output (Preorder): [1, 2, 4, 5, 3, 6]

 Push/Pop: Start with 1 → Push 2 → Push 4 → Pop 4 → Push 5 → Pop 5...
 */
public class DepthFirstSearch {
}
