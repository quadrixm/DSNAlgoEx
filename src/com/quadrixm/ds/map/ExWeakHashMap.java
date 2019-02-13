package com.quadrixm.ds.map;

import java.util.WeakHashMap;

public class ExWeakHashMap {
    public static void main(String[] args) {
        WeakHashMap map = new WeakHashMap();

        map.put("a", "apple");
        map.put("b", "banana");

        System.out.println(map.get("b"));
    }
}
