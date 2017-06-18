package com.bvan.javastart.lessons7_8.hw;

/**
 * @author bvanchuhov
 */
public class ArraySumCalculator {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{3, 3, 7}) == 13);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}
