package com.quadrixm.ds.map;

import java.util.TreeMap;

/**
 * TreeMap
 * Uses tree (i.e. red black tree, it is actually like binary tree with red black node constraints) to store the data
 * Stores Date in sorted order
 * By default ascending order. Which you can customize
 */
public class ExTreeMap {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();

        map.put("b", "banana");
        map.put("a", "apple");

        System.out.println(map);
    }
}
