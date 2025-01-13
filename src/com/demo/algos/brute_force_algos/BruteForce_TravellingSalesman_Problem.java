package com.demo.algos.brute_force_algos;

import java.util.ArrayList;

/*
Input : int[][] graph = {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };
Output :  Minimum cost: 80
 */

public class BruteForce_TravellingSalesman_Problem {

    private static int findMinCost(int[][] graph, int start) {
        ArrayList<Integer> vertices = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (i != start) vertices.add(i);
        }

        int minCost = Integer.MAX_VALUE;
        do {
            int currentCost = 0, k = start;
            for (int i : vertices) {
                currentCost += graph[k][i];
                k = i;
            }
            currentCost += graph[k][start];
            minCost = Math.min(minCost, currentCost);
        } while (nextPermutation(vertices));

        return minCost;
    }

    private static boolean nextPermutation(ArrayList<Integer> nums) {
        int i = nums.size() - 2;
        while (i >= 0 && nums.get(i) >= nums.get(i + 1)) i--;
        if (i < 0) return false;

        int j = nums.size() - 1;
        while (nums.get(j) <= nums.get(i)) j--;
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);

        for (int left = i + 1, right = nums.size() - 1; left < right; left++, right--) {
            temp = nums.get(left);
            nums.set(left, nums.get(right));
            nums.set(right, temp);
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };

        System.out.println("Minimum cost: " + findMinCost(graph, 0));
    }
}

