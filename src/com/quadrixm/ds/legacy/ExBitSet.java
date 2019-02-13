package com.quadrixm.ds.legacy;

import java.util.BitSet;

/**
 * BitSet
 * It a class which hold arrays of bit values (i.e. ).
 * Its size are dynamic like Vector and ArrayList
 */
public class ExBitSet {
    public static void main(String[] args) {

        BitSet bitSet = new BitSet();
        BitSet bitSet1 = new BitSet();

        // Setting bit set
        bitSet.set(1);
        bitSet.set(3);
        bitSet1.set(2);
        bitSet1.set(3);

        // Applying all the and or bit operation on both bit set
        // Comment/Uncomment any one block to see the result
        bitSet.and(bitSet1);
        System.out.println("and: " + bitSet);

//        bitSet.or(bitSet1);
//        System.out.println("or: " + bitSet);
    }
}
