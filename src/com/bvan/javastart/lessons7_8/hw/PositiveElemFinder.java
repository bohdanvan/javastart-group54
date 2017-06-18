package com.bvan.javastart.lessons7_8.hw;

/**
 * @author bvanchuhov
 */
public class PositiveElemFinder {

    public static void main(String[] args) {
        int[] array = {-10, -20, 5, 20, -4};
        System.out.println(findFirstPositiveElemIndex(array)); // 1

        int[] emptyArray = {};
        System.out.println(findFirstPositiveElemIndex(emptyArray));
    }

    public static int findFirstPositiveElemIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastPositiveElemIndex(int[] array) {
        for (int i = array.length; i >= 0; i--) {
            if (array[i] > 0) {
                return i;
            }
        }
        return -1;
    }
}
