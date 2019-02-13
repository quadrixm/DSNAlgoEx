package com.quadrixm.ds.map;

import java.util.IdentityHashMap;

public class ExIdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap map = new IdentityHashMap();

        map.put("a", "apple");
        map.put("b", "banana");

        System.out.println(map.get("b"));
    }
}
