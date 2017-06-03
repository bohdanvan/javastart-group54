package com.bvan.javastart.lessons3_4.types.floating_point;

/**
 * @author bvanchuhov
 */
public class MoneyStoring {

    public static void main(String[] args) {
        long money = 262777559;
        double moneyForOutput = (double)money / 10_000_000;
        System.out.println(moneyForOutput);
    }
}
