package org.example;

public class Node {
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
