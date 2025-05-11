package com.demo.core.linear_ds.linkedList.problems;

/*
Approach:
---------
1. reverse current node pointer to point to the prev node
2. move prev to current & current to next

Example:
--------
Input : null -> 1 -> 3 -> 5 -> 7 -> 9
Output : null <- 1 <- 3 <- 5 <- 7 <- 9

 */
public class LinkedList_Reversal {

    public static Node reverseList(Node head) {
        Node prev = null; // Previous node starts as null
        Node current = head; // Current node starts as head

        while (current != null) {
            Node nextTemp = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev forward
            current = nextTemp; // Move current forward
        }
        return prev; // New head of the reversed list
    }

    public static void main(String[] args) {
        // Create the list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);

        System.out.println("Original List:");
        printList(head);

        Node reversedHead = reverseList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }

    // Helper method to print a linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}