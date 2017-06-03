package com.bvan.javastart.lessons3_4.objects;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Hello";

        int length = s.length();
        System.out.println("length = " + length);

        char c = s.charAt(1);
        System.out.println("c = " + c);

        String substring = s.substring(1, 4);
        System.out.println("substring = " + substring);

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        boolean startsWithH = s.startsWith("H");
        System.out.println("startsWithH = " + startsWithH);

        boolean equals = s.equals("HELLO");
        System.out.println("equals = " + equals);

        boolean equalsIgnoreCase = s.equalsIgnoreCase("HELLO");
        System.out.println("equalsIgnoreCase = " + equalsIgnoreCase);

        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        String reversedString = s1.toString();
        System.out.println("reversedString = " + reversedString);
    }
}
