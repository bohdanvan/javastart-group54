package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayMethodStoring {

    public static void main(String[] args) {
        int[] a = new int[10];
        fill(a, 1);
        System.out.println("a = " + Arrays.toString(a));
    }

    public static void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }
}
