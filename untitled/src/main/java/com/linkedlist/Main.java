package com.linkedlist;

public class Main {
    public static void main(String[] args) {
        // Create an instance of LinkedList
        LinkedList list = new LinkedList();

        // Append nodes to the list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        // Print the original list
        System.out.println("Original List:");
        list.printList();

        // Test 1: Delete the head node (10)
        System.out.println("\nDeleting head node (10):");
        list.delete(10);
        list.printList();

        // Test 2: Delete a middle node (30)
        System.out.println("\nDeleting middle node (30):");
        list.delete(30);
        list.printList();

        // Test 3: Delete the tail node (50)
        System.out.println("\nDeleting tail node (50):");
        list.delete(50);
        list.printList();

        // Test 4: Attempt to delete a non-existent node (100)
        System.out.println("\nAttempting to delete a non-existent value (100):");
        list.delete(100);
        list.printList();
    }
}