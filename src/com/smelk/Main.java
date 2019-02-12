package com.smelk;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        TestArrayList testArrayList = new TestArrayList();
        testArrayList.add("One");
        testArrayList.add("Two");
        testArrayList.add("Three");
        testArrayList.remove(1);
        System.out.println(testArrayList.get(0));
        System.out.println("Size: " + testArrayList.size());

        TestLinkedList testLinkedList = new TestLinkedList();
        testLinkedList.add("Five");
        testLinkedList.add("Nine");
        testLinkedList.add("Four");
        testLinkedList.add("Ten");
        testLinkedList.remove(2);
        System.out.println(testLinkedList.get(0));
        System.out.println("Size: " + testLinkedList.size());

    }
}