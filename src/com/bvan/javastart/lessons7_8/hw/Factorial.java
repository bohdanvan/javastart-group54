package com.bvan.javastart.lessons7_8.hw;

import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(3)); // 6
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(0)); // 1

        System.out.println(factorial(10000));

//        System.out.println(factorial(-1));
    }

    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("overload or illegible number");
        }

        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
