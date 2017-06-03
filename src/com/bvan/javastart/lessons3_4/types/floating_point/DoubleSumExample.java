package com.bvan.javastart.lessons3_4.types.floating_point;

/**
 * @author bvanchuhov
 */
public class DoubleSumExample {

    public static void main(String[] args) {
        double d1 = 0.1 + 0.2;
        double d2 = 0.3 - 0.2;

        System.out.println(d1);
        System.out.println(d2);

        String s1 = String.format("%.3f", d1);
        System.out.println(s1);

        String s2 = String.format("%.3f", d2);
        System.out.println(s2);
    }
}
