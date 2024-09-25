package org.example;

import java.util.List;
import java.util.Set;

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
        Set.of().contains();
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(final Node next) {
        this.next = next;
    }
}
