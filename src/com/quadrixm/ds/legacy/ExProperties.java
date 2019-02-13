package com.quadrixm.ds.legacy;

import java.util.Properties;

/**
 * Properties
 * Its is a subclass of Hashtable i.e it extends HashTable
 */
public class ExProperties {
    public static void main(String[] args) {
        // Creating property
        Properties prop = new Properties();
        // Setting properties
        prop.setProperty("name", "Quadri");
        prop.setProperty("gender", "Male");

        System.out.println(prop.getProperty("name"));

        // Since it extends hash table we can use HashTable function also
        prop.put("location", "World");
        System.out.println(prop.get("location"));
    }
}
