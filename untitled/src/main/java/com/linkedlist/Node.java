package com.linkedlist;

public class Node {
    public int data; // Data held by the node
    public Node next; // Reference to the next node

    public Node(int data) {
        this.data = data;
        this.next = null; // Initially,there's no next node
    }
}