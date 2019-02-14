package com.quadrixm.ds.list;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Linked List
 */
public class ExLinkedList {
    public static void main(String [] args) {
        LinkedList list = new LinkedList();
        list.add(new Integer(1));
        list.add(new Integer(2));

        System.out.println(list.getFirst());

        ListIterator itr = list.listIterator();
    }
}
