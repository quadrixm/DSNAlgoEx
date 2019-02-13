package com.quadrixm.ds.legacy;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Dictionary
 * It is much similar like Map
 * It is deprecated and Map should be used instead.
 * Hashtable is a concrete implementation of a Dictionary.
 */
public class ExDictionary {
    public static void main(String[] args) {

        Dictionary dict = new Hashtable();

        dict.put("a", "apple");

        System.out.println(dict.get("a"));
    }
}
