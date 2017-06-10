package com.bvan.javastart.lessons5_6.practice.triangle;

/**
 * @author bvanchuhov
 */
public class InterestingTrianglePrinter {

    public static void main(String[] args) {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int j = 1; j <= row; j++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */
