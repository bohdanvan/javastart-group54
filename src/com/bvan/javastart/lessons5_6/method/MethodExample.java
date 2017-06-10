package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    public static void main(String[] args) {
        int sum1 = 0;
        for (int n = 100; n <= 200; n++) {
            sum1 += n;
        }

        int sum2 = 0;
        for (int n = 300; n <= 350; n++) {
            sum2 += n;
        }

        int min;
        if (sum1 < sum2) {
            min = sum1;
        } else {
            min = sum2;
        }

        System.out.println("min = " + min);
    }
}
