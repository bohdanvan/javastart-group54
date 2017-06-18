package com.bvan.javastart.lessons7_8.hw;

/**
 * @author bvanchuhov
 */
public class EvensRangePrinter {

    public static void main(String[] args) {
        printEvensRange(10, 15); // 10 12 14
        printEvensRange(11, 15); // 12 14
        printEvensRange(10, 10); // 10
        printEvensRange(10, 5); // <nothing>
    }

    public static void printEvensRange(int first, int last) {
        if (first < last) {
            return;
        }

        if (first % 2 != 0) {
            first++;
        }
        for (int i = first; i <= last; i = i + 2) {
            System.out.print(" " + i);
        }
        System.out.println();

    }
}
