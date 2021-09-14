package com.company.lesson_9.HashSet;

import com.company.lesson_9.LinkedList.MyLinkedList;

public class Run {
    public static void main(String[] args) {
        MyHashSet<String> hashSet = new MyHashSet<>();
        MyLinkedList<String> list1 = new MyLinkedList<>();

        list1.add("12");
        list1.add("18");
        list1.add("14");

//        hashSet.add(221);
//        hashSet.add(2);
//        hashSet.add(45);
//        hashSet.add(452);
//        hashSet.add(454);
//        hashSet.add(455);
//        hashSet.add(457);
//        hashSet.add(145);
//        hashSet.add(245);
//        hashSet.add(345);
//        hashSet.add(415);
//        hashSet.add(425);
//        hashSet.add(435);
//        hashSet.add(41);

        hashSet.add("hello");
        hashSet.add("hello java");

        hashSet.addAll(list1);

        hashSet.view();





















    }
}
