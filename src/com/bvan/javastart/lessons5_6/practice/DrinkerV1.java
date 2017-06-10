package com.bvan.javastart.lessons5_6.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DrinkerV1 {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter beers: ");
        int beers = scanner.nextInt();

        for (int beer = 1; beer <= beers; beer++) {
            System.out.println("I've drunk " + beer + " beer");
        }

        System.out.println("Wonderful life");
    }
}
