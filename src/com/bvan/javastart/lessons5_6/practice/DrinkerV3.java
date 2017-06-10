package com.bvan.javastart.lessons5_6.practice;

/**
 * @author bvanchuhov
 */
public class DrinkerV3 {

    public static void main(String[] args) {
        int beers = 10;

        for (int beer = 1; beer <= beers; beer++) {
            System.out.println("I've drunk " + beer + " beer");

            if (beer > 5) {
                System.out.println("It's so hard...");
            }
        }

        System.out.println("Wonderful life");
    }
}
