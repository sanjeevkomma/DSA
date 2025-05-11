package com.demo.core.linear_ds.linkedList.problems;

class CustomLinkedList {

	private Node headNode;

	// insert
	public void add(int data) {

		Node newNode = new Node(data);

		if( headNode == null ) {

			headNode = newNode;

		} else {

			Node currentNode = headNode;

			while( currentNode.next != null ) {

				currentNode = currentNode.next;
			}

			currentNode.next = newNode;
		}
	}


	// insertAtStart
	public void insertAtStart(int data) {

		Node newNode = new Node(data);

		newNode.next = headNode;

		headNode = newNode;
	}

	// insertAt
	public void insertAt(int index, int data) {

		if( index == 0 ){

			insertAtStart(data); //We already have a function to do this.
		}
		else {

			Node newNode = new Node(data);

			Node currentNode = headNode;

			for( int i = 0; i < index - 1; i++ ) {

				currentNode = currentNode.next;
			}

			newNode.next = currentNode.next;

			currentNode.next = newNode;
		}
	}

	// deleteAt
	public void deleteAt(int index) {

		if( index == 0 ) {

			headNode = headNode.next;

		} else {

			Node currentNode = headNode;

			for( int i = 0; i < index - 1; i++ ) {

				currentNode = currentNode.next;
			}

			currentNode.next = currentNode.next.next;
		}
	}

	// show
	public void show() {

		Node currentNode = headNode;

		if( currentNode == null ){

			System.out.println("Linked list is empty");
		}

		else {
			System.out.print("elements in Linked list: ");
			while( currentNode != null ) {

				System.out.print(currentNode.val + " ");

				currentNode = currentNode.next;
			}
		}
	}

	// findMiddleElement
	public void findMiddleElement() {

		Node currentNode = headNode;

		Node middleNode = headNode;

		int length = 0;

		while( currentNode.next != null ) {

			length ++ ;

			if( length % 2 == 0 ) {

				middleNode = middleNode.next;

			}

			currentNode = currentNode.next;
		}

		if( length % 2 == 1 ){

			middleNode = middleNode.next;
		}

		System.out.println("length of LinkedList: " + length );

		System.out.println("middle element of LinkedList : " + middleNode.val );
	}

}

public class CustomLinkedList_Example {

	public static void main(String[] args) {

		CustomLinkedList list = new CustomLinkedList();

		list.add(12); // 1

		list.add(43);  // 2
		list.add(3);  // 3
		list.add(5);  // 4
		list.add(66);  // 5
		list.add(23);  // 6
		list.add(162);  // 7
		list.add(88);  // 8
		list.add(44);  // 9

		list.insertAtStart(191);

		list.insertAt(2, 2222);

		list.deleteAt(2);
		
		list.findMiddleElement();

		list.show();
	}
}
