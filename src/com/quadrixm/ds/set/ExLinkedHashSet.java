package com.quadrixm.ds.set;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet
 * It extends HashSet but doesn't define any function of own
 * It maintain the insertion order like linked list (i.e. ).
 * It uses it by storing the set data in a linked list
 *
 */
public class ExLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Integer(1));
        set.add(new Integer(2));

        System.out.println(set);
    }
}
