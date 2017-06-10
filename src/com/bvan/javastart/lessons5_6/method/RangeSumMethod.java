package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class RangeSumMethod {

    public static void main(String[] args) {
        System.out.println(rangeSum(1, 3)); // 6
        System.out.println(rangeSum(0, 100)); // 5050
    }

    public static int rangeSum(int from, int to) {
        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
}
