package com.demo.patterns.TopKElements;

import java.util.PriorityQueue;
/*
1. The Top 'K' Elements pattern finds the top k largest or smallest elements in an array
 or stream of data using heaps or sorting.

Explanation:
------------
   1. Min-Heap Setup:
        i) Use a PriorityQueue to maintain the 𝑘 largest elements encountered so far
        ii) The heap root (smallest element in the heap) is the k-th largest.
   2. Add Elements:
        i) Traverse the array, adding each element to the heap.
        ii) If the heap size exceeds k, remove the smallest element (poll()).
   3. Result:
        i) At the end of traversal, the root of the heap (peek()) is the k-th largest element.


Time Complexity: O(Nlogk)
----------------
   * O(Nlogk), where N is the size of the array.
   * Inserting into the heap takes O(logk), and we process N elements

Space Complexity: O(k) for the heap

 */


public class TopKElements_MinHeap {

    public int findKthLargest(int nums[], int k) {
        // Min-Heap to store the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(k);

        for (int num : nums) {
            minHeap.add(num); // Add current number to the heap
            // Ensure the heap contains only k elements
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element
            }
        }

        // The root of the heap is the k-th largest element
        return minHeap.peek();
    }

    public static void main(String args[]) {

        int nums[] = {3, 2, 1, 5, 6, 4};
        int k = 4;

        TopKElements_MinHeap solution = new TopKElements_MinHeap();
        int result = solution.findKthLargest(nums, k);

        System.out.println("The " + k + "-th largest element is: " + result);
        // Output: The 2-th largest element is: 5
    }
}
