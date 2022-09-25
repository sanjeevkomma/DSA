package com.demo.algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Find_Roman_City {

	public static void main(String[] args) {

		int a[] = {0, 1, 2, 4, 5};

		int b[] = {2, 3, 3, 3, 2};

		System.out.println(findRomeCityNumber(a,b));

	}

	public static int findRomeCityNumber(int[] A, int[] B) {

		Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();

		int indegree[] = new int[A.length + 1];

		Queue<Integer> queue = new LinkedList<Integer>();

		int outdegree[] = new int[A.length + 1];

		for ( int i = 0 ; i < A.length; i++ ) {

			List<Integer> list = adjList.getOrDefault(A[i], new ArrayList<>());

			list.add(B[i]);

			adjList.put(A[i], list);

			indegree[B[i]]++;

			outdegree[A[i]]++;
		}

		for(int i = 0 ; i < A.length + 1; i++) {

			if(indegree[i] == 0)

				queue.add(i);
		}

		int last = -1;

		int secondLast = -1;

		while(queue.size() > 0){

			int city = queue.remove();

			if( last == -1 )

				last = city;

			else {

				secondLast = last;

				last = city;
			}

			for( int neighbour: adjList.getOrDefault(city, new ArrayList<>()) ){

				indegree[neighbour]--;

				if( indegree[neighbour] == 0 )

					queue.add(neighbour);
			}

		}

		if( outdegree[secondLast] == 0 && outdegree[last] == 0 )

			return -1;

		return last;
	}

}
