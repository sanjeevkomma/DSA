package com.demo.algos;

public class Minimum_Deletion_Cost {
	
	// https://leetcode.ca/2020-03-26-1578-Minimum-Deletion-Cost-to-Avoid-Repeating-Letters/

	public static void main(String[] args) {

		Minimum_Deletion_Cost obj = new Minimum_Deletion_Cost();
		
		String str = "abab";
		
		int cost[] = {1,2};
		
		int result = obj.minCost(str, cost);
		
		System.out.println(result);

	}

	public int minCost(String str, int[] cost) {

		int totalCost = 0;

		char prevCh = str.charAt(0);

		int maxCost = cost[0];

		int curTotalCost = cost[0];

		for ( int i = 1; i < str.length(); i++ ) {

			char ch = str.charAt(i);

			int curCost = cost[i];

			if ( ch == prevCh ) {

				maxCost = Math.max(maxCost, curCost);

				curTotalCost = curTotalCost + curCost;

			} else {

				totalCost += curTotalCost - maxCost;

				prevCh = ch;

				maxCost = curCost;

				curTotalCost = curCost;

			}
		}

		totalCost = totalCost + curTotalCost - maxCost;

		return totalCost;
	}

}
