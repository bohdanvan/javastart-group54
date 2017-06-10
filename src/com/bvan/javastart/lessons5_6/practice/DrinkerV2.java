package com.bvan.javastart.lessons5_6.practice;

/**
 * @author bvanchuhov
 */
public class DrinkerV2 {

    public static void main(String[] args) {
        int beers = 10;

        System.out.println("I have " + beers + " beers");

        for (int beersLeft = beers - 1; beersLeft >= 0; beersLeft--) {
            System.out.println("I've drunk beer. "
                    + beersLeft + " beers are left.");
        }
        System.out.println("Wonderful life");
    }
}
