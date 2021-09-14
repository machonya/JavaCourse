package com.company.lesson_9.LinkedList;

public class Node<T> {
    T value;
    Node<T> prev;
    Node<T> next;

    public Node(T value) {
        this.value = value;
    }
}
