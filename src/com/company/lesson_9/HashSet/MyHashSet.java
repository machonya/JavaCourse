package com.company.lesson_9.HashSet;

import com.company.lesson_9.LinkedList.MyLinkedList;
import com.company.lesson_9.LinkedList.MyLinkedList;
import com.company.lesson_9.LinkedList.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class MyHashSet<T> {
    MyLinkedList<T>[] hashArray = new MyLinkedList[16];

    int arraySize = hashArray.length;


    @Override
    public String toString() {
        return "IntegerHashSet{" +
                "hashArray=" + Arrays.toString(hashArray) +
                ", arraySize=" + arraySize;
    }

    public MyHashSet() {
    }

    public Integer hashFunc(T t) {
        return t.hashCode() % arraySize;

    }


    public void add(T t) {
        int key = hashFunc(t);
        if (hashArray[key] == null) {
            hashArray[key] = new MyLinkedList<>();

        }
        if (!hashArray[key].contains(t)) {
            hashArray[key].add(t);
        }
    }

    public void addAll(MyLinkedList<T> list){
        for (int i = 0; i < list.getSize(); i++) {
            add(list.get(i));
        }


    }

    public void view() {
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] == null) {
                System.out.println(i + " --> " + hashArray[i]);
            } else {
                System.out.print(i + " --> ");
                hashArray[i].getAll();
            }
        }
    }


    public boolean removeInd(T t) {
        if (hashArray[hashFunc(t)] != null) {
            if (hashArray[hashFunc(t)].contains(t)) {
                hashArray[hashFunc(t)].remove(hashArray[hashFunc(t)].indexOf(t));
                return true;
            }
        }
        return false;
    }

    public int sizeBucked(int index) {
        return hashArray[index].getSize();
    }

    public Integer size() {
        int count = 0;
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] != null)
                count += hashArray[i].getSize();
        }
        return count;
    }

    public boolean containsSet(T t) {
        if (hashArray[hashFunc(t)] != null) {
            if (hashArray[hashFunc(t)].contains(t)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] != null) return true;
        }
        return false;
    }
}
