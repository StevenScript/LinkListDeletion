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

    // Delete the first occurrence of a node with the given value
    public void delete(int value) {
        // Case 0: List is empty - "if the link doesn't"
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        // The head node holds the value to be deleted - "delete at the beginning"
        if (head.data == value) {
            head = head.next;  // Move head pointer to the next node
            // If the list becomes empty, update tail as well
            if (head == null) {
                tail = null;
            }
            return;
        }

        // Traverse the list to find the node to delete (could be middle or tail) - "Delete anywhere"
        Node current = head;
        Node previous = null;
        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }

        // If we reached the end without finding the value
        // AKA If the node with the given value is not found in the list -"if the link doesn't"
        if (current == null) {
            System.out.println("Value " + value + " not found in the list.");
            return;
        }

        // Bypass the node to delete it (general deletion for middle or tail) - "delete anywhere"
        previous.next = current.next;

        // Delete at the ending - if the deleted node was the tail, update the tail pointer - "delete at the ending"
        if (current == tail) {
            tail = previous;
        }
    }
}
