package com.quadrixm.ds.map;

import java.util.HashMap;

public class ExHashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("a", "apple");
        map.put("b", "banana");

        System.out.println(map.get("b"));
    }
}
