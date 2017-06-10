package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraySequenceFiller {

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println(Arrays.toString(array)); // [0, 1, 2, 3, 4]
    }
}
