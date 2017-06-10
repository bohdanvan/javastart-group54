package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class ArrayMin {

    public static void main(String[] args) {
        int[] array = {20, 10, 30, 5};

        int min = array[0];
        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }

        System.out.println("min = " + min); // 5
    }
}
