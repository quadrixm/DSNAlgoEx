package com.quadrixm.ds.legacy;

import java.util.Stack;


/**
 * Stack
 * It is sub class of vector (i.e. Stack class extends Vector class)
 * It implements Last In First Out (LIFO) logic. Something like a stack of plates where last plate put gets out first
 */
public class ExStack {
    public static void main(String[] args) {
        // Creating a stack
        Stack st = new Stack();

        st.push(new Integer(1));
        st.push(new Integer(2));
        st.push(new Integer(3));

        // It will print in reverse order first 3 then 2 and then 1
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }



}
