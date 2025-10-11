package com.demo.core.algos.leetcode.Blind_75;

/*
Input: nums = [100,4,200,1,3,2]
Output: 4
Problem : Find the length of the longest consecutive elements sequence in an unsorted array of integers.
Approach : Use a HashSet to store numbers and expand sequences only from potential starting points (numbers where num - 1 doesn’t exist)
Strategy : Hash-based lookup and linear scan — ensures each element is processed only once for O(n) time complexity
Pattern : Set-based Search Pattern (similar to Sliding Window or Two-pointer in concept but applied via a HashSet for constant-time lookups)
Explanation: 1. Insert all numbers into a HashSet.
             2. For each number, check if it’s a sequence start (num-1 not in set).
             3. Count forward until num+k not found.
             4. Track maximum sequence length.
Time Complexity: O(n)
Space Complexity: O(n)
 */
public class LongestConsecutiveSequence {
}
