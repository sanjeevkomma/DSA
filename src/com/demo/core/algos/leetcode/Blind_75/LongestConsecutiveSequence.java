package com.demo.core.algos.leetcode.Blind_75;

/*
Input: nums = [100,4,200,1,3,2]
Output: 4
Problem : Find the length of the longest consecutive elements sequence in an unsorted array of integers.
Approach : Use a HashSet to store numbers and expand sequences only from potential starting points (numbers where num - 1 doesn’t exist)
Strategy : Hash-based lookup and linear scan — ensures each element is processed only once for O(n) time complexity
Pattern : Set-based Search Pattern (similar to Sliding Window or Two-pointer in concept but applied via a HashSet for constant-time lookups)
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Time Complexity: O(n)
Space Complexity: O(n)
 */
public class LongestConsecutiveSequence {
}
