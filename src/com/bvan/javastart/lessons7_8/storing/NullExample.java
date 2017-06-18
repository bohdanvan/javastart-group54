package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class NullExample {

    public static void main(String[] args) {
        String s = "";
        if (s != null) {
            System.out.println(s.length());
        }
    }

    public static void printLength(String s) {
        if (s == null) {
            throw new IllegalArgumentException("null value");
        }

        System.out.println(s.length());
    }
}
