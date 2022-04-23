
class Node {

	int data;

	Node nextNode;

	Node( int data ) { 

		this.data = data;

		this.nextNode = null; 
	}
}

class CustomLinkedList {

	private Node headNode; 

	public CustomLinkedList add( CustomLinkedList list, int data ) {

		// Create a new node with given data

		Node newNode = new Node(data);

		// If the Linked List is empty, then make the new node as head

		if ( list.headNode == null ) {

			list.headNode = newNode;
		}

		else {

			// Else traverse till the last node and insert the new_node there

			Node lastNode = list.headNode;

			while ( lastNode.nextNode != null ) {

				lastNode = lastNode.nextNode;
			}

			// Insert the new_node at last node
			lastNode.nextNode = newNode;
		}

		// Return the list by head
		return list;
	}

	public void findMiddleElement(CustomLinkedList list) {

		Node currentNode = list.headNode;

		Node middleNode = list.headNode;

		int length = 0;

		while( currentNode.nextNode != null ) {

			length ++ ;

			if( length % 2 == 0 ) {

				middleNode = middleNode.nextNode;

			}

			currentNode = currentNode.nextNode;
		}

		if( length % 2 == 1 ){

			middleNode = middleNode.nextNode;
		}

		System.out.println("length of LinkedList: " + length );

		System.out.println("middle element of LinkedList : " + middleNode.data );
	}

	public void printList(CustomLinkedList list) {

		Node currentNode = list.headNode;

		System.out.println("LinkedList: ");

		while ( currentNode != null ) {

			// Print the data at current node

			System.out.println(currentNode.data + " ");

			// Go to next node

			currentNode = currentNode.nextNode;
		}
	}

}


public class LinkedList_EX {

	public static void main(String[] args) {

		CustomLinkedList list = new CustomLinkedList();

		list = list.add(list, 10);
		list = list.add(list, 2);
		list = list.add(list, 53);
		list = list.add(list, 4);
		list = list.add(list, 65);
		list = list.add(list, 26);
		list = list.add(list, 87);
		list = list.add(list, 8);

		list.printList(list);

		list.findMiddleElement(list);
	}

}