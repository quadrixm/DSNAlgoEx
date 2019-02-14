package com.quadrixm.ds.set;

import java.util.TreeSet;

/**
 * TreeSet
 * It stores set in sorted ascending order (Normal set stores data randomly)
 * We can customize the order
 */
public class ExTreeSet {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(new Integer(2));
        set.add(new Integer(1));

        // Print 1 first and then 2. Items are sorted.
        System.out.println(set);
    }
}
