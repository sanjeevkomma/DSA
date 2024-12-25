# Definition
* Dynamic Programming (DP) is a powerful technique for solving optimization problems that involve breaking down a problem into smaller overlapping subproblems.
* It is particularly useful when a naive recursive solution would result in solving the same subproblems multiple times, leading to inefficiencies

# Memoization in Dynamic Programming
* Memoization is a specific strategy used in DP where you store the results of previously solved subproblems in a data structure (like an array, dictionary, or hash map).
* When the same subproblem arises again, you can retrieve its result from the storage instead of recomputing it.
* This technique transforms a naive recursive algorithm into a more efficient one by avoiding redundant calculations

# Key Characteristics of Memoization
1. **Top-Down Approach:** It starts solving the problem from the main problem and divides it into subproblems as needed.
2. **Recursive:** The solution is usually implemented recursively.
3. **Storage:** A data structure (e.g., dictionary or array) is used to store the results of subproblems.

# Steps to Implement Memoization
1. **Identify Subproblems:** Determine the smaller problems that overlap and are solved repeatedly.
2. **Choose a Data Structure:** Use an array, dictionary, or similar data structure to store intermediate results.
3. **Modify the Recursion:** Before solving a subproblem, check if the result is already stored. If yes, return it; if not, compute and store it.



# Approaches for Dynamic Programming


# Reference
* [Dynamic Programming](https://www.javatpoint.com/dynamic-programming)
* [Tabulation vs Memoization](https://www.javatpoint.com/tabulation-vs-memoization)

