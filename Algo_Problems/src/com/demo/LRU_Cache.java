package com.demo;

import java.util.HashMap;
import java.util.Map;

// HashMap , Doubly Linked List to be used

public class LRU_Cache {
	
	Node head = new Node(0, 0);
	Node tail = new Node(0,0);
	Map<Integer,Node> map = new HashMap<Integer, Node>();
	int capacity; 
	
	
	public LRU_Cache(int _capacity) {
		capacity = _capacity;
		head.next = tail;
		tail.prev = head; 
	}
	
	public int get(int key) {
		if ( map.containsKey(key) ) {
			Node node = map.get(key);
			remove(node);
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
			remove(tail.prev);
		}
		insert(new Node(key,value));
	}
	
	private void insert(Node node) {
		
		map.put(node.key, node);
		Node headNext = head.next;
		head.next = node;
		node.prev = head;
		headNext.prev = node;
		node.next = headNext;
		
		
	}

	private void remove(Node node) {
		
		map.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
		
		
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


class Node {
	
	Node prev, next;
	int key , value;
	Node(int _key,int _value){
		key = _key;
		value = _value;
	}
}
