package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayReverseSequenceFiller {

    public static void main(String[] args) {
        int[] array = new int[5];

        int filler = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
            filler--;
        }

        System.out.println(Arrays.toString(array)); // [4, 3, 2, 1, 0]
    }
}
