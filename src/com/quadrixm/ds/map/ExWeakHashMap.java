package com.quadrixm.ds.map;

import java.util.WeakHashMap;

/**
 * Weak Hash Map
 * It stores weak reference to its keys.
 * Using weak reference means that if the someone is not getting value corresponding to its keys its get garbage collected
 */
public class ExWeakHashMap {
    public static void main(String[] args) {
        WeakHashMap map = new WeakHashMap();

        map.put("a", "apple");
        map.put("b", "banana");

        System.out.println(map.get("b"));
    }
}
