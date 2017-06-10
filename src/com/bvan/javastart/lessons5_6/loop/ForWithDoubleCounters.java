package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class ForWithDoubleCounters {

    public static void main(String[] args) {
        for (int x = 1, y = 10; x < y; x++, y--) {
            System.out.println("x = " + x + ", y = " + y);
        }
    }
}
