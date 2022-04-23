
class Node {

	int data;

	Node next;

	Node(int data) { 

		this.data = data;

		this.next = null; 
	}
}

class CustomLinkedList {

	Node head; 

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

	public void printList(CustomLinkedList list) {

		Node currNode = list.head;

		System.out.print("LinkedList: ");

		while ( currNode != null ) {

			// Print the data at current node

			System.out.print(currNode.data + " ");

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
	}

}