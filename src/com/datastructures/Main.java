package com.datastructures;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.addBack(1);
        list.addBack(2);
        list.addBack(3);
        list.addBack(4);
        list.addFront(6);

        list.printList();
        System.out.println();

        list.deleteElement(4);
        list.deleteElement(3);

        list.printList();
        System.out.println();
    }
}
