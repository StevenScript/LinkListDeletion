package com.linkedlist;

public class LinkedList {
    private Node head;  // Points to the first node
    private Node tail;  // Track the last node

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Append a node with the given data at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode; // Update tail as well when the list is empty
        } else {
            tail.next = newNode; // Link the new node after tail
            tail = newNode;      // Update tail to point to the new node
        }
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
