package com.quadrixm.ds.map;

import java.util.LinkedHashMap;

public class ExLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap map = new LinkedHashMap();

        map.put("a", "apple");
        map.put("b", "banana");

        System.out.println(map.get("b"));
    }
}
