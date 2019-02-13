package com.quadrixm.ds.set;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet
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
