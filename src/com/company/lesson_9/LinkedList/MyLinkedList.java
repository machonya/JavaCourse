package com.company.lesson_9.LinkedList;

public class MyLinkedList<T> {
    Node<T> head;
    Node<T> tail;


    public void add(T t) {
        Node<T> elem = new Node<>(t);
        elem.value = t;
        if (head == null) {
            head = elem;
            tail = elem;
        } else {
            tail.next = elem;
            elem.prev = tail;
            tail = elem;
        }

    }

    public void addFirst(T t) {
        Node<T> elem = new Node<>(t);
        elem.value = t;
        if (head == null) {
            head = elem;
            tail = elem;
        } else {
            head.prev = elem;
            elem.next = head;
            head = elem;
        }
    }

    public int getSize() {
        if (head == null) {
            return 0;
        }
        Node<T> current = head;
        int count = 1;
        while (current.next != null) {
            current = current.next;
            count += 1;
        }
        return count;
    }

    public boolean contains(T t) {
        if (head == null) {
            return false;
        }
        Node<T> elem = head;
        while (elem != null) {
            if (elem.value == t) {
                return true;
            }
            elem = elem.next;
        }
        return false;
    }


    public boolean remove(Integer index) {
        if (head == null) {
            return false;
        }
        Node<T> elem = head;
        if (index == 0) {
            head = head.next;
        }
        int count = 1;
        while (elem.next != null) {
            if (count == index) {
                elem.next = elem.next.next;
                return true;
            }
            elem = elem.next;
            count += 1;
        }
        return true;
    }

    public int indexOf(T t) {
        if (head == null) {
            return 0;
        }
        Node<T> currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (t == currentNode.value) {
                return index;
            }
            currentNode = currentNode.next;
            index += 1;

        }
        return -1;
    }


    public int lastIndexOf(T t) {
        if (head == null) {
            return 0;
        }
        Node<T> elem = tail;
        int index = getSize() - 1;
        while (elem.prev != null) {
            if (t == elem.value) {
                return index;
            }
            elem = elem.prev;
            index -= 1;
        }

        return -1;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public T get(Integer index) {
        if (head == null) {
            return null;
        }
        Node<T> elem = head;
        int count = 0;
        while (elem != null) {
            if (count == index) {
                return elem.value;
            }
            elem = elem.next;
            count += 1;
        }
        return elem.value;
    }


    public void getAll() {
        if (head == null) {
            return;
        }
        Node<T> elem = head;
        int count = 0;
        while (elem != null) {
            System.out.print(" элемент: " + elem.value + "; ");
            elem = elem.next;
            count++;
        }
        System.out.println(" ");
    }
}
