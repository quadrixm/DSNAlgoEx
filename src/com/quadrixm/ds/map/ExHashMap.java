package com.quadrixm.ds.map;

import java.util.HashMap;

/**
 * HashMap
 * It implements Map interface and stores its data in Hash Table
 */
public class ExHashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("a", "apple");
        map.put("b", "banana");

        System.out.println(map.get("b"));
    }
}
