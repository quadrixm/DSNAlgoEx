package com.quadrixm.algo.sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExInsertionSort {

    public static void main(String[] args) {
        ArrayList A = new ArrayList();
        A.add(3);
        A.add(2);
        A.add(5);
        System.out.println(A);
        System.out.println(insertionSort(A));
    }

    public static ArrayList insertionSort(ArrayList<Integer> A) {

        // Iterating after the first element
        for (int j = 1; j < A.size(); j++) {
            // Get the second element in key
            Integer key = A.get(j);
            // Insert A[j] into the sorted array
            int i = j - 1;
            while (i >= 0 && A.get(i) > key) {
                A.add(i + 1, A.get(i));
                i = i -1;
            }
            A.add(i + 1, key);
        }

        return A;
    }
}
