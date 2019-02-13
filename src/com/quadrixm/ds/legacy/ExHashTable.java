package com.quadrixm.ds.legacy;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * HashTable
 * It is a concrete implementation of a Dictionary.
 * It also implements Map Interface
 * It store key/value pair in hash table
 * (Hash table is table or array with index as some integer hash value and a reference to any value or null.
 * The integer hash value are created through hash function. So if we had to store a data corresponding to key
 * we calculate a hash value of the key using hash function and put the reference of the value
 * to the corresponding index of hash value of the key in the hash table.
 * Now in order to get the value we calculate the hash of the key and get value reference from that index
 *
 * Since hash values are short integer, chances are that multiple keys of string or number can have same hash value
 * and it will create conflict. For the chaining is used.
 * So let say two key "abc" and "abcxyz" have same hash value of 235 then at this index we store both reference in chain
 * or linked list i.e on reference contains the next reference reference.
 * There are other methods to resolve this conflict like
 * Re Hashing util conflict is resolved. or Open Addressing i.e store all elements in hash table only
 * )
 */
public class ExHashTable {

    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();

        hashtable.put("a", "apple");
        hashtable.put("b", "banana");

        System.out.println(hashtable.get("b"));

    }
}
