package com.demo.problems;

import java.util.HashMap;
import java.util.Map;

// HashMap , Doubly Linked List to be used

/** 
# Reference
1. [LRU Cache intruduction](https://www.youtube.com/watch?v=xDEuM5qa0zg)
2. [LRU Cache Coding](https://www.youtube.com/watch?v=Xc4sICC8m4M)
*/


 /* Time Complexity = O(1) for get & put operations
 * Space Complexity = 
 */

public class LRU_Cache {

	Node head = new Node(0, 0);
	Node tail = new Node(0,0);
	Map<Integer,Node> map = new HashMap<>();
	int capacity; 


	public LRU_Cache(int capacity) {
		this.capacity = capacity;
		head.nextNode = tail;
		tail.prevNode = head;
	}

	public int get(int key) {
		if ( map.containsKey(key) ) {
			Node node = map.get(key);
			remove(node); // Removing as its Last recently used
			insert(node);
			return node.value;
		}
		else {
			return -1;
		}
	}

	public void put(int key, int value) {

		if(map.containsKey(key) ) {
			remove(map.get(key));
		}
		if(map.size() == capacity) {
			remove(tail.prevNode);
		}
		insert(new Node(key,value));
	}

	private void remove(Node node) {

		map.remove(node.key);
		node.prevNode.nextNode = node.nextNode;
		node.nextNode.prevNode = node.prevNode;


	}

	private void insert(Node node) {

		map.put(node.key, node);
		Node headNext = head.nextNode;
		head.nextNode = node;
		node.prevNode = head;
		headNext.prevNode = node;
		node.nextNode = headNext;


	}


	public static void main(String[] args) {

		LRU_Cache cache = new LRU_Cache(3);

		cache.put(1,10);
		cache.put(2,20);
		cache.put(3,30);

		cache.get(2);
		cache.put(4, 40);
		//cache.put(5, 50);

		System.out.println(cache.map);


	}

}

// For Doubly Linked List
class Node {

	Node prevNode, nextNode;
	int key , value;
	Node(int key,int value){
		this.key = key;
		this.value = value;
	}
}
