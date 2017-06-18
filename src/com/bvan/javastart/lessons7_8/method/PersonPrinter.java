package com.bvan.javastart.lessons7_8.method;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonPrinter {

    public static void main(String[] args) {
        run();
    }

    private static int readInt(String var) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter " + var + ": ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // idle

            System.out.println("Sorry, illegal number");
            System.out.print("Enter " + var + ":");
        }

        return scanner.nextInt();
    }

    public static void run() {
        String name = readName();
        int age = readAge();
        String message = personInfo(name, age);
        System.out.println(message);

        new Scanner(System.in).hasNextInt();
    }

    private static int readAge() {
        int age = readInt("age");
        while (!isAge(age)) {
            System.out.println("Sorry, illegal age");
            age = readInt("age");
        }
        return age;
    }

    private static boolean isAge(int n) {
        return n >= 1 && n <= 120;
    }

    private static String readName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        return scanner.next();
    }

    public static String personInfo(String name, int age) {
        return "Hello, I'm " + name + ", " + age + " years old";
    }
}
