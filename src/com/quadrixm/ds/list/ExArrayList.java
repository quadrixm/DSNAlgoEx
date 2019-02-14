package com.quadrixm.ds.list;

import java.util.ArrayList;

/**
 * ArrayList
 * It is an array but with dynamic size. You don't need to provide any size on creation
 * It dynamically enlarge and shrinks its size based on the item added and removed.
 * (Normal Array have fix size. i.e you need to define the size of the array on creating)
 *
 */
public class ExArrayList {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Integer(1));
        System.out.println(arrayList.get(0));
    }
}
