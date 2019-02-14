package com.quadrixm.ds.map;

import java.util.IdentityHashMap;

/**
 * IdentityHashMap
 * It is like HashMap, the difference is it uses reference to compare value
 * (i.e if it is the same object than only it will be equal)
 */
public class ExIdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap map = new IdentityHashMap();

        map.put("a", "apple");
        map.put("b", "banana");

        System.out.println(map.get("b"));
    }
}
