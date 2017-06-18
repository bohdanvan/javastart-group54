package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayChangingInMethod {

    public static void main(String[] args) {
        int[] a = {10, 20};
        changeArray(a);
        System.out.println("a = " + Arrays.toString(a)); // [10, 20]
    }

    private static void changeArray(int[] a) {
        a = new int[10];
    }
}
