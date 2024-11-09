package com.demo.nonlinear_ds.tree;

// Segment trees are used for efficient range queries on arrays.
class SegmentTree {
    int[] segmentTree;

    public SegmentTree(int[] arr) {
        int n = arr.length;
        segmentTree = new int[4 * n];
        buildTree(arr, 0, n - 1, 0);
    }

    private void buildTree(int[] arr, int low, int high, int pos) {
        if (low == high) {
            segmentTree[pos] = arr[low];
            return;
        }
        int mid = (low + high) / 2;
        buildTree(arr, low, mid, 2 * pos + 1);
        buildTree(arr, mid + 1, high, 2 * pos + 2);
        segmentTree[pos] = segmentTree[2 * pos + 1] + segmentTree[2 * pos + 2];
    }

    public int rangeQuery(int qlow, int qhigh, int low, int high, int pos) {
        if (qlow <= low && qhigh >= high) return segmentTree[pos];
        if (qlow > high || qhigh < low) return 0;
        int mid = (low + high) / 2;
        return rangeQuery(qlow, qhigh, low, mid, 2 * pos + 1) +
                rangeQuery(qlow, qhigh, mid + 1, high, 2 * pos + 2);
    }
}

public class SegmentTree_Example {
    public static void main(String args[]){

    }
}
