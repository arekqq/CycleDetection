package org.example;


import java.util.Collections;
import java.util.List;

/*
Given the list consisting of nodes of the following class:
Java
class Node {
    private final int value;
    private Node next;
    public Node(final int value) {
        this(value, null);
    }
    public Node(final int value, final Node next) {
      this.value = value;
      this.next = next;
    }

    public int getValue() {
        return value;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(final Node next) {
        this.next = next;
    }
}

Write a body for the following method:
public static boolean containsCycle(Node node) { }
that will check if there is a cycle and return such information.

Consider two lists with nodes' indexes:
1 -> 2 -> 3 -> 4 -> null - doesn't have a cycle
1 -> 2 -> 3 -> 4 -> 1 - do have a cycle
 */
public class Main {

    public static void main(String[] args) {
        // Creating a linked list without a cycle: 1 -> 2 -> 3 -> 4 -> null
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        System.out.println(containsCycle(node1)); // Output: false

        // Creating a linked list with a cycle: 1 -> 2 -> 3 -> 4 -> 1
        node3.setNext(node1); // Creating a cycle

        System.out.println(containsCycle(node1)); // Output: true
    }

    public static boolean containsCycle(Node node) {
        if (node == null) {
            return false; // An empty list cannot have a cycle
        }

        Collections.rotate(List.of(), 1);

        Node slowPointer = node; // This pointer moves one step at a time
        Node fastPointer = node; // This pointer moves two steps at a time

        while (fastPointer != null && fastPointer.getNext() != null) {
            slowPointer = slowPointer.getNext(); // Move slow pointer by one step
            fastPointer = fastPointer.getNext().getNext(); // Move fast pointer by two steps

            // If both pointers meet, there is a cycle
            if (slowPointer == fastPointer) {
                return true;
            }
        }

        return false; // If we reach here, there is no cycle
    }

}