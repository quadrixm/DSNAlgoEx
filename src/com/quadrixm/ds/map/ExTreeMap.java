package com.quadrixm.ds.map;

import java.util.TreeMap;

public class ExTreeMap {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();

        map.put("a", "apple");
        map.put("b", "banana");

        System.out.println(map.get("b"));
    }
}
