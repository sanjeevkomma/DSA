
class Node {

	int data;

	Node next;

	Node( int data ) { 

		this.data = data;

		this.next = null; 
	}
}

class CustomLinkedList {

	private Node head; 
	
	private Node tail;
	
	/*public CustomLinkedList(){

		this.head = new Node("head");

		tail = head;
	}*/

	public CustomLinkedList add( CustomLinkedList list, int data ) {

		// Create a new node with given data

		Node new_node = new Node(data);

		// If the Linked List is empty, then make the new node as head

		if ( list.head == null ) {

			list.head = new_node;
		}

		else {

			// Else traverse till the last node and insert the new_node there

			Node last = list.head;

			while ( last.next != null ) {

				last = last.next;
			}

			// Insert the new_node at last node
			last.next = new_node;
		}

		// Return the list by head
		return list;
	}
	
	public void findMiddleElement(CustomLinkedList list) {

		Node current = list.head;

		Node middle = list.head;

		int length = 0;

		while( current.next != null ) {

			length ++ ;

			if( length % 2 == 0 ) {

				middle = middle.next;

			}

			current = current.next;
		}

		if( length % 2 == 1 ){

			middle = middle.next;
		}

		System.out.println("length of LinkedList: " + length );
		
		System.out.println("middle element of LinkedList : " + middle.data );
	}

	public void printList(CustomLinkedList list) {

		Node currNode = list.head;

		System.out.println("LinkedList: ");

		while ( currNode != null ) {

			// Print the data at current node

			System.out.println(currNode.data + " ");

			// Go to next node

			currNode = currNode.next;
		}
	}

}


public class LinkedList_EX {

	public static void main(String[] args) {

		CustomLinkedList list = new CustomLinkedList();

		list = list.add(list, 1);
		list = list.add(list, 2);
		list = list.add(list, 3);
		list = list.add(list, 4);
		list = list.add(list, 5);
		list = list.add(list, 6);
		list = list.add(list, 7);
		list = list.add(list, 8);

		list.printList(list);
		
		list.findMiddleElement(list);
	}

}