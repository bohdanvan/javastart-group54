package com.bvan.javastart.lessons5_6.practice.triangle;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 5;

        // Print a triangle
        for (int length = 1; length <= size; length++) {
            // Print line with specified length

            for (int i = 1; i <= length; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
