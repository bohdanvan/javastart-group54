package com.bvan.javastart.lessons5_6.practice;

/**
 * @author bvanchuhov
 */
public class RangeSumCalculator {

    public static void main(String[] args) {
        // Input
        int from = 1;
        int to = 100;

        // BL
        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }

        // Output
        System.out.println("sum = " + sum);
    }
}
