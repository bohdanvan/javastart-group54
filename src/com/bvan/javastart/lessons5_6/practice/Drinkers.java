package com.bvan.javastart.lessons5_6.practice;

/**
 * @author bvanchuhov
 */
public class Drinkers {

    public static void main(String[] args) {
        int drinkers = 5;
        int beers = 3;

        for (int drinker = 1; drinker <= drinkers; drinker++) {
            // Action for a drinker

            for (int beer = 1; beer <= beers; beer++) {
                // Action with a beer by the drinker

                System.out.println("I'm " + drinker + " drinker. " +
                        "I've drunk " + beer + " beer");
            }

            System.out.println("Wonderful life");
        }

        System.out.println("Bar is closed");
    }
}
