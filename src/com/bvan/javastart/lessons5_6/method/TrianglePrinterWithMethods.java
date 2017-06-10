package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class TrianglePrinterWithMethods {

    public static void main(String[] args) {
        printTriangle(5);
    }

    public static void printTriangle(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }

        for (int length = 1; length <= size; length++) {
            printLine(length);
        }
    }

    public static void printLine(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("negative length: " + length);
        }

        for (int i = 1; i <= length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
