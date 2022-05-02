
public class LinkedList_Example {

	public static void main(String[] args) {

		CustomLinkedList list = new CustomLinkedList();

		list.add(12);

		list.add(43);

		list.insertAtStart(191);

		list.insertAt(2, 2222);

		list.deleteAt(2);
		
		list.findMiddleElement();

		list.show();
	}
}

class Node {

	int data; 

	Node nextNode; 

	Node(int data) {

		this.data = data;
		
		this.nextNode = null; 
	}
}

class CustomLinkedList {

	Node headNode;

	// insert
	public void add(int data) {

		Node newNode = new Node(data);

		if( headNode == null ) {

			headNode = newNode;

		} else {

			Node currentNode = headNode;

			while( currentNode.nextNode != null ) {

				currentNode = currentNode.nextNode;
			}

			currentNode.nextNode = newNode;
		}
	}   

	
	// insertAtStart
	public void insertAtStart(int data) {

		Node newNode = new Node(data);

		newNode.nextNode = headNode;

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

				currentNode = currentNode.nextNode;
			}

			newNode.nextNode = currentNode.nextNode;

			currentNode.nextNode = newNode;
		}
	}

	// deleteAt
	public void deleteAt(int index) {

		if( index == 0 ) {

			headNode = headNode.nextNode;

		} else {

			Node currentNode = headNode;

			for( int i = 0; i < index - 1; i++ ) {

				currentNode = currentNode.nextNode;
			}

			currentNode.nextNode = currentNode.nextNode.nextNode;
		}
	}

	// show
	public void show() {

		Node currentNode = headNode;

		if( currentNode == null ){

			System.out.println("Linked list is empty");
		}

		else {

			while( currentNode != null ) {

				System.out.print(currentNode.data + " ");

				currentNode = currentNode.nextNode;
			}
		}
	}

	// findMiddleElement
	public void findMiddleElement() {

		Node currentNode = headNode;

		Node middleNode = headNode;

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

}