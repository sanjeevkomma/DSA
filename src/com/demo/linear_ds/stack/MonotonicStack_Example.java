package com.demo.linear_ds.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Explanation:
-----------
1) Use a stack to keep track of elements for which we haven't found the next greater element yet
2) Iterate through the array, and for each element, pop elements from the stack until you find a greater element.
3) If the stack is not empty, set the result for index at the top of the stack to current element
4) Push the current element onto the stack.

1. Building the HashMap:
---------------------------
* A HashMap hm is used to store the next greater element for each number in nums2
* A Stack st is used to keep track of the elements in decreasing order.
* The code iterates through nums2 in reverse order
        * If the current element is greater than the top element of the stack, the top element is popped until
        the stack is empty or the top element is greater than or equal to the current element.
        * If the stack is empty, it means there is no greater element to the right of the current element, so -1 is stored in the hm for the current element.
        * Otherwise, the top element of the stack is the next greater element, so it is stored in the hm for the current element
        * The current element is pushed onto the stack.
2. Finding Next Greater Elements for nums1:
-----------------------------------------
* The code iterates through nums1.
* For each element in nums1, the corresponding next greater element is retrieved from the hm and stored in the ans array.
3. Return Result:
---------------
* The ans array containing the next greater elements for each element in nums1 is returned.

Input: nums1[] = {1, 3, 5, 2, 4}, nums2[] = {6, 5, 4, 3, 2, 1, 7};
Output: [7, 7, 7, 7, 7]
 */
public class MonotonicStack_Example {

    public static int[] nextGreaterElement(int nums1[], int nums2[]) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // Map to store the next greater element for each number in nums2
        Stack<Integer> stack = new Stack<Integer>(); // Stack to help find the next greater element

        // Traverse nums2 and populate the map with next greater elements
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num); // Map the smaller number to the current number as its next greater
            }
            stack.push(num);
        }

        // For remaining elements in the stack, there is no greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build the result array for nums1 using the map
        int result[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }

    public static void main(String[] args) {
        int nums1[] = {1, 3, 5, 2, 4};
        int nums2[] = {6, 5, 4, 3, 2, 1, 7};

        int result[] = nextGreaterElement(nums1, nums2);

        // Print the result
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
