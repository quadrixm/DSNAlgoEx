package com.quadrixm.ds.legacy;

import java.util.Iterator;
import java.util.Vector;

/**
 * Vector
 * It implements dynamic array.
 * It is similar to ArrayList ( It is java collection which size is not fixed. In array you need to define the size first )
 * The difference is:
 * Vector is synchronized. (i.e if one thread is working on Vector, no other thread can get a hold of it. )
 */
public class ExVector {
    public static void main(String[] args) {
        // Initializing vector with initialCapacity of 3 capacityIncrement of 2 (i.e if data exceed it can add 2 more elements also )
        // If we do not provide in initial capacity default will be 10. You can see by uncommenting below code

//        Vector v = new Vector();
//        System.out.println(v.capacity());

        // We could start with any initial capacity. It will keep on increasing.

        Vector v = new Vector(3, 2);

        System.out.println(v.capacity());

        v.add(new Integer(1));
        v.add(new Integer(1));
        v.add(new Integer(1));
        v.add(new Integer(1));
        v.add(new Integer(1));
        v.add(new Integer(1));
        v.add(new Integer(1));
        v.add(new Integer(1));
        v.add(new Integer(1));
        v.add(new Integer(1));
        v.add(new Integer(1));
        v.add(new Integer(1));
        // Getting value at position 10
        System.out.println(v.get(10));

        System.out.println(v.capacity());

        // Using Iterator
        Iterator itr = v.iterator();
        System.out.println(itr.next());
    }
}
