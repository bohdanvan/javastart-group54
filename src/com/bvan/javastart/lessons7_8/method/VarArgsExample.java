package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class VarArgsExample {

    public static void main(String[] args) {
        int sum = sum(10, 20, 30);
        System.out.println(sum);
    }

    public static int sum(int... array) { // var-args
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}
