package com.quadrixm.ds.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet
 * It implements Set Interface (Set store unique data).
 * It uses hash table to store its data.
 * Inside HashSet are stored as HashMap with automated generated unique keys
 */
public class ExHashSet {
    public static void main(String [] args) {
        // Initializing Hash set
        HashSet set = new HashSet();

        // Add new element in set
        set.add(new Integer(1));
        set.add(new Integer(2));
        set.add(new Integer(3));
        set.add(new Integer(4));

        System.out.println(set);

        // Printing set data
        Iterator itr = set.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        System.out.println("Size: " + set.size());
    }
}
